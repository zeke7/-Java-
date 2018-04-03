# Java 学习笔记
***
因为在网上看到有些很多笔记很不错，而且边学习边做笔记也能帮助自己更好的理解，同时又能帮助到其他人，所以我会经常更新我的笔记并分享给大家。。。  
本笔记将从最基础的JAVA SE开始到JAVA EE 以及后面的一系列框架    
喜欢的同学可以star一下我哦。。。如果有哪里出错的或者有问题的请发邮件联系我！（hfang@coastal.edu）  
***
## 目录
* [JAVA SE](#java-se-部分)
* [第1节 Hello World](#第1节-hello-world)
* [第2节 代码的注释](#第2节-代码的注释)
* [第3节 标识符与关键字](#第3节-标识符与关键字)
* [第4节 数据类型](#第4节-数据类型)
* [第5节 运算符](#第5节-运算符)
* [第6节 程序逻辑控制](#第6节-程序逻辑控制)
## JAVA SE 部分
***
#### 安装配置JAVA环境（略）详情参考  
https://www.java.com/zh_CN/download/help/download_options.xml    
#### 第1节 Hello World
建立 Hello.java 文件，先来一个最简单的应用程序：  
```Java
  public class Hello{
    public static void main(String[]args){
          System.out.println("Hello world");
      }
    }
```
* JAVA 程序分为两个操作：
  * 编译程序：（在cmd中）javac Hello.java形成 Hello.class文件
  * 解释程序：（在cmd中）java Hello  
* JAVA 程序组成：类（核心）
  * public class 类名称{}：文件名（Hello.java）与类名称保持一致
  * class 类名称{}：文件名（Hello.java）与 类名称 可以不一致，可以同时存在多个class，编译后形成各自的*.class文件
* 主方法：所以的程序都由主方法开始执行 public static void main(String[]args){}  
#### 第2节 代码的注释
  代码的注释意思是，你的代码并不会被程序执行，就相当于一段文本。
* // 单行注释；
* /*...*/ 多行注释；
* /**...*/ 文档注释；
```Java
  public class Hello{
    public static void main(String[]args){
          //System.out.println("Hello world"); 单行注释；
          
       /* System.out.println("Hello world"); 
          System.out.println("Hello world"); 
          System.out.println("Hello world"); */ 多行注释；
        }
        /** 文档注释
          ... IDE 会帮助编写 （Integrated Development Environment）
         */
     public void sayHello(){}
    }
```  
#### 第3节 标识符与关键字
  标识符通俗的说就是，程序中各个类或者变量或者方法的名字，其由字母、数字、_、$组成，不能是JAVA保留的关键字，并且不能以数字开头。    
  标识符可以使用中文，但是不推荐使用。
  关键字参考百度百科：https://baike.baidu.com/item/java%E5%85%B3%E9%94%AE%E5%AD%97  
#### 第4节 数据类型
  本节代码:[DataTypeDemo.java](/Java_examples/DataTypeDemo.java)  
  Java数据类型分为 内置类型 和 引用数据类型 两大类  
  内置类型有： 
* boolean	布尔值，作二元判断	true, false （逻辑控制）
* byte	8位有符号整数	最小值-128，最大值127 （内容传递，编码解码）
* short	16位有符号整数	最小值-32768，最大值32767 
* int	32位有符号整数	最小值-2147483648（-2^31），最大值2147483647（2^31-1） （表示整数）
* long	64位有符号整数	-2^63~(2^63-1) （日期时间，文件内存）
* float	32位浮点数	1.4E-45~3.4028235E38
* double	64位浮点数	4.9E-324~1.7976931348623157E308 （表示小数）
* char	16位Unicode字符  （避免使用中文的乱码问题）
  引用数据类型是数组，根据这些基本的内置类型扩展的新类，还有接口（之后会学）  
#### int, long, byte（数据类型cont’d）  
  int, long, byte类型可称为整形（e.g. 10,20,30....这些都是常量）  
  在程序中，一般使用变量(变量名称在一个代码块中只能声明一次)来储存常量(格式：数据类型 变量名 = 常量)  
  当然，储存的常量也不能无限大，int可以储存最小值-2147483648（-2^31），最大值2147483647（2^31-1）  
  当储存的数值超过了最大值，就会变成最小值，像一个循环，在DataTypeDemo.java中有代码。  
  为了解决这个问题，可以扩大数据类型 int --> long (-2^63~(2^63-1))此时出现一个问题，数据类型之间如何进行转换？  
*  数据类型的转换有这些规律：
   * 范围小的数据跟范围大的数据进行计算时，自动向范围大的转型
   * 范围大 --> 范围小，采用强制转换（方法1： 常量标记，方法2：(数据类型)），在DataTypeDemo.java中有代码。
#### float, double（数据类型cont’d）  
   double是默认的小数类型，float的范围比double小，具体转换的例子在DataTypeDemo.java中有代码。  
   整形不保留小数位，要使用double数据类型来显示小数。
#### char （数据类型cont’d）  
   char使用 “ ' ” 声明内容。  
   字符（char）可以与int类型互相转换（编码形式 ASCII部分编码）需要注意 '0'(char) 与 0 (int) 是不一样的，具体的例子在DataTypeDemo.java中。
#### boolean （数据类型cont’d）  
   只有两种取值：true, false。多用于条件判断，具体的例子在DataTypeDemo.java中。
#### String （数据类型cont’d）  
  String使用 “ " ” 声明内容。  
  String表示的是一个字符串（多个字符的集合），可以使用“+”进行连接操作  
  转义字符：换行(\n), 制表符(\t), \(\\), 双引号(\"), 单引号(\')  
#### 第5节 运算符
本节代码:[OperatorDemo.java](/Java_examples/OperatorDemo.java)  
常用的运算符：四则运算，三目运算，逻辑运算
* 四则运算，即简单的加减乘除以及取模（mod）的运算，还有两种特殊的运算符（++，--）分别代表自增和自减，但是位置不同效果不同，具体在本节代码中有实现。可以根据代码展示的结果进行推敲更助于理解。
* 三目运算是根据条件进行判断并返回一个内容，具体格式为：数据类型 变量 = Boolean表达式？满足条件时的内容：不满足条件时的内容；。
* 逻辑运算主要有3种，与（&，&&），非（！），或（|，||）  
  &与&&的区别在于，& 会执行所有的判断条件，而 && 当一系列条件从前往后，某一个条件不符合时就不再判断后面的条件。  
  |与||的区别在于，| 会执行所有的判断条件只要有一个条件正确就返回true，而 || 当一系列条件从前往后，某一个条件符合时就返回true就不再判断后面的条件。
#### 第6节 程序逻辑控制


