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
<pre><code>访问修饰符 返回值类型 方法名(参数列表){
    方法体
}
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

</code></pre>
<pre class=" language-java"><code class="prism  language-java">    <span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">void</span> <span class="token function">main</span><span class="token punctuation">(</span>String<span class="token punctuation">[</span><span class="token punctuation">]</span> args<span class="token punctuation">)</span> <span class="token punctuation">{</span>
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
<h3 id="对象、类">6.对象、类</h3>
<h4 id="何为面向对象">6.1何为面向对象</h4>
<p>首先明确何为对象，自然不是象棋中的“对相（象）”2333，它也不是一类事物的集合。对象一定是一个具体的、确定的物体，如：具有某种功能的手机并不是，而（我用的）小米9SE就是一个对象。</p>
<p>而这部手机它的样式，颜色，大小，产地，编号等等，便是这部手机的“属性”，这部手机可以打电话、发短信，便是它的“行为”。<br>
<code>属性</code>：是对象具有的特征。每个对象的每个属性都拥有特定值<br>
<code>行为</code>：我们通过方法去实现对象的行为，而对象的方法便是对象所具有的操作，比如人会走路、会哭泣、会学习等等都是人的行为，也就是人的方法。</p>
<p>面向对象的思想，体现的是人所关注对象的信息聚集在了一个具体的物体上。我们通过对象的属性和行为来了解对象。</p>
<h4 id="类">6.2类</h4>
<p>类是封装对象的属性和行为的载体，反过来说具有相同属性和行为的一类实体被称为类。</p>
<p>由此我们可以总结出<strong>类的定义</strong>：</p>
<ol>
<li>
<p>类是相同或相似对象的一种抽象，是对象的一个模板，它<strong>描述一类对象的行为和状态</strong>。</p>
</li>
<li>
<p>类是具有相同属性和方法（行为）的对象的集合<br>
即：可以理解成 对象的行为和属性为类这个集合的元素</p>
</li>
</ol>
<blockquote>
<p>Java 是面向对象的语言，而他的体现就在于Java程序都以类 class 为组织单元。而一个类是对象的抽象，所以类由属性和方法两部分组成。</p>
</blockquote>
<h4 id="构造类及方法">6.3构造类及方法</h4>
<ul>
<li>构造类</li>
</ul>
<pre class=" language-java"><code class="prism  language-java"><span class="token comment">//I.定义类名</span>
<span class="token keyword">public</span> <span class="token keyword">class</span> 类名<span class="token punctuation">{</span>
<span class="token comment">//II.定义属性部分（成员变量）</span>
属性<span class="token number">1</span>的类型 属性<span class="token number">1</span><span class="token punctuation">;</span>
属性<span class="token number">2</span>的类型 属性<span class="token number">2</span><span class="token punctuation">;</span>
<span class="token punctuation">.</span><span class="token punctuation">.</span><span class="token punctuation">.</span>
<span class="token comment">//III.定义方法部分</span>
方法<span class="token number">1</span><span class="token punctuation">;</span>
方法<span class="token number">2</span><span class="token punctuation">;</span>
<span class="token punctuation">.</span><span class="token punctuation">.</span><span class="token punctuation">.</span>
<span class="token punctuation">}</span>
</code></pre>
<p>注：一个类可以包含以下<code>类型变量</code>：</p>
<ul>
<li>
<p>局部变量：在方法、构造方法或者语句块中定义的变量被称为局部变量。变量声明和初始化都是在方法中，方法结束后，变量就会自动销毁。</p>
</li>
<li>
<p>成员变量：成员变量是定义在类中，方法体之外的变量。这种变量在创建对象的时候实例化。成员变量可以被类中方法、构造方法和特定类的语句块访问。</p>
</li>
<li>
<p>类变量：也叫静态变量，类变量也声明在类中，方法体之外，但必须声明为static类型。</p>
</li>
<li>
<p>构造方法：</p>
</li>
</ul>
<pre class=" language-java"><code class="prism  language-java"><span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">People</span><span class="token punctuation">{</span>
    <span class="token comment">//无参构造方法</span>
    <span class="token keyword">public</span> <span class="token function">People</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">{</span>

    <span class="token punctuation">}</span>
    <span class="token comment">//有一个参数的构造方法</span>
    <span class="token keyword">public</span> <span class="token function">People</span><span class="token punctuation">(</span><span class="token keyword">int</span> age<span class="token punctuation">)</span><span class="token punctuation">{</span>

    <span class="token punctuation">}</span>
