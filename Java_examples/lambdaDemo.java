interface IBook{
	public void print() ;
}

interface IMessage{
	public void print(String str) ;
}

public class lambdaDemo {

	public static void main(String[] args) {
	
		//匿名内部类实现。。。
		getTitle(new IBook(){
			@Override
			public void print() {
				System.out.println("This is book title...");
			}
			
		});
		
		//lambda表达式, 无参
		getTitle(()->System.out.println("This is book title...lambda"));
		
		//lambda表达式, 有参
		getMsg((s)->System.out.println(s));
		
		getMsg((s)->{
			s = s.toUpperCase();
			System.out.println(s);	
		});
		
		
		
		
	}
	public static void getTitle(IBook book){
		book.print();
	}
	
	public static void getMsg(IMessage msg){
		msg.print("Hello world");
	}
	
}
