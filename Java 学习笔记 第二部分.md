# **Java 学习笔记 第二部分**	
***
* [第16节 异常](#第16节-异常)  
* [第17节 泛型](#第17节-泛型)  
* [第18节 枚举](#第18节-枚举)
* [第19节 Lambda表达式](#第19节-lambda表达式)
* [第20节 方法引用](#第20节-方法引用) 
* [第21节 线程](#第21节-线程)
* [第22节 基础类库](#第22节-基础类库)
* [第23节 日期处理](#第23节-日期处理)
* [第24节 正则表达式](#第24节-正则表达式)
* [第25节 JAVA IO操作](#第25节-java-io操作)
***
### 第16节 异常  
本节示例代码：[ExceptionDemo](/Java_examples/ExceptionDemo.java)  
异常是导程序中断的一种指令，如果异常出现没有进行处理的话，程序就将中断执行  
对于异常的处理就是，即使异常出现也要使得程序尽可能地执行完毕  
* 对于异常的处理  
```java
		try{
				//有可能出现异常的语句
		}catch(异常类型 名称){
			 	//可以有多个catch语句捕获不同的异常
				//捕获异常后的处理
				//printStackTrace() 打印异常的完整信息
		}finally{
				//不管是否出现异常，都执行的代码
		}
 ```
* 异常的处理流程  
    * 程序出现异常
    * JVM自动实例化异常对象，输出异常信息，不执行后面的程序
    * 如果没有catch，产生异常会使程序中断
    * catch语句会捕获try中产生的异常对象，如果捕获到，将会在catch中做一些处理
    * 不管结果如何，都会执行finally中的程序
* 所有的异常类都是Throwable的子类，有2个子类：Error和Exception
    * Error: JVM错误，程序还没有执行
    * Exception: 程序执行后出现异常
* throws关键字  
	 有throws关键字的方法，在被调用的时候要使用try...catch语句进行异常处理
	 或者在主方法上直接抛出异常  throws Exception
* throw关键字 
   抛出异常实例对象
* RuntimeException
    RuntimeException可以选择性处理，不处理的话JVM会进行默认处理
### 第17节 泛型  
本节示例代码：[GenericDemo](/Java_examples/GenericDemo.java)   
* 泛型能采用的类型只能是类，而不能是基本数据类型  
* 在泛型接受参数时，为了使参数统一，使用通配符 “？” 来表示接收的类型
	* ？extends 类：设置泛型上限，设置为此类，或者此类的子类。
	* ？super 类：设置泛型下限，设置为此类，或者此类的父类。
### 第18节 枚举  
本节示例代码：[EnumDemo](/Java_examples/EnumDemo.java)   
### 第19节 Lambda表达式 
本节示例代码：[LambdaDemo](/Java_examples/LambdaDemo.java)  
### 第20节 方法引用
本节示例代码：[MethodReferDemo](/Java_examples/MethodReferDemo.java)  
* 引用静态方法：类名称::static 方法名称
* 引用某个对象的方法：实例化对象::普通方法  
* 引用特定类型的方法：特定类::普通方法
* 引用构造方：类名称::new  
实现函数引用必须使用接口，接口里面只能存在一个方法。  
需要增加注解声明：@FunctionalInterface  
* 功能性接口(Function) - 接收一个参数，返回一个处理结果
* 消费型接口(Consumer) - 接收数据
* 供给型接口(Supplier) - 不接收参数，返回一个结果
* 断言型接口(Predicate) - 判断
### 第21节 线程
本节示例代码：  
[ThreadDemo1](/Java_examples/ThreadDemo1.java)  
[ThreadDemo2](/Java_examples/ThreadDemo2.java)  
[ThreadDemo3](/Java_examples/ThreadDemo3.java)  
[ThreadDemo4](/Java_examples/ThreadDemo4.java)  
[ThreadDemo5](/Java_examples/ThreadDemo5.java)

进程：一次程序的完整运行，计算机的资源对这个进程进行服务。同一个时间段上，会有多个进程轮流抢占计算机的资源，某一个时间点上只有一个进程运行。  

### 线程：一个进程上有多个线程，比进程更快，所占资源更少
* 两种途径：
    * 继承Thread类
    * 实现Runnable接口(Callable接口)  
**不管使用什么方法，启动多线程一定依靠Thread类完成**

* 继承Thread类
    * 线程操作主体类中必须覆写Thread类中提供的run()方法
    * 多线程启动的方法是Thread类中的start()方法，执行的方法体是run()方法中
* 实现Runnable接口
    * 避免单继承
    * 覆写接口中提供的run()方法
#### 两种方式的区别：
    * Runnable接口可以比Thread类能够更好的实现数据共享(多个线程访问同一资源的操作)
    * Thread类是Runnable接口的子类
    * 用Runnable实现线程主体类，用Thread类启动线程。

* 另一种实现方式：Callable接口
    * 可以返回一个结果
    * Thread类中没有直接支持Callable接口的多线程应用
    * FutureTask类,接收Callable接口对象从而取得call()方法的返回结果
    * FutureTask类是Runnable接口子类，可以使用Thread类的构造来接收FutureTask对象
    * 线程执行结束后使用FutureTask的父接口Future中的get()方法完成
 
* 线程的命名与取得  
    * 线程的名字在其启动之前进行定义  
    * 可以使用Thread的构造方法给线程设置名称  
    * mian方法(main线程，主方法就是主线程），在主方法上创建的线程都是子线程  

* 当使用Java程序去解释一段程序的时候，操作系统会一个新的进程，mian是这个进程上的一个线程  

* JVM 进程启动的时候至少启动两个线程  
    * main线程  
    * gc线程  

* 线程的休眠：使线程的执行速度变慢  

* 线程优先级  
    * 设置优先级 setPriority(int newPriority)  
    * 取得优先级 getPriority()  

### 线程的同步和死锁  
* 同步问题：判断和修改数据是分开完成的
    * 实现线程同步，使用synchronized关键字
    * 异步操作速度快于同步操作，但是同步操作数据的安全性较高
* 死锁：线程一直等待
### 第22节 基础类库
本节示例代码：  
[StringBufferDemo](/Java_examples/StringBufferDemo.java)  
[RuntimeDemo](/Java_examples/RuntimeDemo.java)  
[SystemDemo](/Java_examples/SystemDemo.java) 
#### StringBuffer
StringBuffer类的内容是可以进行修改的，而String的内容无法进行修改  
    * String 与 StringBuffer 都是CharSequence接口的子类

String 与 StringBuffer 两类对象无法进行直接转换  
    * 使用StringBuffer类的构造方法进行转换String  
    * 利用append()方法转换String  
    * 使用toString()方法转换StringBuffer  

StringBuffer的常用方法:  
    * 字符串反转: reverse()  
    * 指定索引位置增加数据: insert()  
    * 删除部分数据: delete()  

StringBuilder类属于异步方法  

#### Runtime
* Runtime类是直接与本地运行有关的相关属性的集合
* Runtime类定义的时候它的构造方法已经被私有化了，保证进程只有一个Runtime对象
* 常用方法
    * 返回所有可用空间 totalMemory()
    * 最大可用空间 maxMemory()
    * 空余内存空间 freeMemory()
    * gc()释放垃圾空间
* Runtime可以调用本机的可执行程序，创建进程 exec()

#### System类
* 取得当前系统时间 currentTimeMillis()
* finalize()方法，回收前使用

### 第23节 日期处理
本节示例代码：  
[DateDemo](/Java_examples/DateDemo.java)  
* SimpleDateFormat格式化日期时间: 
    * public SimpleDateFormat(String pattern) 构造方法
    * public final String format(Date date) 将Date转换为String
    * public Date parse(String source)throws ParseException 将String转换为Date
* 转换格式："yyyy-MM-dd HH:mm:ss.SSS" ==> "年-月-日 小时:分钟:秒.毫秒"  

### 第24节 正则表达式
本节示例代码：  
[RegexDemo](/Java_examples/RegexDemo.java)  
RegEx正则表达式

* java.util.regex包中有两个类
    * Pattern类，此类对象的取得必须使用compile()方法: 编译正则
    * Matcher类，通过Pattern类取得

* 正则标记  
    * 存在java.util.regex.Pattern中

* 单个字符(数量:1)
    * 字符: 表示由一位字符组成
    * \\: 表示转义字符"\"
    * \t: 表示一个"\t"符号
    * \n: 匹配换行

* 字符集(数量:1)  
    [abc]: 表示可能是a或b或c  
    [^abc]: 表示不是a,b,c中的任意一个  
    [a-z]:所有的小写字母  
    [a-zA-Z]: 所有字母  
    [0-9]:表示任意一位数字  
 
* 简化的字符集表达式(数量:1)
    * .: 表示任意的一位字符
    * \d: 一个数字 [0-9]
    * \D: 等于[^0-9]
    * \s: 表示任意的空白字符
    * \S: 表示任意的非空白字符
    * \w: 等于[a-zA-Z_0-9] 由任意的字母，数字，_所组成  
    * \W: 等于[^a-zA-Z_0-9] 由不是任意的字母，数字，_所组成

* 边界匹配
    * ^: 正则的开始
    * $: 正则的结束

* 数量表达
    * 正则? : 表示出现0或1次
    * 正则+ : 表示出现1次或1次以上
    * 正则* : 表示出现0，1次或1次以上
    * 正则{n} : 表示正则正好出现n次
    * 正则{n,} : 表示正则出现n次及以上
    * 正则{n,m} : 表示正则出现n到m次

* 逻辑运算:
    * 正则1正则2: 正则1判断完成之后继续判断正则2
    * 正则1|正则2: 满足正则1或2一个条件即可
    * (正则): 将多个正则作为一组，可以为这一组单独设置出现的次数

* String 类对正则的支持:
    * matches()
    * replaceAll()
    * replaceFirst()
    * split()

### 第25节 JAVA IO操作
JAVA IO操作  

[FileDemo](/Java_examples/FileDemo.java)  
[OutputStreamDemo](/Java_examples/OutputStreamDemo.java)  
[InputStreamDemo](/Java_examples/InputStreamDemo.java)  
[WriterDemo](/Java_examples/WriterDemo.java)  
[ReaderDemo](/Java_examples/ReaderDemo.java)  
[MemoStreamDemo](/Java_examples/MemoStreamDemo.java)  
[PrintStreamDemo](/Java_examples/PrintStreamDemo.java)  
[BufferedReaderDemo](/Java_examples/BufferedReaderDemo.java)  
[ScannerDemo](/Java_examples/ScannerDemo.java)  
[SerializableDemo](/Java_examples/SerializableDemo.java)  

* 五个核心类
    * File
    * InputStream
    * OutputStream
    * Reader
    * Writer

* 一个核心接口
    * Serializable

* File类  
    * File类是唯一一个与文件本身操作有关的类，包括文件的创建、删除等操作  
    * 在java.io操作的过程中，会有延迟的情况出现
    * 有取得文件信息内容的操作功能

* 对文件内容进行操作：
    * 只能使用字节流或者字符流
    * 通过File类定义一个要操作的文件路径
    * 通过字节流或字符流的子类对象为父类实例化
    * 进行数据的读写操作
    * 资源操作必须关闭

* java.io包定义了两类流
    * 字节流：InputStream, OutputStream
    * 字符流：Reader, Writer

#### 字节流：InputStream, OutputStream

* OutputStream类 专门进行字节数据输出
    * 输出方法1 ：输出单个字节
    * 输出方法2 ：输出全部字节数组
    * 输出方法3 ：输出部分字节数组 （重点）

* OutputStream类为抽象类，必须使用子类进行实例化操作
* 例：FileOutputStream子类（关注构造方法）
    * **创建或覆盖已有文件 FileOutputStream(File file)**
    * 文件追加 FileOutputStream(File file, boolean append)

* InputStream类
    * 数据读取方式1: read() 返回int -- 读取单个字节，没有数据可以读，返回-1。
    * 数据读取方式2: read() 返回int -- 读取所有字节，返回读取的数据长度，读取到结尾返回-1
    * 数据读取方式3: read() 返回int -- 读取多个字节，返回读取部分数据的长度，读取到结尾返回-1

#### 字符流：Reader, Writer

* Writer
    * 能够输出字符串
    * 使用FileWriter子类操作文件

* Reader
    * 使用FileReader子类操作文件

### 字节流和字符流的区别

* 字节流直接与终端进行数据交互
* 字符流需要将数据经过缓冲区处理后才可以输出

* 字节流输出如果没有使用close()进行资源关闭，结果不会收到影响
* 字符流没有使用close()，缓冲区中的内容不会被清空，就会没有输出。可手工调用flush()方法强制清空缓冲区

* 对于字节数据的处理比较多,例如: 图片，音乐，电影，文字等
* 字符流对中文的有效处理

### 使用内存进行输入与输出
* 字节内存流：ByteArrayInputStream,ByteArrayOutputStream
* 字符内存流：CharArrayReader, CharArrayWriter

### 打印流：PrintStream(字节),PrintWriter(字符)

### 缓冲区的数据读取
* 对中文进行处理：
    * 字符缓冲区流：**BufferedReader**,BufferedWriter
    * 字符缓冲区流：BufferedInputStream,BufferedOutputStream

* BufferedReader 中的 readLine()方法返回 String

* Scanner 类中 useDelimiter()方法设置的读取的分隔符
* 程序输出使用打印流，程序输入使用Scanner

#### 对象序列化  
将保存在内存中的对象数据转换为二进制数据流进行传输的操作，如果对象要被序列化，必须实现java.io.Serializable接口（标识接口）  