<span class="token punctuation">}</span>
</code></pre>
<p>又例如具体的构造方法：</p>
<pre class=" language-java"><code class="prism  language-java"><span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">People</span> <span class="token punctuation">{</span>
<span class="token comment">//属性（成员变量）有什么</span>
    <span class="token keyword">double</span> height<span class="token punctuation">;</span>     <span class="token comment">//身高</span>
    <span class="token keyword">int</span> age<span class="token punctuation">;</span>           <span class="token comment">//年龄</span>
    <span class="token keyword">int</span> sex<span class="token punctuation">;</span>       <span class="token comment">//性别，0为男性，非0为女性</span>

    <span class="token comment">//构造函数，初始化了所有属性</span>
    <span class="token keyword">public</span> <span class="token function">People</span><span class="token punctuation">(</span><span class="token keyword">double</span> h<span class="token punctuation">,</span> <span class="token keyword">int</span> a<span class="token punctuation">,</span> <span class="token keyword">int</span> s<span class="token punctuation">)</span><span class="token punctuation">{</span>
        height <span class="token operator">=</span> h<span class="token punctuation">;</span>
        age <span class="token operator">=</span> a<span class="token punctuation">;</span>
        sex <span class="token operator">=</span> s<span class="token punctuation">;</span>
    <span class="token punctuation">}</span>
<span class="token punctuation">}</span>
</code></pre>
<pre class=" language-java"><code class="prism  language-java"><span class="token comment">//创建对象，调用我们自己定义的有参构造方法</span>
People XiaoMing <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">People</span><span class="token punctuation">(</span><span class="token number">168</span><span class="token punctuation">,</span> <span class="token number">21</span><span class="token punctuation">,</span> <span class="token number">1</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
</code></pre>
<p><strong>上面的例子中通过<code>new</code>关键字将类实例化成对象，而<code>new</code>后面跟的就是构造方法。于是可以知道<code>new + 构造方法</code>可以创建一个新的对象。</strong></p>
<blockquote>
<p>2、如果我们在定义类的时候没有写构造方法，系统会默认给我们生成一个无参构造方法，不过这个构造方法什么也不会做。</p>
<p>3、当有指定的构造方法时，系统都不会再为我们添加无参构造方法了。</p>
<p>4、构造方法的重载：方法名相同，但参数不同的多个方法，调用时会自动根据不同的参数选择相应的方法。<br>
——纯属摘抄，过目一遍即可，易理解</p>
</blockquote>
<p><strong>注意</strong>：定义类的时候是不会为类开辟内存空间的，但是一旦创建了对象，系统就会在内存中为对象开辟一块空间，用来存放对象的属性值和方法。</p>
<p>在我们定义对象属性时出现的变量叫成员变量，是在类中定义，来描述对象的特性。还有一种变量叫局部变量，它是由类的方法定义，在方法中临时保存数据。<br>
<img src="https://raw.githubusercontent.com/OliverQdy/Basic-Learing/master/%E6%88%90%E5%8F%82%E4%B8%8E%E5%B1%80%E5%8F%82.png" alt="https://raw.githubusercontent.com/OliverQdy/Basic-Learing/master/%E6%88%90%E5%8F%82%E4%B8%8E%E5%B1%80%E5%8F%82.png"></p>
<p>使用时注意，我们的成员变量可以被本类的所有方法所使用，同时可以被与本类有关的其他类所使用。而我们的局部变量只能在当前的方法中使用。<br>
即：二者作用域有差别</p>
<ol>
<li>
<p>局部变量的作用域仅限于定义它的方法内。而成员变量的作用域在整个类内部都是可见的。</p>
</li>
<li>
<p>同时在相同的方法中，不能有同名的局部变量；在不同的方法中，可以有同名的局部变量。</p>
</li>
<li>
<p>成员变量和局部变量同名时，<strong>局部变量具有更高的优先级</strong>。</p>
</li>
</ol>
<h3 id="封装">7 封装</h3>
<h4 id="概念">7.1概念</h4>
<p>封装是指，一种将抽象性函式接口的实例细节部份包装、隐藏起来的方法。封装可以被认为是一个保护屏障，防止该类的代码和数据被外部类定义的代码随机访问。要访问该类的代码和数据，必须通过严格的接口控制，通过该类提供的方法来实现对隐藏信息的操作和访问。</p>
<ul>
<li>如何去实现类的封装呢？</li>
</ul>
<ol>
<li>
<p>修改属性的可见性，在属性的前面添加修饰符(private 后面会讲)</p>
</li>
<li>
<p>对每个值属性提供对外的公共方法访问，如创建 getter/setter（取值和赋值） 方法，用于对私有属性的访问</p>
</li>
<li>
<p>在 getter/setter 方法里加入属性的控制语句，例如我们可以加一个判断语句，对于非法输入给予否定。</p>
</li>
</ol>
<h4 id="包">7.2包</h4>
<p><strong>包的作用</strong></p>
<ul>
<li>把功能相似或相关的类或接口组织在同一个包中，方便类的查找和使用。</li>
<li>采用了树形目录的存储方式。同一个包中的类名字是不同的，不同的包中的类的名字是可以相同的，当同时调用两个不同包中相同类名的类时，应该加上包名加以区别。</li>
<li>限定了访问权限，拥有包访问权限的类才能访问某个包中的类。</li>
</ul>
<p>Notes：<strong>如何在不同的包使用另一个文件中的类？</strong><br>
这时候就需要用到<code>import</code>关键字。比如我们要导入包<code>com.shiyanlou</code>下<code>People</code>这个类。<code>import com.shiyanlou.People</code>，同时如果<code>import com.shiyanlou.*</code>这是将包下的所有文件都导入进来，<code>*</code>是通配符。</p>
<p>这里要注意一点，包的命名规范是全小写字母拼写</p>
<p>About 访问修饰符：<br>
访问修饰符可以用来修饰属性和方法的访问范围</p>

