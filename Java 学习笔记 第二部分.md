# **Java 学习笔记 第二部分**	
***
* [第16节 异常](#第16节-异常)  
* [第17节 泛型](#第17节-泛型)  
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
