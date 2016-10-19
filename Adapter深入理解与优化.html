<html lang="en"><head>
    <meta charset="UTF-8">
    <title></title>
<style id="system" type="text/css">h1,h2,h3,h4,h5,h6,p,blockquote {    margin: 0;    padding: 0;}body {    font-family: "Helvetica Neue", Helvetica, "Hiragino Sans GB", Arial, sans-serif;    font-size: 13px;    line-height: 18px;    color: #737373;    margin: 10px 13px 10px 13px;}a {    color: #0069d6;}a:hover {    color: #0050a3;    text-decoration: none;}a img {    border: none;}p {    margin-bottom: 9px;}h1,h2,h3,h4,h5,h6 {    color: #404040;    line-height: 36px;}h1 {    margin-bottom: 18px;    font-size: 30px;}h2 {    font-size: 24px;}h3 {    font-size: 18px;}h4 {    font-size: 16px;}h5 {    font-size: 14px;}h6 {    font-size: 13px;}hr {    margin: 0 0 19px;    border: 0;    border-bottom: 1px solid #ccc;}blockquote {    padding: 13px 13px 21px 15px;    margin-bottom: 18px;    font-family:georgia,serif;    font-style: italic;}blockquote:before {    content:"C";    font-size:40px;    margin-left:-10px;    font-family:georgia,serif;    color:#eee;}blockquote p {    font-size: 14px;    font-weight: 300;    line-height: 18px;    margin-bottom: 0;    font-style: italic;}code, pre {    font-family: Monaco, Andale Mono, Courier New, monospace;}code {    background-color: #fee9cc;    color: rgba(0, 0, 0, 0.75);    padding: 1px 3px;    font-size: 12px;    -webkit-border-radius: 3px;    -moz-border-radius: 3px;    border-radius: 3px;}pre {    display: block;    padding: 14px;    margin: 0 0 18px;    line-height: 16px;    font-size: 11px;    border: 1px solid #d9d9d9;    white-space: pre-wrap;    word-wrap: break-word;}pre code {    background-color: #fff;    color:#737373;    font-size: 11px;    padding: 0;}@media screen and (min-width: 768px) {    body {        width: 748px;        margin:10px auto;    }}</style><style id="custom" type="text/css"></style></head>
<body><p></p><h1>Android高手进阶：Adapter深入理解与优化</h1>
<p></p>
<p></p><div class="msg">
<p></p>
<p></p><div>2015-07-15 17:17  wuwei  eoeandroid  字号：<span class="f14-b"><a href="javascript:setfont(12);" target="_self">T</a></span> | <span class="f16-b"><a href="javascript:setfont(16);" target="_self">T</a></span></div>
<p></p>
<p></p><div class="artHd" id="books" style="padding:5px 25px;display:none;"></div>
<p></p>
<p></p><div class="fav"><a href="javascript:favorBox('open');" title="一键收藏，随时查看，分享好友！" target="_self"><img src="http://images.51cto.com/images/art/newart1012/images/Fav.gif" alt="一键收藏，随时查看，分享好友！" border="0"></a></div>
</div>
<p></p>
<p></p><div class="brieftext">
<p></p>
<p class="f14 green">一般是针对包含多个元素的View，如ListView，GridView，ExpandableListview，的时候我们是给其设置一个Adapter。Adapter是与View之间提供数据的桥梁，也是提供每个Item的视图桥梁。</p>

<p></p>
</div>
<!--  <div style="border-left:5px solid #4065aa;height:25px; line-height:25px;margin-top:10px;background:#eef7ff;padding-left:10px;">
<a style="text-decoration: none;color:red" target="_blank" href="http://server.51cto.com/exp/OpenPower/">IBM POWER8通过一年充分融入了“开放”基因，现在有哪些成效？快来注册观看直播，一起拥抱开源的力量。</a>
</div> -->



<p></p>
<p>
</p>
<p></p><div class="tag bgF8F8F8" id="indexlist" style="display:none;">
<p></p>
<p></p><ul id="indexliststr">
</ul>
<br class="dle">
</div>
<p></p>
<p></p><div class="content bgF8F8F8 f14">
<p></p>
<p></p><div id="content">
<p></p>
<p></p><p></p><p style="text-align: left; line-height: 26px">一般是针对包含多个元素的View，如ListView，GridView，ExpandableListview，的时候我们是给其设置一个Adapter。Adapter是与View之间提供数据的桥梁，也是提供每个Item的视图桥梁。</p>
<p></p>
<p></p><p style="text-align: center; line-height: 26px"><font color="#000000"><font face="Arial"><strong><img class="fit-image" onload="javascript:if(this.width>498)this.width=498;" onmousewheel="javascript:return big(this)" id="aimg_O99uX" style="cursor: pointer" alt="" _load="1" src="http://img.blog.csdn.net/20140708144337437?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQveXp6c3Q=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center" height="322" border="0" width="498"></strong></font></font></p>
<p></p>
<p></p><p style="text-align: left; line-height: 26px">以ListView为例，其工作原理为:</p>
<p></p>
<p></p><p>● ListView针对List中每个item， adapter都会调用一个getView的方法获得布局视图</p>
<p></p>
<p></p><p>●我们一般会Inflate一个新的View，填充数据并返回显示</p>
<p></p>
<p></p><p>当然如果我们的Item很多话（比如上万个），都会新建一个View吗？很明显这样内存是接受不了的，Google也不会这么做，Android中有个叫做Recycler的构件，下图是他的工作原理：</p>
<p></p>
<p></p><p style="text-align: center; line-height: 26px"><font color="#000000"><font face="Arial"><img class="fit-image" onload="javascript:if(this.width>498)this.width=498;" onmousewheel="javascript:return big(this)" id="aimg_W222d" style="cursor: pointer" alt="" _load="1" src="http://img.blog.csdn.net/20140708144236562?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQveXp6c3Q=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center" height="410" border="0" width="498"></font></font></p>
<p></p>
<p></p><p style="text-align: left; line-height: 26px">很明显，无论数据中是多少个item，在显示上Recycler只存储其中可见的View在内存中。当向下滑动时，顶部不可见Item直接回移动到下方再次填充数据变为新增项。这样就不用每次都新建一个View了。</p>
<p></p>
<p></p><p>这个也就是我们在Adapter中常见的getView方法的调用，对应此方法我们就能看出，convertView就是每一Item在Recyler之前的布局视图。</p>
<p></p>
<p></p><ul>
    <li>public View getView(int position, View convertView, ViewGrouppare</li>
</ul>
<p></p>
<p></p><p>所以，Android已经给我们提供了Recycler机制了，我们就应该利用此机制，而不是每次都去inflate一个View。</p>
<p></p>
<p></p><p>Example</p>
<p></p>
<p></p><p>Don’t</p>
<p></p>
<p></p><pre><ol class="dp-j"><li class="alt"><span><span class="keyword">public</span><span>&nbsp;View&nbsp;getView(</span><span class="keyword">int</span><span>&nbsp;position,&nbsp;View&nbsp;convertView,&nbsp;ViewGroupparent){&nbsp;&nbsp;&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;convertView&nbsp;=&nbsp;LayoutInflater.from(mContext).inflate(R.layout.item_view,<span class="keyword">null</span><span>);&nbsp;&nbsp;&nbsp;</span></span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;<span class="comment">//dosomething…&nbsp;&nbsp;</span><span>&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">return</span><span>&nbsp;converView;&nbsp;&nbsp;&nbsp;</span></span></li><li class="alt"><span>}&nbsp;&nbsp;&nbsp;</span></li></ol></pre>
<p></p>
<p></p><p style="text-align: left; line-height: 26px">Do</p>
<p></p>
<p></p><pre><ol class="dp-j"><li class="alt"><span><span class="keyword">public</span><span>&nbsp;View&nbsp;getView(</span><span class="keyword">int</span><span>&nbsp;position,&nbsp;View&nbsp;convertView,&nbsp;ViewGroupparent){&nbsp;&nbsp;&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">if</span><span>&nbsp;(convertView&nbsp;==</span><span class="keyword">null</span><span>)&nbsp;{&nbsp;&nbsp;&nbsp;</span></span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;convertView&nbsp;=LayoutInflater.from(mContext).inflate(R.layout.item_view,&nbsp;<span class="keyword">null</span><span>);&nbsp;&nbsp;&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;&nbsp;</span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;<span class="comment">//dosomething…&nbsp;&nbsp;</span><span>&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">return</span><span>&nbsp;converView;&nbsp;&nbsp;&nbsp;</span></span></li><li class="alt"><span>}&nbsp;&nbsp;&nbsp;</span></li></ol></pre>
<p></p>
<p></p><p style="text-align: left; line-height: 26px"><strong>ViewHolder的作用</strong></p>
<p></p>
<p></p><p>之前所说的Recycler模式是为了解决重复inflate时候造成的View资源浪费，还哪有什么方法何可再次优化我们的性能吗？答案是Yes。</p>
<p></p>
<p></p><p>我们还是从getView中的每一个方法调用去查看，发现其实我们拿到convertView的时候，每次都会根据这个布局去findViewById。如下，使我们通常的写法：</p>
<p></p>
<p></p><p>findViewById是在解析layout.xml布局那种其中的子View，解析xml是一个力气活，所以Google也建议我们将这个费力不讨好的活优化起来，所以提出了ViewHolder的概念。</p>
<p></p>
<p></p><p>即，使用一个静态类，保存xml中的各个子View的引用关系，这样就不必要每次都去解析xml了。如下：就是针对上面代码写的一个ViewHolder</p>
<p></p>
<p></p><pre><ol class="dp-j"><li class="alt"><span><span class="keyword">if</span><span>&nbsp;(convertView&nbsp;==&nbsp;</span><span class="keyword">null</span><span>)&nbsp;{&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;convertView&nbsp;=&nbsp;mInflater.inflate(R.layout.item_view,&nbsp;<span class="keyword">null</span><span>);&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></span></li><li class="alt"><span>}&nbsp;&nbsp;&nbsp;&nbsp;</span></li><li><span>TextView&nbsp;titleTextView&nbsp;=&nbsp;(TextView)&nbsp;convertView.findViewById(R.id.text));&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></li><li class="alt"><span>ImageView&nbsp;iconImageView&nbsp;=&nbsp;(ImageView)convertView.findViewButId(&nbsp;R.id.icon));&nbsp;&nbsp;&nbsp;&nbsp;</span></li><li><span><span class="comment">//DoSomething…&nbsp;&nbsp;</span><span>&nbsp;</span></span></li></ol></pre>
<p></p>
<p></p><p>findViewById是在解析layout.xml布局那种其中的子View，解析xml是一个力气活，所以Google也建议我们将这个费力不讨好的活优化起来，所以提出了ViewHolder的概念。</p>
<p></p>
<p></p><p>即，使用一个静态类，保存xml中的各个子View的引用关系，这样就不必要每次都去解析xml了。如下：就是针对上面代码写的一个ViewHolder</p>
<p></p>
<p></p><pre><ol class="dp-j"><li class="alt"><span><span class="keyword">static</span><span>&nbsp;</span><span class="keyword">class</span><span>&nbsp;ViewHolder&nbsp;{&nbsp;&nbsp;&nbsp;&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;TextView&nbsp;titleTextView;&nbsp;&nbsp;&nbsp;&nbsp;</span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;ImageView&nbsp;iconImageView;&nbsp;&nbsp;&nbsp;&nbsp;</span></li><li><span>}&nbsp;&nbsp;&nbsp;&nbsp;</span></li></ol></pre>
<p></p>
<p></p><p style="text-align: left; line-height: 26px">但是，在getView方法中我们只能拿到三个参数，position、convertView、viewGroup是拿不到我们自定义的ViewHolder的。所以，我们希望通过convertView拿到ViewHolder只能将其放在tag里。</p>
<p></p>
<p></p><p>下面是一个完整的ViewHolder使用exmaple:</p>
<p></p>
<p></p><pre><ol class="dp-j"><li class="alt"><span><span class="keyword">public</span><span>&nbsp;View&nbsp;getView(</span><span class="keyword">int</span><span>&nbsp;position,&nbsp;View&nbsp;convertView,&nbsp;ViewGroup&nbsp;parent)&nbsp;{&nbsp;&nbsp;&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;ViewHolder&nbsp;holder;&nbsp;&nbsp;&nbsp;</span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">if</span><span>&nbsp;(convertView&nbsp;==&nbsp;</span><span class="keyword">null</span><span>)&nbsp;{&nbsp;&nbsp;&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;convertView&nbsp;=&nbsp;mInflater.inflate(R.layout.item_view,&nbsp;<span class="keyword">null</span><span>);&nbsp;&nbsp;&nbsp;</span></span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;holder&nbsp;=&nbsp;<span class="keyword">new</span><span>&nbsp;ViewHolder();&nbsp;&nbsp;&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;holder.titleTextView&nbsp;=&nbsp;(TextView)&nbsp;convertView.findViewById(R.id.text);&nbsp;&nbsp;&nbsp;</span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;holder.iconImageView&nbsp;=&nbsp;(ImageView)&nbsp;convertView.findViewById(R.id.icon);&nbsp;&nbsp;&nbsp;</span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;convertView.setTag(holder);&nbsp;&nbsp;&nbsp;</span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;<span class="keyword">else</span><span>&nbsp;{&nbsp;&nbsp;&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;holder&nbsp;=&nbsp;(ViewHolder)&nbsp;convertView.getTag();&nbsp;&nbsp;&nbsp;</span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;&nbsp;</span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;holder.titleTextView.setText(DATA[pos].title);&nbsp;&nbsp;&nbsp;</span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;holder.iconImageView.setImageBitmap(DATA[pos].bitmap);&nbsp;&nbsp;&nbsp;</span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">return</span><span>&nbsp;convertView;&nbsp;&nbsp;&nbsp;</span></span></li><li class="alt"><span>}&nbsp;&nbsp;&nbsp;</span></li><li><span>&nbsp;&nbsp;&nbsp;</span></li><li class="alt"><span><span class="keyword">static</span><span>&nbsp;</span><span class="keyword">class</span><span>&nbsp;ViewHolder&nbsp;{&nbsp;&nbsp;&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;TextView&nbsp;titleTextView;&nbsp;&nbsp;&nbsp;</span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;ImageView&nbsp;iconImageView;&nbsp;&nbsp;&nbsp;</span></li><li><span>}&nbsp;&nbsp;&nbsp;</span></li></ol></pre>
<p></p>
<p></p><p style="text-align: left; line-height: 26px">Tips. Support.v7中的RecyclerView 就是采用了此思想来制作的。</p>
<p></p>
<p></p><p><strong>多个类型的ViewType</strong></p>
<p></p>
<p></p><p>当我们在Adapter中调用方法getView的时候，如果整个列表中的Item View如果有多种类型布局，如：</p>
<p></p>
<p></p><p style="text-align: center; line-height: 26px"><font color="#000000"><font face="Arial"><img class="fit-image" onload="javascript:if(this.width>498)this.width=498;" onmousewheel="javascript:return big(this)" id="aimg_Gj3GR" alt="" _load="1" src="http://img.blog.csdn.net/20140708144345234?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQveXp6c3Q=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center" height="598" border="0" width="480"></font></font></p>
<p></p>
<p></p><p style="text-align: left; line-height: 26px">我们继续使用convertView来将数据从新填充貌似不可行了，因为每次返回的convertView类型都不一样，无法重用。</p>
<p></p>
<p></p><p style="text-align: left; line-height: 26px">Android在设计上的时候，也想到了这点。所以，在adapter中预留的两个方法。</p>
<p></p>
<p></p><ul>
    <li>public int getItemViewType(int position) ;&nbsp;</li>
</ul>
<p></p>
<p></p><ul>
    <li>public int getViewTypeCount();<span id="1405476597386E" style="display: none">&nbsp;</span></li>
</ul>
<p></p>
<p></p><p>只需要重新这两个方法，设置一下ItemViewType的个数和判断方法，Recycler就能有选择性的给出不同的convertView了。&nbsp;</p>
<p></p>
<p></p><p>&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;Example：</p>
<p></p>
<p></p><pre><ol class="dp-j"><li class="alt"><span><span class="annotation">@Override</span><span>&nbsp;&nbsp;&nbsp;</span></span></li><li><span><span class="keyword">public</span><span>&nbsp;intgetItemViewType(</span><span class="keyword">int</span><span>&nbsp;position)&nbsp;{&nbsp;&nbsp;&nbsp;</span></span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">if</span><span>&nbsp;(DATA[pos].type&nbsp;==&nbsp;</span><span class="number">0</span><span>)&nbsp;{&nbsp;&nbsp;&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">return</span><span>&nbsp;</span><span class="number">0</span><span>;&nbsp;&nbsp;&nbsp;</span></span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;<span class="keyword">else</span><span>&nbsp;{&nbsp;&nbsp;&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">return</span><span>&nbsp;</span><span class="number">1</span><span>;&nbsp;&nbsp;&nbsp;</span></span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;&nbsp;</span></li><li><span>}&nbsp;&nbsp;&nbsp;</span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;</span></li><li><span><span class="annotation">@Override</span><span>&nbsp;&nbsp;&nbsp;</span></span></li><li class="alt"><span><span class="keyword">public</span><span>&nbsp;</span><span class="keyword">int</span><span>&nbsp;getViewTypeCount()&nbsp;{&nbsp;&nbsp;&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">return</span><span>&nbsp;</span><span class="number">2</span><span>;&nbsp;&nbsp;&nbsp;</span></span></li><li class="alt"><span>}&nbsp;&nbsp;&nbsp;</span></li><li><span>&nbsp;&nbsp;&nbsp;</span></li><li class="alt"><span><span class="annotation">@Override</span><span>&nbsp;&nbsp;&nbsp;</span></span></li><li><span><span class="keyword">public</span><span>&nbsp;View&nbsp;getView(</span><span class="keyword">int</span><span>&nbsp;position,&nbsp;View&nbsp;convertView,&nbsp;ViewGroup&nbsp;arg2)&nbsp;{&nbsp;&nbsp;&nbsp;</span></span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;TitleViewHolder&nbsp;titleHolder;&nbsp;&nbsp;&nbsp;</span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;InfoViewHolder&nbsp;infoHolder;&nbsp;&nbsp;&nbsp;</span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">int</span><span>&nbsp;type&nbsp;=&nbsp;getItemViewType(position);&nbsp;&nbsp;&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;</span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">if</span><span>&nbsp;(convertView&nbsp;==&nbsp;</span><span class="keyword">null</span><span>)&nbsp;{&nbsp;&nbsp;&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">switch</span><span>&nbsp;(type)&nbsp;{&nbsp;&nbsp;&nbsp;</span></span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">case</span><span>&nbsp;</span><span class="number">0</span><span>:&nbsp;&nbsp;&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;convertView&nbsp;=&nbsp;mInflater.inflate(R.layout.item_view,&nbsp;<span class="keyword">null</span><span>);&nbsp;&nbsp;&nbsp;</span></span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;titleHolder&nbsp;=&nbsp;<span class="keyword">new</span><span>&nbsp;TitleViewHolder();&nbsp;&nbsp;&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;titleHolder.titleTextView&nbsp;=&nbsp;(TextView)&nbsp;convertView.findViewById(R.id.text);&nbsp;&nbsp;&nbsp;</span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;titleHolder.iconImageView&nbsp;=&nbsp;(ImageView)&nbsp;convertView.findViewById(R.id.icon);&nbsp;&nbsp;&nbsp;</span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;convertView.setTag(titleHolder);&nbsp;&nbsp;&nbsp;</span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">break</span><span>;&nbsp;&nbsp;&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">case</span><span>&nbsp;</span><span class="number">1</span><span>:&nbsp;&nbsp;&nbsp;</span></span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;convertView&nbsp;=&nbsp;mInflater.inflate(R.layout.item_view2,&nbsp;<span class="keyword">null</span><span>);&nbsp;&nbsp;&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;infoHolder&nbsp;=&nbsp;<span class="keyword">new</span><span>&nbsp;InfoViewHolder();&nbsp;&nbsp;&nbsp;</span></span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;infoHolder.titleTextView&nbsp;=&nbsp;(TextView)&nbsp;convertView.findViewById(R.id.text);&nbsp;&nbsp;&nbsp;</span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;convertView.setTag(infoHolder);&nbsp;&nbsp;&nbsp;</span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">break</span><span>;&nbsp;&nbsp;&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;&nbsp;</span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;<span class="keyword">else</span><span>&nbsp;{&nbsp;&nbsp;&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">switch</span><span>&nbsp;(type)&nbsp;{&nbsp;&nbsp;&nbsp;</span></span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">case</span><span>&nbsp;</span><span class="number">0</span><span>:&nbsp;&nbsp;&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;titleHolder&nbsp;=&nbsp;(TitleViewHolder)&nbsp;convertView.getTag();&nbsp;&nbsp;&nbsp;</span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">break</span><span>;&nbsp;&nbsp;&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">case</span><span>&nbsp;</span><span class="number">1</span><span>:&nbsp;&nbsp;&nbsp;</span></span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;infoHolder&nbsp;=&nbsp;(InfoViewHolder)&nbsp;convertView.getTag();&nbsp;&nbsp;&nbsp;</span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">break</span><span>;&nbsp;&nbsp;&nbsp;</span></span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;&nbsp;</span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;&nbsp;</span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">switch</span><span>&nbsp;(type)&nbsp;{&nbsp;&nbsp;&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">case</span><span>&nbsp;</span><span class="number">0</span><span>:&nbsp;&nbsp;&nbsp;</span></span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;titleHolder.titleTextView.setText(DATA[pos].title);&nbsp;&nbsp;&nbsp;</span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">break</span><span>;&nbsp;&nbsp;&nbsp;</span></span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">case</span><span>&nbsp;</span><span class="number">1</span><span>:&nbsp;&nbsp;&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;infoHolder.titleTextView.setText(DATA[pos].title);&nbsp;&nbsp;&nbsp;</span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;infoHolder.iconImageView.setImageBitmap(DATA[pos].bitmap);&nbsp;&nbsp;&nbsp;</span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">break</span><span>;&nbsp;&nbsp;&nbsp;</span></span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;&nbsp;</span></li><li><span>&nbsp;&nbsp;&nbsp;</span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">return</span><span>&nbsp;convertView;&nbsp;&nbsp;&nbsp;</span></span></li><li><span>}&nbsp;&nbsp;&nbsp;</span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;</span></li><li><span><span class="keyword">static</span><span>&nbsp;</span><span class="keyword">class</span><span>&nbsp;TitleViewHolder&nbsp;{&nbsp;&nbsp;&nbsp;</span></span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">public</span><span>&nbsp;ImageView&nbsp;iconImageView;&nbsp;&nbsp;&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">public</span><span>&nbsp;TextView&nbsp;titleTextView;&nbsp;&nbsp;&nbsp;</span></span></li><li class="alt"><span>}&nbsp;&nbsp;&nbsp;</span></li><li><span>&nbsp;&nbsp;&nbsp;</span></li><li class="alt"><span><span class="keyword">static</span><span>&nbsp;</span><span class="keyword">class</span><span>&nbsp;InfoViewHolder&nbsp;{&nbsp;&nbsp;&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;TextView&nbsp;titleTextView;&nbsp;&nbsp;&nbsp;</span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;ImageView&nbsp;iconImageView;&nbsp;&nbsp;&nbsp;</span></li><li><span>}&nbsp;&nbsp;&nbsp;</span></li></ol></pre>
<p></p>
<p></p><p style="text-align: left; line-height: 26px"><font color="#000000"><font face="Arial"><strong>NotifyDataSetChanged刷新机制</strong></font></font></p>
<p></p>
<p></p><p style="text-align: left; line-height: 26px">当ListView中的数据发生了改变，我们希望刷新ListView中的View时，我们一般会调用NotifyDataSetChanged来刷新ListView。看一下它的源码：</p>
<p></p>
<p></p><pre><ol class="dp-j"><li class="alt"><span><span class="keyword">public</span><span>&nbsp;</span><span class="keyword">void</span><span>&nbsp;notifyChanged()&nbsp;{&nbsp;&nbsp;&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">synchronized</span><span>&nbsp;(mObservers)&nbsp;{&nbsp;&nbsp;&nbsp;</span></span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="comment">//&nbsp;向每一个子View发送onChanged&nbsp;&nbsp;</span><span>&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">for</span><span>&nbsp;(</span><span class="keyword">int</span><span>&nbsp;i&nbsp;=&nbsp;mObservers.size()&nbsp;-&nbsp;</span><span class="number">1</span><span>;&nbsp;i&nbsp;&gt;=&nbsp;</span><span class="number">0</span><span>;&nbsp;i--)&nbsp;{&nbsp;&nbsp;&nbsp;</span></span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;mObservers.get(i).onChanged();&nbsp;&nbsp;&nbsp;</span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;&nbsp;</span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;&nbsp;</span></li><li><span>}&nbsp;&nbsp;&nbsp;</span></li></ol></pre>
<p></p>
<p></p><p style="text-align: left; line-height: 26px">发 现它针对每一个子View都做了刷新，当然，如果我们的数据都变量还可以理解。但是，一般条件下，我们需要更新的View不多。频繁的调用 NotifyDataSetChanged方法，刷新整个界面不合适。这样会把界面上显示的所有item都全部重绘一次，即使只有一个view的内容发生 了变化。</p>
<p></p>
<p></p><p>所以，我们可以写一个update的方法，来单独刷新一个View</p>
<p></p>
<p></p><pre><ol class="dp-j"><li class="alt"><span><span class="keyword">private</span><span>&nbsp;</span><span class="keyword">void</span><span>&nbsp;updateView(</span><span class="keyword">int</span><span>&nbsp;itemIndex){&nbsp;&nbsp;&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;intvisiblePosition&nbsp;=&nbsp;yourListView.getFirstVisiblePosition();&nbsp;&nbsp;&nbsp;</span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;Viewv&nbsp;=&nbsp;yourListView.getChildAt(itemIndex&nbsp;-&nbsp;visiblePosition);&nbsp;&nbsp;&nbsp;</span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ViewHolder&nbsp;viewHolder&nbsp;=(ViewHolder)v.getTag();&nbsp;&nbsp;&nbsp;</span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="keyword">if</span><span>(viewHolder!=&nbsp;</span><span class="keyword">null</span><span>){&nbsp;&nbsp;&nbsp;</span></span></li><li><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;viewHolder.titleTextView.setText(<span class="string">"我更新了"</span><span>);&nbsp;&nbsp;&nbsp;</span></span></li><li class="alt"><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></li><li><span>}&nbsp;&nbsp;&nbsp;</span></li></ol></pre>
<p></p>
<p></p><p style="text-align: left; line-height: 26px"><font color="#000000"><font face="Arial"><strong>Adapter中的网络图片优化</strong></font></font></p>
<p></p>
<p></p><p style="text-align: left; line-height: 26px">ListView中的每一项Item基本都会带着网络图片，当item比较多的时候，过多的网络请求和过多的图片存储都会是ListView变慢变卡。</p>
<p></p>
<p></p><p>所以针对其做一下优化：</p>
<p></p>
<p></p><p>&nbsp; ●&nbsp;&nbsp;采用线程池进行网络图片请求，网络图片请求获取后使用本地缓存处理（LRUCache），内存+本地文件缓存。当然，为了防止内存溢出与回收不及时，需要使用弱引用（WeakReference）来存储内存中的图片。</p>
<p></p>
<p></p><p>&nbsp; ●&nbsp;&nbsp;对网络中取到的图片进行按比例缩放，以减少内存消耗。</p>
<p></p>
<p></p><p>&nbsp; ●&nbsp;&nbsp;滑动的时候不需要对网络图片进行请求。因为，网络请求一般比较耗时，某Item的图片，在请求来的时候如果被Recycler换掉，图片就会对应不上该Item。&nbsp;</p>
<p></p>
<p></p><p>Tips.网络请求的工具类比较多不方便举例子，但是使用比较频繁的网络图片请求工具类就是Volley了，Volley提供了一个ImageLoader的工具类和NetworkImageView的网络图片请求View</p>
Edit By <a href="http://mahua.jser.me">MaHua</a><p></p>
</div></div></body></html>