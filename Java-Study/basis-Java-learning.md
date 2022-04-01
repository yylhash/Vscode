# Java基础学习

[toc]
***
### 1、Java是如何实现跨平台的，原理是什么？

JVM，也就是 Java 虚拟机，就是一个平台，包含于 JRE 的下面。当你需要执行某个 Java 程序时，由 JVM 帮你进行编译和执行。我们编写的 Java 源码，编译后会生成一种 .class 文件，称为字节码文件。Java 虚拟机就是负责将字节码文件翻译成特定平台下的机器码然后运行。
JVM 是一个“桥梁”，是一个“中间件”，是实现跨平台的关键，Java 代码首先被编译成字节码文件，再由 JVM 将字节码文件翻译成机器语言，从而达到运行 Java 程序的目的。  

### 2、Java的关键字和标识符

Java 所有的组成部分都需要名字。类名、变量名以及方法名都被称为标识符。

+ **类名**：对于所有的类来说，类名的首字母应该大写。如果类名由若干单词组成，<u>那么每个单词的首字母应该大写。</u>
+ **方法名**：所有的方法名都应该以小写字母开头。如果方法名含有若干单词，<u>则后面的每个单词首字母大写。</u>
+ **数据类型**：byte:8 short:16 char:16 int:32 long:64 float:32 double:64 由低到高 自动类型转换 强制类型转换 隐含强制类型转换

    | 类型 | 说明 |
    | :---:| :--: |
    | double | 双精度浮点数|
    | float | 单精度浮点数|
     int | 整型
     char | 字符型
     long | 长整型
     short |短整型
     byte | 字节型
     boolean | 布尔型

### 3、Java变量类型

类变量、实例变量、局部变量

+ 类变量：独立于方法之外的变量，用 static 修饰。
+ 实例变量：独立于方法之外的变量，不过没有 static 修饰。
+ 局部变量：类的方法中的变量。<u>局部变量没有默认值，所以局部变量被声明后，必须经过初始化，才可以使用。</u>

### 4、Java修饰符

访问控制修饰符

+ **public**：对所有类可见。使用对象：类、接口、变量、方法
+ **private**：在同一类内可见。使用对象：变量、方法。 注意：不能修饰类（外部类）
+ **protected**：对同一包内的类和所有子类可见。使用对象：变量、方法。 注意：不能修饰类（外部类）。
+ **default**：在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。

非访问修饰符

+ **static**：static 关键字用来声明独立于对象的静态变量，无论一个类实例化多少对象，它的静态变量只有一份拷贝。 静态变量也被称为类变量。局部变量不能被声明为 static 变量。
+ **final**：final 表示"最后的、最终的"含义，变量一旦赋值后，不能被重新赋值。被 final 修饰的实例变量必须显式指定初始值。
+ **abstract**：抽象类不能用来实例化对象，声明抽象类的唯一目的是为了将来对该类进行扩充。
+ **synchronized**：synchronized 关键字声明的方法同一时间只能被一个线程访问。synchronized 修饰符可以应用于四个访问修饰符。

### 5、Java运算符

#### 5.1 算术运算符

+ ##### 一目运算符

    |  运算符| 说明  |
    |  ----  | ----  |
    | -  | 取反运算 |
    | ++ |先取值再加一，或先加一再取值|
    | -- | 先取值再减一，或先减一再取值|

++a **||** --a 先进行自增运算或者自减在进行表达式的运算
a++ **||** a-- 先进行表达式的运算在进行自增或者自减运算

+ ##### 二目运算符

    |  运算符   | 说明  |
    |  ----  | ----  |
    | +  | 求 a 加 b 的和，还可用于 String 类型，进行字符串连接操作 |
    | - | 求 a 减 b 的差
    | * | 求 a 乘以 b 的积
     / | 求 a 除以 b 的商
     % | 求 a 除以 b 的余数

#### 5.2 赋值运算符

变量名称 **=** 表达式内容
在 Java 语言中，“变量名称”和“表达式”内容的类型必须匹配，如果类型不匹配则需要自动转化为对应的类型。
<u>不要将赋值运算符与相等运算符“==”混淆。</u>

#### 5.3 逻辑运算符

|  操作符 | 描述 |
|  ----  | ----  |
| && | 逻辑与运算符。当且仅当两个操作数都为真，条件才为真。 |
| 或 | 逻辑或操作符。如果任何两个操作数任何一个为真，条件为真。|
| ！ | 逻辑非运算符。用来反转操作数的逻辑状态。如果条件为true，则逻辑非运算符将得到false。|

