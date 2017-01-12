package com.fsp.api.utils;

import java.text.DecimalFormat;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/**
 * 根据经纬度计算GeoHash二进制编码
 * @author wuwei
 * 根据编码的长度获取的精度也是不一样的 编码长度越长精度越高
 */
public class GeoHashKit {
	private static int numbits = 6 * 5;
	final static char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8',
			'9', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'm', 'n', 'p',
			'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
	
	public static String BASE32 = "0123456789bcdefghjkmnpqrstuvwxyz"; 

	final static HashMap<Character, Integer> lookup = new HashMap<Character, Integer>();
	static {
		int i = 0;
		for (char c : digits) {
			lookup.put(c, i++);
		}
	}
	
	public GeoHashKit(){
		setMap();
	}

	/**
	 * 将Geohash字串解码成经纬值
	 * 
	 * @param geohash
	 *            待解码的Geohash字串
	 * @return 经纬值数组
	 */
	@SuppressWarnings("unused")
	private double[] decode(String geohash) {
		StringBuilder buffer = new StringBuilder();
		for (char c : geohash.toCharArray()) {
			int i = lookup.get(c) + 32;
			buffer.append(Integer.toString(i, 2).substring(1));
		}

		BitSet lonset = new BitSet();
		BitSet latset = new BitSet();

		// even bits
		int j = 0;
		for (int i = 0; i < numbits * 2; i += 2) {
			boolean isSet = false;
			if (i < buffer.length())
				isSet = buffer.charAt(i) == '1';
			lonset.set(j++, isSet);
		}

		// odd bits
		j = 0;
		for (int i = 1; i < numbits * 2; i += 2) {
			boolean isSet = false;
			if (i < buffer.length())
				isSet = buffer.charAt(i) == '1';
			latset.set(j++, isSet);
		}

		double lat = decode(latset, -90, 90);
		double lon = decode(lonset, -180, 180);

		DecimalFormat df = new DecimalFormat("0.00000");
		return new double[] { Double.parseDouble(df.format(lat)), Double.parseDouble(df.format(lon)) };
	}

	/**
	 * 根据二进制编码串和指定的数值变化范围，计算得到经/纬值
	 * 
	 * @param bs
	 *            经/纬二进制编码串
	 * @param floor
	 *            下限
	 * @param ceiling
	 *            上限
	 * @return 经/纬值
	 */
	private double decode(BitSet bs, double floor, double ceiling) {
		double mid = 0;
		for (int i = 0; i < bs.length(); i++) {
			mid = (floor + ceiling) / 2;
			if (bs.get(i))
				floor = mid;
			else
				ceiling = mid;
		}
		return mid;
	}

	/**
	 * 根据经纬值得到Geohash字串
	 * 
	 * @param lat
	 *            纬度值
	 * @param lon
	 *            经度值
	 * @return Geohash字串
	 */
	public static String encode(double lat, double lon) {
		BitSet latbits = getBits(lat, -90, 90);
		BitSet lonbits = getBits(lon, -180, 180);
		StringBuilder buffer = new StringBuilder();
		for (int i = 0; i < numbits; i++) {
			buffer.append((lonbits.get(i)) ? '1' : '0');
			buffer.append((latbits.get(i)) ? '1' : '0');
		}
		return base32(Long.parseLong(buffer.toString(), 2));
	}

	/**
	 * 将二进制编码串转换成Geohash字串
	 * 
	 * @param i
	 *            二进制编码串
	 * @return Geohash字串
	 */
	public static String base32(long i) {
		char[] buf = new char[65];
		int charPos = 64;
		boolean negative = (i < 0);
		if (!negative)
			i = -i;
		while (i <= -32) {
			buf[charPos--] = digits[(int) (-(i % 32))];
			i /= 32;
		}
		buf[charPos] = digits[(int) (-i)];

		if (negative)
			buf[--charPos] = '-';
		return new String(buf, charPos, (65 - charPos));
	}

	/**
	 * 得到经/纬度对应的二进制编码
	 * 
	 * @param lat
	 *            经/纬度
	 * @param floor
	 *            下限
	 * @param ceiling
	 *            上限
	 * @return 二进制编码串
	 */
	private static BitSet getBits(double lat, double floor, double ceiling) {
		BitSet buffer = new BitSet(numbits);
		for (int i = 0; i < numbits; i++) {
			double mid = (floor + ceiling) / 2;
			if (lat >= mid) {
				buffer.set(i);
				floor = mid;
			} else {
				ceiling = mid;
			}
		}
		return buffer;
	}
	
	/***********************获取九个的矩形编码****************************************/
	
	public static Map<String, String> BORDERS = new HashMap<String, String>();
	public static Map<String, String> NEIGHBORS = new HashMap<String, String>();
	
