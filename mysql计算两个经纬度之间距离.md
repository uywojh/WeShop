

公式如下，单位米：
第一点经纬度：lng1 lat1
第二点经纬度：lng2 lat2
round(6378.138*2*asin(sqrt(pow(sin( (lat1*pi()/180-lat2*pi()/180)/2),2)+cos(lat1*pi()/180)*cos(lat2*pi()/180)* pow(sin( (lng1*pi()/180-lng2*pi()/180)/2),2)))*1000)

例如：
SELECT store_id,lng,lat, ROUND(6378.138*2*ASIN(SQRT(POW(SIN((22.299439*PI()/180-lat*PI()/180)/2),2)+COS(22.299439*PI()/180)*COS(lat*PI()/180)*POW(SIN((114.173881*PI()/180-lng*PI()/180)/2),2)))*1000) AS juli
FROM store_info
ORDER BY juli DESC
LIMIT 316