<table>
<thead>
<tr>
<th>访问修饰符</th>
<th>本类</th>
<th>同包</th>
<th>子类</th>
<th>其他</th>
</tr>
</thead>
<tbody>
<tr>
<td>private</td>
<td>√</td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td>default</td>
<td>√</td>
<td>√</td>
<td></td>
<td></td>
</tr>
<tr>
<td>protected</td>
<td>√</td>
<td>√</td>
<td>√</td>
<td></td>
</tr>
<tr>
<td>public</td>
<td>√</td>
<td>√</td>
<td>√</td>
<td>√</td>
</tr>
</tbody>
</table><p>another points:<br>
在书写代码(封装)的过程中常常会用到<code>this</code>关键字，<code>this</code>关键字代表当前对象。使用<code>this.属性</code>操作当前对象的属性，<code>this.方法</code>调用当前对象的方法。</p>
<p>另，在用<code>private</code>修饰的属性时，我们利用对象访问，必须定义getter和setter方法，Eclipse可以自动帮我们定义。</p>
<ul>
<li>可以通过在菜单栏里点击<code>Source</code>也可以在左侧右击选择<code>Source</code>。来达到设置<code>this</code>的效果</li>
</ul>
<h4 id="内部类">7.3内部类</h4>
<p>将一个类的定义放在另一个类的定义内部，这就是内部类<br>
内部类的主要作用如下：</p>
<ol>
<li>
<p>内部类提供了更好的封装，可以把内部类隐藏在外部类之内，不允许同一个包中的其他类访问该类</p>
</li>
<li>
<p>内部类的方法可以直接访问外部类的所有数据，包括私有的数据</p>
</li>
<li>
<p>内部类所实现的功能使用外部类同样可以实现，只是有时使用内部类更方便</p>
</li>
<li>
<p>内部类允许继承多个非接口类型（具体将在以后的内容进行讲解）</p>
</li>
</ol>
<blockquote>
<p>注：内部类是一个编译时的概念，一旦编译成功，就会成为完全不同的两类。对于一个名为outer的外部类和其内部定义的名为inner的内部类。编译完成后出现outer.class和outer$inner.class两类。所以内部类的成员变量/方法名可以和外部类的相同。</p>
</blockquote>
<p>内部类使用方法：<br>
定义成员内部类后，必须使用外部类对象来创建内部类对象，即 <code>内部类 对象名 = 外部类对象.new 内部类();</code><br>
因此，在定义内部类对象前一定要先定义外部类对象。（其他使用方法如果遇到疑惑再挂上来）</p>
<p>分类：</p>
<ul>
<li>静态内部类<br>
静态内部类通常被称为嵌套类<br>
静态内部类是 static 修饰的内部类，这种内部类的特点是：</li>
</ul>
<ol>
<li>
<p>静态内部类不能直接访问外部类的非静态成员，但可以通过  <code>new 外部类().成员</code>  的方式访问</p>
</li>
<li>
<p>如果外部类的静态成员与内部类的成员名称相同，可通过<code>类名.静态成员</code>访问外部类的静态成员；如果外部类的静态成员与内部类的成员名称不相同，则可通过<code>成员名</code>直接调用外部类的静态成员</p>
</li>
<li>
<p><strong>创建静态内部类的对象时，不需要外部类的对象，可以直接创建  <code>内部类 对象名= new 内部类();</code></strong>（明显与内部类的区别）</p>
</li>
</ol>
<p>以实验楼中代码为例：</p>
<pre class=" language-java"><code class="prism  language-java"><span class="token comment">//外部类People</span>
<span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">People</span> <span class="token punctuation">{</span>
    <span class="token keyword">private</span> String name <span class="token operator">=</span> <span class="token string">"LiLei"</span><span class="token punctuation">;</span>         <span class="token comment">//外部类的私有属性</span>