#### 5.4 关系运算符

也可以称为“比较运算符”，用于用来比较判断两个变量或常量的大小。关系运算符是二元运算符，运算结果是 boolean 型。当运算符对应的关系成立时，运算结果是 true，否则是 false。

#### 5.5 位运算符

Java 定义的位运算（bitwise operators）直接对整数类型的位进行操作，这些整数类型包括 long，int，short，char 和 byte。
位运算符主要用来对操作数二进制的位进行运算。按位运算表示按每个二进制位（bit）进行计算，其操作数和运算结果都是整型值。

|  操作符 | 描述 |
|  ----  | ----  |
| & | 如果相对应位都是1，则结果为1，否则为0
| 或 | 如果相对应位都是 0，则结果为 0，否则为 1
| ^ | 如果相对应位值相同，则结果为0，否则为1
| 〜 | 按位取反运算符翻转操作数的每一位，即0变成1，1变成0。
| << | 按位左移运算符。左操作数按位左移右操作数指定的位数。
| >> | 按位右移运算符。左操作数按位右移右操作数指定的位数。
| >>> | 按位右移补零操作符。左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充。

#### 5.6 条件运算符

Java 提供了一个特别的三元运算符（也叫三目运算符）经常用于取代某个类型的 if-then-else 语句。条件运算符的符号表示为“?:”，使用该运算符时需要有三个操作数，因此称其为三目运算符。使用条件运算符的一般语法结构为：

```java
result = <expression> ? <statement1> : <statement3>
```
其中，expression 是一个布尔表达式。当 expression 为真时，执行 statement1， 否则就执行 statement3。此三元运算符要求返回一个结果，因此要实现简单的二分支程序，即可使用该条件运算符。

### 6、for循环和增强for循环

#### for循环

```java
for(初始化; 布尔表达式; 更新) {
    //代码语句
}
```

关于 for 循环有以下几点说明：

+ 最先执行初始化步骤。可以声明一种类型，但可初始化一个或多个循环控制变量，也可以是空语句。
+ 然后，检测布尔表达式的值。如果为 true，循环体被执行。如果为false，循环终止，开始执行循环体后面的语句。
+ 执行一次循环后，更新循环控制变量。
+ 再次检测布尔表达式。循环执行上面的过程。

#### 增强for循环

在遍历数组、集合方面，foreach 为开发者提供了极大的方便。foreach 循环语句是 for 语句的特殊简化版本，主要用于执行遍历功能的循环。

```java
for(类型 变量名:集合) {
    语句块;
}
```

example:

```java
String[] urls = { "http://c.biancheng.net/java", "http://c.biancheng.net/c", "http://c.biancheng.net/golang/" };
// 使用foreach循环来遍历数组元素
// 其中book将会自动迭代每个数组元素
for (String url : urls) {
    System.out.println(url);
}
```

### 7、String方法的运用

#### 7.1 String和int型数据类型的转换

`String`转换为`int`

+ Integer.parseInt(str)
+ Integer.valueOf(str).intValue()

`int`转换为`String`

+ String s = String.valueOf(i);
+ String s = Integer.toString(i);  
+ String s = "" + i;

#### 7.2 Java字符串大小写转换

`String` 类的 `toLowerCase()`方法可以将字符串中的所有字符全部转换成小写，而非字母的字符不受影响。语法格式如下：

```java
字符串名.toLowerCase()    // 将字符串中的字母全部转换为小写，非字母不受影响
```

`toUpperCase()`则将字符串中的所有字符全部转换成大写，而非字母的字符不受影响。语法格式如下：

```java
字符串名.toUpperCase()    // 将字符串中的字母全部转换为大写，非字母不受影响
```

#### 7.3 Java提取子字符串

在 String 中提供了两个截取字符串的方法，一个是从指定位置截取到字符串结尾`substring(int beginIndex)`，另一个是截取指定范围的内容`substring(int beginIndex，int endIndex)`。注意：`substring()`方法是按字符截取，而不是按字节截取。

#### 7.4 Java分割字符串

`String`类的`split()`方法可以按指定的分割符对目标字符串进行分割，分割后的内容存放在字符串数组中。该方法主要有如下两种重载形式：

```java
str.split(String sign)//sign 为指定的分割符，可以是任意字符串。
str.split(String sign,int limit)//limit 表示分割后生成的字符串的限制个数，如果不指定，则表示不限制，直到将整个目标字符串完全分割为止。
```

