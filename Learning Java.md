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
<p>注：()</p>
</li>
</ul>
<blockquote>
<p>Written with <a href="https://stackedit.io/">StackEdit</a>.</p>
</blockquote>