<span class="token comment">/*外部类的静态变量。Java 中被 static 修饰的成员称为静态成员或类成员。它属于整个类所有，而不是某个对象所有，即被类的所有对象所共享。静态成员可以使用类名直接访问，也可以使用对象名进行访问。
*/</span>
    <span class="token keyword">static</span> String ID <span class="token operator">=</span> <span class="token string">"510xxx199X0724XXXX"</span><span class="token punctuation">;</span> 

    <span class="token comment">//静态内部类Student</span>
    <span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">class</span> <span class="token class-name">Student</span> <span class="token punctuation">{</span>
        String ID <span class="token operator">=</span> <span class="token string">"20151234"</span><span class="token punctuation">;</span>               <span class="token comment">//内部类的成员属性</span>
        <span class="token comment">//内部类的方法</span>
        <span class="token keyword">public</span> <span class="token keyword">void</span> <span class="token function">stuInfo</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">{</span>
            System<span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"访问外部类中的name："</span> <span class="token operator">+</span> <span class="token punctuation">(</span><span class="token keyword">new</span> <span class="token class-name">People</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">.</span>name<span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
            System<span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"访问外部类中的ID："</span> <span class="token operator">+</span> People<span class="token punctuation">.</span>ID<span class="token punctuation">)</span><span class="token punctuation">;</span>
            System<span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"访问内部类中的ID："</span> <span class="token operator">+</span> ID<span class="token punctuation">)</span><span class="token punctuation">;</span>
        <span class="token punctuation">}</span>
    <span class="token punctuation">}</span>

    <span class="token comment">//测试成员内部类</span>
    <span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">void</span> <span class="token function">main</span><span class="token punctuation">(</span>String<span class="token punctuation">[</span><span class="token punctuation">]</span> args<span class="token punctuation">)</span> <span class="token punctuation">{</span>
        Student b <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">Student</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>   <span class="token comment">//直接创建内部类对象，对象名为b</span>
        b<span class="token punctuation">.</span><span class="token function">stuInfo</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>                 <span class="token comment">//调用内部对象的suInfo方法</span>
    <span class="token punctuation">}</span>
