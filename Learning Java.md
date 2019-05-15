---


---

<h1 id="java初步学习">Java初步学习</h1>
<h2 id="目录">目录</h2>
<pre><code>[TOC]
</code></pre>
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
<h4 id="自动类型转换">自动类型转换</h4>
<p>自动类型转换需要满足下面的两个条件：</p>
<ul>
<li>目标类型与原类型兼容</li>
<li>目标类型的字节数大于或等于原类型字节数</li>
<li>由于布尔类型其本身所代表的特殊含义，不能与其他基本类型进行类型的转换（or fault）</li>
</ul>
<h4 id="强制类型转换：">强制类型转换：</h4>
<p>形如</p>
<pre class=" language-java"><code class="prism  language-java"><span class="token keyword">double</span> b <span class="token operator">=</span> <span class="token number">10.3</span><span class="token punctuation">;</span>
a <span class="token operator">=</span> <span class="token punctuation">(</span><span class="token keyword">int</span><span class="token punctuation">)</span>b<span class="token punctuation">;</span>
</code></pre>
<h3 id="运算符">3.1运算符</h3>
<p>表格中的例子中，变量<code>a</code>的值为60，变量<code>b</code>的值为13：</p>

<table>
<thead>
<tr>
<th>位运算符</th>
<th>名称</th>
<th>描述</th>
<th>举例</th>
</tr>
</thead>
<tbody>
<tr>
<td>^</td>
<td>按位异或</td>
<td>相对应位置的值进行异或运算</td>
<td>（a^b）得到49，即 0011 0001</td>
</tr>
<tr>
<td>&gt;&gt;&gt;</td>
<td>按位右移补零</td>
<td>左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充</td>
<td>a&gt;&gt;&gt;2得到15即0000 1111</td>
</tr>
</tbody>
</table><ul>
<li><strong>注意区分逻辑运算与按位运算中符号相同的地方</strong></li>
</ul>
<h3 id="三目运算符">3.1.1三目运算符</h3>
<p><strong>语法形式：布尔表达式？表达式1 : 表达式2</strong></p>
<p>运算过程：如果布尔表达式的值为<code>true</code>  ，则返回  <code>表达式1</code>  的值，否则返回  <code>表达式2</code>  的值。</p>
<h4 id="just-a-try">Just a try</h4>
<p><img src="https://raw.githubusercontent.com/OliverQdy/Basic-Learing/master/java%20try.PNG" alt="https://raw.githubusercontent.com/OliverQdy/Basic-Learing/master/java%20try.PNG"></p>
<p><img src="https://raw.githubusercontent.com/OliverQdy/Basic-Learing/master/trycomplete.PNG" alt="https://raw.githubusercontent.com/OliverQdy/Basic-Learing/master/trycomplete.PNG"></p>
<h3 id="数组表达方式">4.1数组表达方式</h3>
<ul>
<li>形如<code>int []a1 = { xxx }</code>或</li>
</ul>
<pre class=" language-java"><code class="prism  language-java">数组名 <span class="token operator">=</span> <span class="token keyword">new</span> 数组类型<span class="token punctuation">[</span><span class="token punctuation">]</span><span class="token punctuation">;</span>
</code></pre>
<h3 id="java方法">5.Java方法</h3>
<h4 id="概述">5.1概述</h4>
<p>以如下为例：</p>
<pre class=" language-java"><code class="prism  language-java">System<span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token punctuation">)</span>
</code></pre>
<ul>
<li>println() 是一个方法</li>
<li>System 是系统类</li>
<li>out 是标准输出对象<br>
因此，这句话是指调用系统类 System 中的标准输出对象 out 中的方法 println()。</li>
</ul>
<p>理解：Java中的方法，我们可以将其看成一个功能的集合，他们是为了解决特定问题的代码组合。</p>
<h4 id="方法的语法">5.2方法的语法</h4>
<p>方法的定义语法：</p>
<pre class=" language-java"><code class="prism  language-java">访问修饰符 返回值类型 方法名<span class="token punctuation">(</span>参数列表<span class="token punctuation">)</span><span class="token punctuation">{</span>
    方法体
<span class="token punctuation">}</span>
</code></pre>
<p>名词解释：</p>
<ol>
<li>访问修饰符：代表方法允许被访问的权限范围， 可以是 public、protected、private 甚至可以省略 ，其中 public 表示该方法可以被其他任何代码调用</li>
<li>参数列表：是传递给方法的参数列表，参数可以有多个，多个参数间以逗号隔开，每个参数由参数类型和参数名组成，以空格隔开。当方法被调用时，传递值给参数。这个值被称为实参或变量。参数列表是指方法的参数类型、顺序和参数的个数。参数是可选的，方法可以不包含任何参数。</li>
<li>方法体：具体实现功能的语句</li>
</ol>
<h4 id="方法的重载">5.3方法的重载</h4>
<p>在Java中通过在类中写多个方法，这类方法的方法名相同，方法的<code>参数列表不同</code>（参数的个数和参数类型的不同）来实现方法的重载。所谓方法重载就是：在一个类中，有一系列的方法具有方法名相同，但参数列表不同，这类方法的实现就是方法重载。</p>
<pre class=" language-java"><code class="prism  language-java"><span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">Test</span> <span class="token punctuation">{</span>
    <span class="token keyword">void</span> <span class="token function">f</span><span class="token punctuation">(</span><span class="token keyword">int</span> i<span class="token punctuation">)</span> <span class="token punctuation">{</span>
        System<span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"i="</span> <span class="token operator">+</span> i<span class="token punctuation">)</span><span class="token punctuation">;</span>
    <span class="token punctuation">}</span>
    <span class="token keyword">void</span> <span class="token function">f</span><span class="token punctuation">(</span><span class="token keyword">float</span> f<span class="token punctuation">)</span> <span class="token punctuation">{</span>
        System<span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"f="</span> <span class="token operator">+</span> f<span class="token punctuation">)</span><span class="token punctuation">;</span>
    <span class="token punctuation">}</span>
    <span class="token keyword">void</span> <span class="token function">f</span><span class="token punctuation">(</span>String s<span class="token punctuation">)</span> <span class="token punctuation">{</span>
        System<span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"s="</span> <span class="token operator">+</span> s<span class="token punctuation">)</span><span class="token punctuation">;</span>
    <span class="token punctuation">}</span>
    <span class="token keyword">void</span> <span class="token function">f</span><span class="token punctuation">(</span>String s1<span class="token punctuation">,</span> String s2<span class="token punctuation">)</span><span class="token punctuation">{</span>
        System<span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"s1+s2="</span><span class="token operator">+</span><span class="token punctuation">(</span>s1<span class="token operator">+</span>s2<span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
    <span class="token punctuation">}</span>
    <span class="token keyword">void</span> <span class="token function">f</span><span class="token punctuation">(</span>String s<span class="token punctuation">,</span> <span class="token keyword">int</span> i<span class="token punctuation">)</span><span class="token punctuation">{</span>
        System<span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"s="</span><span class="token operator">+</span>s<span class="token operator">+</span><span class="token string">",i="</span><span class="token operator">+</span>i<span class="token punctuation">)</span><span class="token punctuation">;</span>
    <span class="token punctuation">}</span>

    <span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">void</span> <span class="token function">main</span><span class="token punctuation">(</span>String<span class="token punctuation">[</span><span class="token punctuation">]</span> args<span class="token punctuation">)</span> <span class="token punctuation">{</span>
        Test test <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">Test</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        test<span class="token punctuation">.</span><span class="token function">f</span><span class="token punctuation">(</span><span class="token number">3456</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        test<span class="token punctuation">.</span><span class="token function">f</span><span class="token punctuation">(</span><span class="token number">34.56f</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        test<span class="token punctuation">.</span><span class="token function">f</span><span class="token punctuation">(</span><span class="token string">"abc"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        test<span class="token punctuation">.</span><span class="token function">f</span><span class="token punctuation">(</span><span class="token string">"abc"</span><span class="token punctuation">,</span><span class="token string">"def"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        test<span class="token punctuation">.</span><span class="token function">f</span><span class="token punctuation">(</span><span class="token string">"abc"</span><span class="token punctuation">,</span><span class="token number">3456</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
    <span class="token punctuation">}</span>
