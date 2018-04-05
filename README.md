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
* [第7节 方法的使用](#第7节-方法的使用)
* [第8节 面向对象](#第8节-面向对象)
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
     public static void sayHello(){}
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
本节代码:[LogicDemo.java](/Java_examples/LogicDemo.java)  
通过分支结构控制程序的逻辑：  
```Java
  public class Hello{
    public static void main(String[]args){
    //第一种通过if...else的方式
         if(条件){
          //满足条件
          ...do something
         }else{
          //不满足条件
          ...do something
         }
    //第二种通过if...else if...else if..若干...else 的方式
        if(条件1){
          //满足条件1
          ...do something
         }else if(条件2){
          //满足条件2
          ...do something
         }else if(条件3){
          //满足条件3
          ...do something
         }else{
          //不满足以上条件
          ..do something
         }
    //第三者通过switch进行条件判断
        switch(整数|字符|枚举|字符串){
            case 内容1:{
               //满足内容1
               [break;]
            }
            case 内容1:{
               //满足内容2
               [break;]
            }
            case 内容1:{
               //满足内容3
               [break;]
            }
            ...
            [default: {
              //不满足以上任意一个内容，默认情况...
            }]
        }
        //如果不添加break的话，switch就会从第一个满足条件的case开始执行接下来的所有case
        
      }
```  
通过循环结构控制程序的逻辑： 
  主要分为两种，while循环和for循环
  * while循环的用法为：  
  ```Java
      while(条件){
        ....do something  
      }  //当条件满足，便会一直执行其中的程序
      
      do{
        ...do something
      }while(条件){
        ...do something
      } //先执行do中的程序，如果条件满足再进入while
  ```
  * for循环的用法为：  
   ```Java
    for(初始化条件; 循环判断; 条件变更){
          ...do something
    }
   ```  
 对于循环的控制，使用两种关键字: continue(推出此次循环继续下一次循环)， break(完全退出循环)
 #### 第7节 方法的使用
 本节代码:[MethodDemo.java](/Java_examples/MethodDemo.java) 
 * 方法基本上来说，就是把一段代码封装起来变成代码块。当你想要使用这个代码块的功能时，不需要重新进行编写，只需要调用这个方法名称就可以了。当然定义方法的格式比较复杂，只能给出一个大概的模板。
 ```Java
   public (static) 返回值类型 方法名称(参数类型 参数名字, ...){
          ...do something
          [return 返回值;] // 此返回值类型应与方法体中的类型一致
          }
   如果此方法没有返回值类型，就可以使用 void 在返回值类型位置进行声明
 ```
 * 方法中一个比较重要的概念是“重载”，即同一个方法名称要执行多项不同的操作，简单来说就是，方法的名称相同，参数的类型和个数不相同。
    * 需要注意的是，进行重载的方法返回值类型一定要统一
 * 方法中的另一个概念是“递归调用”，简单来说就是方法自己调用自己，为了避免无限循环下去，要设置一个结束条件，在本节代码中有实例。  
    注：定义方法的格式比较复杂，本节的例子只能是其中的一小部分。
 #### 第8节 面向对象
 

 