<span class="token punctuation">}</span>
</code></pre>
<p>非常具体详细的说明了，上述输出答案易知。</p>
<ul>
<li>
<p>局部内部类<br>
局部内部类也像别的类一样进行编译，但只是作用域不同而已，只在该方法或条件的作用域内才能使用，退出这些作用域后无法引用的。</p>
</li>
<li>
<p>匿名内部类（等我以后回来，现在有些迷）</p>
</li>
</ul>
<h3 id="继承">8 继承</h3>
<p>概念：<br>
继承可以看成是类与类之间的衍生关系。继承需要符合的关系是：is-a，父类更通用，子类更具体。</p>
<p><strong>为什么需要继承？</strong></p>
<p>如果有两个类相似，那么它们会有许多重复的代码，导致后果就是代码量大且臃肿，后期的维护性不高。通过继承就可以解决这个问题，将两段代码中相同的部分提取出来组成一个父类，实现代码的复用。<br>
<strong>继承的特点</strong>：</p>
<ul>
<li>子类拥有父类除private以外的所有属性和方法</li>
<li>子类可以拥有自己的属性和方法</li>
<li>子类可以重写实现父类的方法</li>
<li>Java 中的继承是单继承，一个类只有一个父类</li>
</ul>
<p>继承实例见Java文件</p>
<blockquote>
<p>注： Java 实现多继承的一个办法是 implements（实现）接口</p>
</blockquote>
<h3 id="多态">9 多态</h3>
<p>定义：多态是指允许不同类的对象对同一消息做出响应。即同一消息可以根据发送对象的不同而采用多种不同的行为方式。多态也称作动态绑定（dynamic binding），是指在执行期间判断所引用对象的实际类型，根据其实际的类型调用其相应的方法。</p>
<p>通俗来讲，多态就是只用父类就能够引用不同子类</p>
<p>向上转型栗子：<br>
如：</p>
<pre class=" language-java"><code class="prism  language-java"><span class="token keyword">class</span> <span class="token class-name">Animal</span> <span class="token punctuation">{</span>
    <span class="token comment">//父类方法</span>
    <span class="token keyword">public</span> <span class="token keyword">void</span> <span class="token function">bark</span><span class="token punctuation">(</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
        System<span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"动物叫！"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
    <span class="token punctuation">}</span>
<span class="token punctuation">}</span>
<span class="token keyword">class</span> <span class="token class-name">Dog</span> <span class="token keyword">extends</span> <span class="token class-name">Animal</span> <span class="token punctuation">{</span>
    <span class="token comment">//子类重写父类的bark方法</span>
    <span class="token keyword">public</span> <span class="token keyword">void</span> <span class="token function">bark</span><span class="token punctuation">(</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
        System<span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"汪、汪、汪！"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
    <span class="token punctuation">}</span>
    <span class="token comment">//子类自己的方法</span>
    <span class="token keyword">public</span> <span class="token keyword">void</span> <span class="token function">dogType</span><span class="token punctuation">(</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
        System<span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"这是什么品种的狗？"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
    <span class="token punctuation">}</span>
<span class="token punctuation">}</span>
<span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">Test</span> <span class="token punctuation">{</span>
     <span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">void</span> <span class="token function">main</span><span class="token punctuation">(</span>String<span class="token punctuation">[</span><span class="token punctuation">]</span> args<span class="token punctuation">)</span> <span class="token punctuation">{</span>
        Animal a <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">Animal</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        Animal b <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">Dog</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        Dog d <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">Dog</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span> 

        a<span class="token punctuation">.</span><span class="token function">bark</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        b<span class="token punctuation">.</span><span class="token function">bark</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        <span class="token comment">//b.dogType(); </span>
        <span class="token comment">//b.dogType()编译不通过</span>
        d<span class="token punctuation">.</span><span class="token function">bark</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        d<span class="token punctuation">.</span><span class="token function">dogType</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
    <span class="token punctuation">}</span>
