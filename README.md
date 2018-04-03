# Java 学习笔记
***
因为在网上看到有些很多笔记很不错，而且边学习边做笔记也能帮助自己更好的理解，同时又能帮助到其他人，所以我会经常更新我的笔记并分享给大家。。。  
本笔记将从最基础的JAVA SE开始到JAVA EE 以及后面的一系列框架    
喜欢的同学可以star一下我哦。。。如果有哪里出错的或者有问题的请发邮件联系我！（hfang@coastal.edu）  
***
## JAVA SE 部分
***
#### 安装配置JAVA环境（略）详情参考  
https://www.java.com/zh_CN/download/help/download_options.xml    
#### 第1节 （Hello World）  
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
  Java数据类型分为 内置类型 和 引用数据类型 两大类  
  内置类型有： 
* boolean	布尔值，作二元判断	true, false （逻辑控制）
* byte	8位有符号整数	最小值-128，最大值127 （内容传递，编码解码）
* short	16位有符号整数	最小值-32768，最大值32767 
* int	32位有符号整数	最小值-2147483648（-231），最大值2147483647（231-1） （表示整数）
* long	64位有符号整数	-263~(263-1) （日期时间，文件内存）
* float	32位浮点数	1.4E-45~3.4028235E38
* double	64位浮点数	4.9E-324~1.7976931348623157E308 （表示小数）
* char	16位Unicode字符  （避免使用中文的乱码问题）
  引用数据类型是数组，根据这些基本的内置类型扩展的新类，还有接口（之后会学）  
#### int （数据类型cont’d）  
  int 类型可称为整形（e.g. 10,20,30....这些都是常量）  
  在程序中，一般使用变量(变量名称在一个代码块中只能声明一次)来储存常量(格式：数据类型 变量名 = 常量)  
  
#### float （数据类型cont’d）  
#### char （数据类型cont’d）  
#### boolean （数据类型cont’d）  
#### String （数据类型cont’d）  
  