<span class="token punctuation">}</span>
</code></pre>
<p>运行结果：<br>
<code>i=3456 &lt;br&gt; f=34.56 &lt;br&gt; s=abc &lt;br&gt; s1+s2=abcdef &lt;br&gt; s=abc i=3456</code><br>
在进行方法重载的时候需要遵循以下的规则：</p>
<p><s>-   在使用方法重载的时候，必须通过方法中不同的参数列表来实现方法的重载。如：方法的参数个数不同或者方法的参数类型不同。</s></p>
<ul>
<li>不能通过访问权限，返回值类型和抛出的异常来实现重载</li>
<li>重载的方法中允许抛出不同的异常  <code>？</code></li>
<li>可以有不同的返回值类型，只要方法的参数列表不同即可</li>
<li>可以有不同的访问修饰符  <code>?</code></li>
</ul>
<p>关于返回值<strong>注意点</strong>：</p>
<ol>
<li>
<p>如果方法的返回类型为 void ，则方法中不能使用 return 返回值。</p>
</li>
<li>
<p>方法的返回值最多只能有一个，不能返回多个值。</p>
</li>
<li>
<p>方法返回值的类型必须兼容，也就是说如果返回值类型为 int ，则不能返回 String 型值</p>
</li>
<li>
<p>调用带返回值的方法时，由于方法执行后会返回一个结果，因此在调用带返回值方法时一般都会接收其返回值并进行处理</p>
</li>
</ol>
<p>5.13 Tips:C语言中，非零即为true，而在Java中则不同，boolean函数只能用true和false</p>
<p>5.14 Tips:for 语句在数组内可以使用特殊简化版本，在遍历数组、集合时，foreach 更简单便捷。从英文字面意思理解 foreach 也就是“ for 每一个”的意思。</p>
<pre class=" language-java"><code class="prism  language-java"><span class="token keyword">for</span><span class="token punctuation">(</span>variable_type variable<span class="token operator">:</span>target<span class="token punctuation">)</span><span class="token punctuation">{</span><span class="token punctuation">}</span>
</code></pre>
<p>5.15今日一问：Java输出时咋控制换行等格式呢（为啥是默认换行——见5.3结果）</p>
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