<span class="token punctuation">}</span>
</code></pre>
<p>我们很容易注意到</p>
<ul>
<li>不能使用一个子类的引用去指向父类的对象</li>
<li>当调用bark()方法时，由于子类重写了父类的bark()方法,所以调用子类中的bark()方法。</li>
<li>在向上转型后，子类能够引用父类中的属性和方法，并能且只能调用自己与父类中有且相似的方法，而其他的就无法调用（如向上转型定义的b就不能用dogType这个方法）</li>
</ul>
<p>因此，向上转型，在运行时，会<strong>遗忘子类对象中与父类对象中不同的方法，也会覆盖与父类中相同的方法——重写</strong>。（方法名，参数都相同）</p>
<p>多态实现的三个方式：</p>
<ol>
<li>重写；</li>
<li>抽象类&amp;抽象方法；</li>
<li>接口实现；</li>
</ol>
<p><s>5.22杂笔：后面两个看起来好复杂，先歇菜了2333，明天复习概率论加油</s></p>
<ul>
<li>抽象类&amp;抽象方法<br>
Java提供了一个叫做抽象方法的机制，这种方法是不完整的，仅有声明而没有方法体。抽象方法声明语法如下：</li>
</ul>
<pre class=" language-java"><code class="prism  language-java"><span class="token keyword">abstract</span> <span class="token keyword">void</span> <span class="token function">f</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>  <span class="token comment">//f()方法时抽象方法</span>
</code></pre>
<p>同理抽象类</p>
<pre class=" language-java"><code class="prism  language-java"><span class="token keyword">public</span><span class="token operator">/</span><span class="token keyword">private</span><span class="token operator">/</span><span class="token keyword">protected</span> <span class="token keyword">abstract</span> <span class="token keyword">class</span> <span class="token class-name">XXX</span><span class="token punctuation">{</span><span class="token punctuation">}</span>
</code></pre>
<p>抽象类的作用</p>
<ol>
<li>
<p>在某些情况下，某个父类只是知道其子类应该包含怎样的方法，但无法准确知道这些子类如何实现这些方法。也就是说抽象类是约束子类必须要实现哪些方法，而并不关注方法如何去实现。</p>
</li>
<li>
<p>从多个具有相同特征的类中抽象出一个抽象类，以这个抽象类作为子类的模板，从而避免了子类设计的随意性。</p>
</li>
</ol>
<p>抽象类的实现规则：</p>
<ol>
<li>
<p>用 abstract 修饰符定义抽象类和抽象方法，只用声明，不需要实现</p>
</li>
<li>
<p>包含抽象方法的类就是抽象类</p>
</li>
<li>
<p>抽象类中可以包含普通的方法，也可以没有抽象方法  （<strong>little confused</strong>）</p>
</li>
<li>
<p>抽象类的对象不能直接创建，我们通常是定义引用变量指向子类对象。</p>
</li>
</ol>
<ul>
<li>接口实现</li>
</ul>
<p>abstract 关键字允许人们在类中创建一个或多个没有任何定义的方法，而 interface 使抽象的概念更向前迈进了一步。<br>
接口的声明语法格式如下：</p>
<pre class=" language-java"><code class="prism  language-java">修饰符 <span class="token keyword">interface</span> 接口名称 <span class="token punctuation">[</span><span class="token keyword">extends</span> 其他的类名<span class="token punctuation">]</span> <span class="token punctuation">{</span>
        <span class="token comment">// 声明变量</span>
        <span class="token comment">// 抽象方法</span>
<span class="token punctuation">}</span>
</code></pre>
<p>如声明一个 Animal 接口：</p>
<pre class=" language-java"><code class="prism  language-java"><span class="token keyword">interface</span> <span class="token class-name">Animal</span> <span class="token punctuation">{</span>
        <span class="token comment">//int x;</span>
        <span class="token comment">//编译错误,x需要初始化，因为是 static final 类型</span>
        <span class="token keyword">int</span> y <span class="token operator">=</span> <span class="token number">5</span><span class="token punctuation">;</span>
        <span class="token keyword">public</span> <span class="token keyword">void</span> <span class="token function">eat</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        <span class="token keyword">public</span> <span class="token keyword">void</span> <span class="token function">travel</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
<span class="token punctuation">}</span>
</code></pre>
<p><strong>Q</strong>:在接口中，变量都是static final类型吗？什么式static final类型</p>
<p><strong>注意点</strong>：在<code>Java8</code>中</p>
<ul>
<li>接口不能用于实例化对象</li>
<li>接口中方法只能是抽象方法、default方法、静态方法</li>
<li>接口成员是 static final 类型</li>
<li>接口支持多继承<br>
在<code>Java9</code>中，接口可以拥有私有方法和私有静态方法。default方法和静态方法可以使用它们。</li>
</ul>
<p>而现在已经Java11了(?)，有空可以去Oracle官网教程看看有啥变动</p>
<p>多继承实现方式：</p>
<pre class=" language-java"><code class="prism  language-java">修饰符 <span class="token keyword">interface</span> <span class="token class-name">A</span> <span class="token keyword">extends</span> 接口<span class="token number">1</span>，接口<span class="token number">2</span><span class="token punctuation">{</span>

<span class="token punctuation">}</span>
修饰符 <span class="token keyword">class</span> <span class="token class-name">A</span> <span class="token keyword">implements</span> 接口<span class="token number">1</span>，接口<span class="token number">2</span><span class="token punctuation">{</span>

<span class="token punctuation">}</span> 
</code></pre>
<p>实现上面的接口：</p>
<pre class=" language-java"><code class="prism  language-java"><span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">Cat</span> <span class="token keyword">implements</span> <span class="token class-name">Animal</span><span class="token punctuation">{</span>
     <span class="token keyword">public</span> <span class="token keyword">void</span> <span class="token function">eat</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">{</span>
         System<span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"Cat eats"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
     <span class="token punctuation">}</span>

     <span class="token keyword">public</span> <span class="token keyword">void</span> <span class="token function">travel</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">{</span>
         System<span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"Cat travels"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
     <span class="token punctuation">}</span>
     <span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">void</span> <span class="token function">main</span><span class="token punctuation">(</span>String<span class="token punctuation">[</span><span class="token punctuation">]</span> args<span class="token punctuation">)</span> <span class="token punctuation">{</span>
        Cat cat <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">Cat</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        cat<span class="token punctuation">.</span><span class="token function">eat</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        cat<span class="token punctuation">.</span><span class="token function">travel</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
    <span class="token punctuation">}</span>
