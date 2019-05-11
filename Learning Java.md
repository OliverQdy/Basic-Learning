---


---

<h1 id="java初步学习">Java初步学习</h1>
<h2 id="目录">目录</h2>
<p>[TOC]</p>
<h2 id="注意知识点">注意知识点</h2>
<h3 id="java标识符">2.1 Java标识符</h3>
<p>关于 Java 标识符，有几点需要注意的：</p>
<ul>
<li>Java 标识符由数字，字母<code>A-Z或者a-z</code>和下划线<code>_</code>，美元符号<code>$</code>组成。</li>
<li>所有的标识符都应该以字母<code>A-Z或者a-z</code>,美元符<code>$</code>、或者下划线<code>_</code>开始，首位不能是数字。</li>
<li>关键字不能用作标识符。</li>
<li>在 Java 中是区分大小写的。</li>
</ul>
<blockquote>
<p>在 Java 中，还有一些约定俗成的命名规则，</p>
<ol>
<li>
<p>类和接口名。每个字的首字母大写，含有大小写。例如，MyClass，HelloWorld，Time 等。</p>
</li>
<li>
<p>方法名。首字符小写，其余的首字母大写，含大小写。尽量少用下划线。例如，myName，setTime 等。这种命名方法叫做驼峰式命名。</p>
</li>
<li>
<p>常量名。基本数据类型的常量名使用全部大写字母，字与字之间用下划线分隔。对象常量可大小混写。例如，SIZE_NAME。</p>
</li>
<li>
<p>变量名。可大小写混写，首字符小写，字间分隔符用字的首字母大写。不用下划线，少用美元符号。给变量命名是尽量做到见名知意。<br>
–From shiyanlou</p>
</li>
</ol>
</blockquote>
<h3 id="常量">2.2常量</h3>
<p>常量的语法格式如下：</p>
<ul>
<li>
<p><strong>final 数据类型 常量名称 = 值；</strong></p>
</li>
<li>
<p><strong>final 数据类型 常量名称1 = 值1， 常量名称2 = 值2，……常量名称n = 值n；</strong></p>
<p>注<br>
(1)在Java语法中，常量也可以首先声明，然后再进行赋值，但是只能赋值一次<br>
(2)final 用于声明属性（常量），方法和类，分别表示属性一旦被分配内存空间就必须初始化, 它的含义是“这是无法改变的”或者“终态的”</p>
</li>
</ul>
<h3 id="关于注释">2.3关于注释</h3>
<p>有一点稍稍注意：</p>
<ul>
<li>文档注释<code>/**...*/</code>：注释若干行，并写入 javadoc文档</li>
</ul>
<h3 id="类型转换">2.4类型转换</h3>
<p>自动类型转换需要满足下面的两个条件：</p>
<ul>
<li>目标类型与原类型兼容</li>
<li>目标类型的字节数大于或等于原类型字节数</li>
<li>由于布尔类型其本身所代表的特殊含义，不能与其他基本类型进行类型的转换（or fault）</li>
</ul>
<h3 id="运算符">3.1运算符</h3>
<p>表格中的例子中，变量<code>a</code>的值为60，变量<code>b</code>的值为13：<br>
位运算符</p>
<p>| 名称 | 描述 | 举例|<br>
|^        |按位异或 如果相对应位值相同，则结果为0，否则为1 |（a^b）得到49，即 0011 0001</p>
<ol>
<li>|  Item     |  Value  |  Qty  |</li>
<li>|  :-------  |  ----:    |  :—:   |</li>
<li>|  Computer  |  $1600  |  5  |</li>
<li>|  Phone  |  $12  |  12  |</li>
<li>|  Pipe  |  $1  |  234  |</li>
</ol>
<blockquote>
<p>note:## 离线写博客</p>
</blockquote>
<p>即使用户在没有网络的情况下，也可以通过本编辑器离线写博客（直接在曾经使用过的浏览器中输入<a href="http://write.blog.csdn.net/mdeditor">write.blog.csdn.net/mdeditor</a>即可。<strong>Markdown编辑器</strong>使用浏览器离线存储将内容保存在本地。</p>
<p>用户写博客的过程中，内容实时保存在浏览器缓存中，在用户关闭浏览器或者其它异常情况下，内容不会丢失。用户再次打开浏览器时，会显示上次用户正在编辑的没有发表的内容。</p>
<p>博客发表后，本地缓存将被删除。</p>
<p>用户可以选择  把正在写的博客保存到服务器草稿箱，即使换浏览器或者清除缓存，内容也不会丢失。</p>
<blockquote>
<p>Written with <a href="https://stackedit.io/">StackEdit</a>.</p>
</blockquote>

