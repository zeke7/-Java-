class Book{
	
	private int price;
	private String title; 
	private static String subtitle  = "JAVA";	
	
	public static String getSubtitle() {
		return subtitle;
	}

	public static void setSubtitle(String subtitle) {
		Book.subtitle = subtitle;
	}

	public Book(){
	}
	
	public Book(int price, String title){
		this.price = price ;
		this.title = title;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Price: " + this.price + ", title: " + this.title + ", subtitle: " + subtitle;
	} 
}

//Static 可以用来声明属性和方法

public class StaticDemo {
	public static void main(String[] args) {
		
		Book b1 = new Book(111,"Android");
		Book b2 = new Book(111,"c++");
		Book b3 = new Book(111,"c#");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println("...................");
		
		/*static 属性为全局属性, 一个对象对他进行修改后, 此属性在其他对象中也被修改
		可以使用 类直接调用此属性进行修改 (在没有实例化对象的情况下也可以操作此属性)
		*/
		
		/*subtitle的getter和setter都为static方法， 
		可以在没有实例化对象的情况下调用并修改subtitle属性
		*/
		
		//b1.subtitle = "Ruby";
		b1.setTitle("Ruby");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println("...................");
		
		//Book.subtitle = "C++";
		Book.setSubtitle("C++");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		//static方法不能直接访问 非static属性或者方法
		//非static属性或者方法 没有限制调用其他方法，但其本身必须被实例化对象调用
		toPrintStatic();
		new StaticDemo().toPrint();
		
	}
	
	public void toPrint(){
		System.out.println("Print Something......");
	}
	
	public static void toPrintStatic(){
		System.out.println("Print Something......");
	}
}