	public static void setMap() {
		NEIGHBORS.put("right:even", "bc01fg45238967deuvhjyznpkmstqrwx");
		NEIGHBORS.put("left:even", "238967debc01fg45kmstqrwxuvhjyznp");
		NEIGHBORS.put("top:even", "p0r21436x8zb9dcf5h7kjnmqesgutwvy");
		NEIGHBORS.put("bottom:even", "14365h7k9dcfesgujnmqp0r2twvyx8zb");
		
		NEIGHBORS.put("right:odd", "p0r21436x8zb9dcf5h7kjnmqesgutwvy");
		NEIGHBORS.put("left:odd", "14365h7k9dcfesgujnmqp0r2twvyx8zb");
		NEIGHBORS.put("top:odd", "bc01fg45238967deuvhjyznpkmstqrwx");
		NEIGHBORS.put("bottom:odd", "238967debc01fg45kmstqrwxuvhjyznp");
		
		BORDERS.put("right:even", "bcfguvyz");
		BORDERS.put("left:even", "0145hjnp");
		BORDERS.put("top:even", "prxz");
		BORDERS.put("bottom:even", "028b");
		
		BORDERS.put("right:odd", "prxz");
		BORDERS.put("left:odd", "028b");
		BORDERS.put("top:odd", "bcfguvyz");
		BORDERS.put("bottom:odd", "0145hjnp");
		
	}
	
	/**获取九个点的矩形编码
	 * @param geohash
	 * @return
	 */
	public static String[] getGeoHashExpand(String geohash){
		try {
			System.out.println("=========	"+geohash);
			
			String geohashTop = calculateAdjacent(geohash, "top");
			System.out.println("=========	"+geohashTop);
			
			String geohashBottom = calculateAdjacent(geohash, "bottom");
			System.out.println("=========	"+geohashBottom);
			
			String geohashRight = calculateAdjacent(geohash, "right");
			System.out.println("=========	"+geohashRight);
			
			String geohashLeft = calculateAdjacent(geohash, "left");
			System.out.println("=========	"+geohashLeft);
			
			String geohashTopLeft = calculateAdjacent(geohashLeft, "top");
			System.out.println("=========	"+geohashTopLeft);
			
			String geohashTopRight = calculateAdjacent(geohashRight, "top");
			System.out.println("=========	"+geohashTopRight);
			
			String geohashBottomRight = calculateAdjacent(geohashRight, "bottom");
			System.out.println("=========	"+geohashBottomRight);
			
			String geohashBottomLeft = calculateAdjacent(geohashLeft, "bottom");
			System.out.println("=========	"+geohashBottomLeft);
			String[] expand = {geohash, geohashTop, geohashBottom, geohashRight, geohashLeft, geohashTopLeft, geohashTopRight, geohashBottomRight, geohashBottomLeft};
			return expand;
		} catch (Exception e) {
			return null;
		}
	}
	
	/**分别计算每个点的矩形编码
	 * @param srcHash
	 * @param dir
	 * @return
	 */
	public static String calculateAdjacent(String srcHash, String dir) {
		srcHash = srcHash.toLowerCase();
		char lastChr = srcHash.charAt(srcHash.length()-1);
		int a = srcHash.length()%2;
		String type = (a>0)?"odd":"even";
		String base = srcHash.substring(0,srcHash.length()-1);
		if (BORDERS.get(dir+":"+type).indexOf(lastChr)!=-1){
			base = calculateAdjacent(base, dir);
		}
		base = base + BASE32.toCharArray()[(NEIGHBORS.get(dir+":"+type).indexOf(lastChr))];
		return base;
	} 
	
	@Deprecated
	public static void expandLngLat(String geohash, int len){
		boolean is_even = true;
		double[] lat = new double[3]; 
		double[] lon = new double[3]; 
		lat[0] = -90.0; 
		lat[1] = 90.0;
		lon[0] = -180.0;
		lon[1] = 180.0;
		char[] geohashChar = geohash.toCharArray();
		int[] BITS = {16, 8, 4, 2, 1};
		for (int i = 0; i < geohashChar.length; i++) {
			char c = geohashChar[i];
			int cd = BASE32.indexOf(c);
			for (int j = 0; j < 5; j++) {
				int mask = BITS[j];
				if (is_even) {
					refine_interval(lon, cd, mask);
				} else {
					refine_interval(lat, cd, mask);
				}
				is_even = !is_even;
			}
		}
		lat[2] = (lat[0] + lat[1])/2;
		lon[2] = (lon[0] + lon[1])/2; 
	}
	
	@Deprecated
	public static void refine_interval(double[] interval, int cd, int mask){
		 if ((cd & mask)>0){
			 interval[0] = (interval[0] + interval[1])/2;
		 }else{
			 interval[1] = (interval[0] + interval[1])/2; 
		 }
	}
	
//	public static void main(String[] args) {
//		new GeoHashKit();
//		
//		/*获取的geohash多少位，位数越长，精度越准*/
//		int geohashLen = 6;
//		double lat = 39.90403;
//		double lon = 116.407526; //需要查询经纬度，目前指向的是BeiJing
//		
//		/*获取中心点的geohash*/
//		String geohash = encode(lat, lon).substring(0, geohashLen);
//		
//		/*获取所有的矩形geohash， 一共是九个 ，包含中心点,打印顺序请参考图2*/
//		String[] result = getGeoHashExpand(geohash);
//		System.out.println(result);
//		
//	}

}