#### 7.5 字符串的替换

`replace()`方法用于将目标字符串中的指定字符（串）替换成新的字符（串），其语法格式如下：

```java
字符串.replace(String oldChar, String newChar)//其中，oldChar 表示被替换的字符串；newChar 表示用于替换的字符串。
//replace() 方法会将字符串中所有 oldChar 替换成 newChar。
```

`replaceFirst()`方法用于将目标字符串中匹配某正则表达式的第一个子字符串替换成新的字符串，其语法形式如下：

```java
字符串.replaceFirst(String regex, String replacement)//regex 表示正则表达式；replacement 表示用于替换的字符串。
```

`replaceAll()`方法用于将目标字符串中匹配某正则表达式的所有子字符串替换成新的字符串，其语法形式如下：

```java
字符串.replaceAll(String regex, String replacement)//其中，regex 表示正则表达式，replacement 表示用于替换的字符串。
```

### 8、字符串的比较

字符串比较是常见的操作，包括比较相等、比较大小、比较前缀和后缀串等。在 Java 中，比较字符串的常用方法有 3 个：`equals()`方法、`equalsIgnoreCase()`方法、 `compareTo()`方法。

**equals()** 方法将逐个地比较两个字符串的每个字符是否相同。如果两个字符串具有相同的字符和长度，它返回 true，否则返回 false。对于字符的大小写，也在检查的范围之内。

```java
str1.equals(str2);//str1 和 str2 可以是字符串变量， 也可以是字符串字面量。
```

**equalsIgnoreCase()** 方法的作用和语法与`equals()`方法完全相同，唯一不同的是 `equalsIgnoreCase()` 比较时不区分大小写。当比较两个字符串时，它会认为 A-Z 和 a-z 是一样的。

**compareTo()** 方法用于按字典顺序比较两个字符串的大小，该比较是基于字符串各个字符的 Unicode 值

```java
str.compareTo(String otherstr);//如果按字典顺序 str 位于 otherster 参数之前，比较结果为一个负整数；
//如果 str 位于 otherstr 之后，比较结果为一个正整数；如果两个字符串相等，则结果为 0。

提示：如果两个字符串调用 equals() 方法返回 true，那么调用 compareTo() 方法会返回 0。
```

#### 8.1 equals() 与 == 的比较

`equals()`方法比较字符串对象中的字符。而 **==** 运算符比较两个对象引用看它们是否引用相同的实例。

下面的程序说明了两个不同的字符串（String）对象是如何能够包含相同字符的，但同时这些对象引用是不相等的：

```java
String s1 = "Hello";
String s2 = new String(s1);
System.out.println(s1.equals(s2)); // 输出true
System.out.println(s1 == s2); // 输出false
```

变量 s1 指向由“Hello”创建的字符串实例。s2 所指的的对象是以 s1 作为初始化而创建的。因此这两个字符串对象的内容是一样的。但它们是不同的对象，这就意味着 s1 和 s2 没有指向同一的对象，因此它们是不==的。

因此，千万不要使用==运算符测试字符串的相等性，以免在程序中出现糟糕的 bug。从表面上看，这种 bug 很像随机产生的间歇性错误。

### 9、Java中容易混淆的空字符串和null

null 是空引用，表示一个对象的值，没有分配内存，调用 null 的字符串的方法会抛出空指针异常。
“”是一个长度为 0 且占内存的空字符串，在内存中分配一个空间，可以使用 Object 对象中的方法。例如：`“”.toString()`等
new String() 创建一个字符串对象的默认值为 ""，String 类型成员变量的初始值为 null。

```java
public static void main(String[] args) {
    String str1 = new String();
    String str2 = null;
    String str3 = "";
    System.out.println(str3.length()); // 空字符串""的长度为0
    System.out.println(str2.length()); // 抛出空指针异常
    System.out.println(str1); // 输出""
    System.out.println(str1 == str2); // 内存地址的比较，返回false
    System.out.println(str1.equals(str2)); // 值的比较，返回false
    System.out.println(str2 == str3); // 内存地址的比较，返回false
    System.out.println(str3.equals(str2)); // 值的比较，返回false
    System.out.println(str1 == str3); // 内存地址的比较，返回false
    System.out.println(str1.equals(str3)); // 值的比较，返回true
}
```

### 10、Java StringBuffer 和 StringBuilder 类

