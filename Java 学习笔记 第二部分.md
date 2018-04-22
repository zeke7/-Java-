# **Java 学习笔记 第二部分**	
***
* [第16节 异常](#第16节-异常)  
* [第17节 泛型](#第17节-泛型)  
* [第18节 枚举](#第18节-枚举)
* [第19节 Lambda表达式](#第19节-lambda表达式)
* [第20节 方法引用](#第20节-方法引用) 
* [第21节 线程](第21节-线程)
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

