//自定义异常
class AddException extends Exception{
	public AddException(String msg){
		super(msg);
	}
}



public class ExceptionDemo {

	public static void main(String[] args) throws Exception {
		
		/*
			System.out.println("Before ERROR....");
			//产生异常的代码,如果异常出现没有进行处理的话，程序就将中断执行
			System.out.println(10/0);
			System.out.println("After ERROR....");
		*/
		
		/*
		   Before ERROR....
		   java.lang.ArithmeticException: / by zero
		   After ERROR....
		   at ExceptionDemo.main(ExceptionDemo.java:18)
		*/
		try{
			System.out.println("Before ERROR....");
			//产生异常的代码,如果异常出现没有进行处理的话，程序就将中断执行
			System.out.println(10/0); //此异常语句后的程序都不执行
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("After ERROR....");
		}
		
		//有throws关键字的方法，在被调用的时候要使用try...catch语句进行异常处理
		
		try{
			div(10,2);
			System.out.println("Before ERROR....");
			div(10,0);
			System.out.println("After ERROR....");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		//或者在主方法上直接抛出异常  throws Exception
		//System.out.println("在主方法上直接抛出异常  throws Exception...");
		//div(10,0);
		
		//自己定义的异常
		try{
			System.out.println("自己定义的异常....");
			throw new Exception("自己定义的异常");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		//自定义异常
		int num = 10;
		try{
			if(num < 100){
				throw new AddException("the number is too small");
			}
		}catch(AddException e){
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
			
	}
	
	public static void div(int x, int y) throws Exception{
			System.out.println(x/y);
	}

}