<span class="token punctuation">}</span>
</code></pre>
<p>5.24杂笔：关于接口还是一知半解，希望自己Java head first的书赶快追上进度，多实践一下</p>
<h3 id="java中的异常">10 Java中的异常</h3>
<p>之所以要处理异常，也是为了增强程序的<a href="http://baike.baidu.com/view/45520.htm">鲁棒性</a>。</p>
<blockquote>
<p>鲁棒是Robust的音译，也就是健壮和强壮的意思。</p>
</blockquote>
<p>异常都是从<code>Throwable</code>类派生出来的，而<code>Throwable</code>类是直接从<code>Object</code>类继承而来。可以在Java SE官方API文档中获取更多关于它们的知识。</p>
<p>异常通常有四类：</p>
<ul>
<li>Error：系统内部错误，这类错误由系统进行处理，程序本身无需捕获处理</li>
<li>Exception：可以处理的异常</li>
<li>RuntimeException：可以捕获，也可以不捕获的异常</li>
<li>继承Exception的其他类：必须捕获，通常在API文档中会说明这些方法抛出哪些异常</li>
</ul>
<h5 id="算术异常（arithmeticexception）">10.1.1 算术异常（ArithmeticException）</h5>
<p>Java SE官方文档对于算术异常的定义是：</p>
<blockquote>
<p>当出现异常的运算条件时，抛出此异常。例如，一个整数“除以零”时，抛出此类的一个实例。<br>
模拟出现算术异常的情况， 主要的代码如下：</p>
</blockquote>
<pre class=" language-java"><code class="prism  language-java"><span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">AriExceptionTest</span> <span class="token punctuation">{</span>
    <span class="token keyword">public</span> <span class="token keyword">static</span> <span class="token keyword">void</span> <span class="token function">main</span><span class="token punctuation">(</span>String<span class="token punctuation">[</span><span class="token punctuation">]</span> args<span class="token punctuation">)</span> <span class="token punctuation">{</span>
        System<span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"Example 1:  -1.0 / 0 = "</span> <span class="token operator">+</span> <span class="token punctuation">(</span><span class="token operator">-</span><span class="token number">1.0</span> <span class="token operator">/</span> <span class="token number">0</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        <span class="token comment">// 演示负浮点数除0</span>

        System<span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"Example 2:  +1.0 / 0 = "</span> <span class="token operator">+</span> <span class="token punctuation">(</span><span class="token operator">+</span><span class="token number">1.0</span> <span class="token operator">/</span> <span class="token number">0</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        <span class="token comment">// 演示正浮点数除0</span>

        System<span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"Example 3:  -1 / 0 = "</span> <span class="token operator">+</span> <span class="token punctuation">(</span><span class="token operator">-</span><span class="token number">1</span> <span class="token operator">/</span> <span class="token number">0</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        <span class="token comment">// 演示负整数除0</span>

        System<span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"Example 4:  +1 / 0 = "</span> <span class="token operator">+</span> <span class="token punctuation">(</span><span class="token operator">+</span><span class="token number">1</span> <span class="token operator">/</span> <span class="token number">0</span><span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        <span class="token comment">// 演示正整数除0</span>
    <span class="token punctuation">}</span>
<span class="token punctuation">}</span>
</code></pre>
<p>结果如下<br>
<img src="https://raw.githubusercontent.com/OliverQdy/Basic-Learning/master/ariexceptionTest.PNG" alt="https://raw.githubusercontent.com/OliverQdy/Basic-Learning/master/ariexceptionTest.PNG"></p>
<p>可以看到，实际上程序在运行到Example 3的时候就已经出现了算数异常。当代码抛出一个异常的同时，也终止了对剩余代码的处理，所以Example 4根本没有机会执行。</p>
<p>那么Example 1和2中为什么能出现结果呢？</p>
<p>这是由于在Java中，浮点数（无论是float还是double类型的浮点数）被0除，并不会引发算术异常。具体说来，是操作系统为了保护应用软件而已经处理了该异常，不再抛出，最终运算结果是无穷大。</p>
<h5 id="数组下标越界异常（arrayindexoutofboundsexception）">10.1.2 数组下标越界异常（ArrayIndexOutOfBoundsException）</h5>
<p>Java SE官方文档对于数组下标越界异常的定义是：</p>
<blockquote>
<p>用非法索引访问数组时抛出的异常。如果索引为负或大于等于数组大小，则该索引为非法索引。</p>
</blockquote>
<h5 id="空指针异常（nullpointerexception）">10.1.3 空指针异常（NullPointerException）</h5>
<p>Java SE官方文档对于空指针异常的定义是：</p>
<blockquote>
<p>当应用程序试图在需要对象的地方使用 null 时，抛出该异常。这种情况包括：</p>
</blockquote>
<blockquote>
<ul>
<li>调用 null 对象的实例方法。</li>
<li>访问或修改 null 对象的字段。</li>
<li>将 null 作为一个数组，获得其长度。</li>
<li>将 null 作为一个数组，访问或修改其时间片。</li>
<li>将 null 作为 Throwable 值抛出。</li>
</ul>
</blockquote>
<blockquote>
<p>应用程序应该抛出该类的实例，指示其他对 null 对象的非法使用。</p>
</blockquote>
<h4 id="自定义异常">10.2自定义异常</h4>
<p>自定义一个异常类非常简单，只需要让它<strong>继承Exception或其子类</strong>就行。在自定义异常类的时候，建议同时提供无参构造方法和带字符串参数的构造方法，后者可以为你在调试时提供更加详细的信息。我们可以据此构造需要的异常，来方便我们的编程</p>
<hr>
<p>5.13 Tips:C语言中，非零即为true，而在Java中则不同，boolean函数只能用true和false</p>
<p>5.14 Tips:for 语句在数组内可以使用特殊简化版本，在遍历数组、集合时，foreach 更简单便捷。从英文字面意思理解 foreach 也就是“ for 每一个”的意思。</p>
<pre class=" language-java"><code class="prism  language-java"><span class="token keyword">for</span><span class="token punctuation">(</span>variable_type variable<span class="token operator">:</span>target<span class="token punctuation">)</span><span class="token punctuation">{</span><span class="token punctuation">}</span>
</code></pre>
<p>5.15今日一问：Java输出时咋控制换行等格式呢（为啥是默认换行——见5.3结果）<br>
（5.18目前已知：<code>System.out.print</code> 和<code>System.out.println</code>区别就在于后者输出语句后会执行换行操作）<br>
5.16。<s>有空实现一下，看看这个类如何得到age</s>,done</p>
<pre class=" language-java"><code class="prism  language-java"><span class="token keyword">public</span> <span class="token keyword">class</span> <span class="token class-name">People</span> <span class="token punctuation">{</span>
<span class="token comment">//属性（成员变量） 有什么</span>
    <span class="token keyword">double</span> height<span class="token punctuation">;</span>  <span class="token comment">//身高</span>
    <span class="token keyword">int</span> age<span class="token punctuation">;</span>     <span class="token comment">//年龄</span>
    <span class="token keyword">int</span> sex<span class="token punctuation">;</span>    <span class="token comment">//性别，0为男性，非0为女性</span>

<span class="token comment">//方法 干什么</span>
    <span class="token keyword">void</span> <span class="token function">cry</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">{</span>
        System<span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"我在哭！"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
    <span class="token punctuation">}</span>
    <span class="token keyword">void</span> <span class="token function">laugh</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">{</span>
        System<span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"我在笑！"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
    <span class="token punctuation">}</span>
    <span class="token keyword">void</span> <span class="token function">printBaseMes</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">{</span>
        System<span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"我的身高是"</span><span class="token operator">+</span>height<span class="token operator">+</span><span class="token string">"cm"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        System<span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"我的年龄是"</span><span class="token operator">+</span>age<span class="token operator">+</span><span class="token string">"岁"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        <span class="token keyword">if</span><span class="token punctuation">(</span><span class="token keyword">this</span><span class="token punctuation">.</span>sex<span class="token operator">==</span><span class="token number">0</span><span class="token punctuation">)</span>
            System<span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"我是男性！"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
        <span class="token keyword">else</span> 
            System<span class="token punctuation">.</span>out<span class="token punctuation">.</span><span class="token function">println</span><span class="token punctuation">(</span><span class="token string">"我是女性！"</span><span class="token punctuation">)</span><span class="token punctuation">;</span>

    <span class="token punctuation">}</span>
<span class="token punctuation">}</span>
</code></pre>
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

