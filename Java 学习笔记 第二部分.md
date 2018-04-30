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







