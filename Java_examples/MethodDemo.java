
public class MethodDemo {

	public static void main(String[] args) {
		
		//因为是静态方法所以可以直接调用		
		//调用没有返回值的方法
		doSomething(); 
		//调用没有返回值，有参数的方法
		double money = 123.33;
		getSomething(money);
		
		//调用有返回值，有参数的方法
		System.out.println("I got twice money back " + giveSomething(money));
		
		
		//方法重载调用
		int i = 2; 
		int j = 3;
		double x = 1.1;
		double y = 2.2;
		double z = 3.3;
		
		//调用第一个add方法
		System.out.println(add(i,j));
		
		//调用第二个add方法
		System.out.println(add(x,y));
		
		//调用第三个add方法
		System.out.println(add(x,y,z));
		
		//方法的递归调用
		//从1加到100
		System.out.println(sumUp(100));
	}
	
	//没有返回值的方法
	public static void doSomething(){
		System.out.println("Do Something here....");
	}
	
	//没有返回值，有参数的方法
	public static void getSomething(double money){
		System.out.println("I got these " + money + " from that guy..");
	}
	
	//有返回值，有参数的方法
	public static double giveSomething(double money){
		System.out.println("I got these " + money + " from that guy, and send twice back...");
		return money * 2;
	}
	
	//方法重载, 根据传入参数的不同会进入不同的方法
	public static int add(int x,int y){
		System.out.println("调用第一个add方法");
		return x + y;
	}
	
	public static double add(double x,double y){
		System.out.println("调用第二个add方法");
		return x + y;
	}
	
	public static double add(double x,double y,double z){
		System.out.println("调用第三个add方法");
		return x + y + z;
	}
	
	
	//方法的递归调用
	public static int sumUp(int num){
		if(num == 1){
			return 1;
		}
		return num + sumUp(num - 1);
	}
	
	
	

}
