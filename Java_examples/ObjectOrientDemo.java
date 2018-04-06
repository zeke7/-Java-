
class Car{
	
	//Field 成员变量，属性
	int price;
	String brand;	
	
	
	//Method 方法
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String toString(){
		return "The price of the car is " + this.price + ", the brand is " + this.brand ;
	}
	
}

class Book{
	
	//将属性设置为私有属性，通过getter和setter进行访问
	private int price;
	private String title;
	
	//构造方法(无参)
	public Book(){
		System.out.println("我是用户定义的无参构造方法！！");
	}
	
	//构造方法(有参)。。重载构造方法
	public Book(int price, String title){
		this.price = price ;
		this.title = title;
		System.out.println("我是用户定义的构造方法！！");
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
		return "The price of the book is " + this.price + ", the title is " + this.title ;
	}
}

//简单JAVA实例
class Student{
	private int sid;
	private String sname;
	private String sgrade;
	
	public Student(int sid, String sname, String sgrade){
		this.sid = sid;
		this.sname = sname;
		this.sgrade = sgrade;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSgrade() {
		return sgrade;
	}
	public void setSgrade(String sgrade) {
		this.sgrade = sgrade;
	}
	@Override
	public String toString() {
		return "Student ID: " + this.sid + " Student Name: " + this.sname + " Student Grade: " + this.sgrade;  
	}
	
}


public class ObjectOrientDemo {

	public static void main(String[] args) {
		
		
		//声明并实例化对象
		Car car1 = new Car(); 
		
		// 通过**对象.属性** 来操作属性
		car1.brand = "BMW" ;
		car1.price = 1200000;
		
		//**对象.方法** 来操作方法
		System.out.println(car1.toString());
		System.out.println("**********************");
		
		
		
		
		
		
		
		
		//声明对象
		Car car2 = null;
		//实例化对象(开辟堆内存)
		car2 = new Car();
		// 通过**对象.属性** 来操作属性
		car2.brand = "BMW" ;
		car2.price = 1200000;
				
		//**对象.方法** 来操作方法
		System.out.println(car2.toString());
		System.out.println("**********************");
		
		if(car1.toString().equals(car2.toString())){
			System.out.println("Car1 和 Car2 一样。。。");
			System.out.println("**********************");
		}
		
		//声明对象,没有实例化
		Car car3 = null;
		//在操作属性或者方法是会出现 java.lang.NullPointerException 错误
		//car3.price = 10000000;
		//car3.toString();
		
		
		
		
		
		
		
		
		//car4, car5 各个占有一个自己的堆内存,互不影响
		Car car4 = new Car();
		car4.brand = "Benz" ;
		car4.price = 1300000;

		Car car5 = new Car();
		car5.brand = "Toyota" ;
		car5.price = 150000;
		System.out.println(car4.toString());
		System.out.println(car5.toString());
		System.out.println("**********************");
		
		//**对象引用传递实例**
		Car car6 = null;
		Car car7 = new Car();
		car7.brand = "Benzzzz" ;
		car7.price = 1333333;
		//引用传递,将car7的地址赋给了car6
		car6 = car7;  
		//car6 和 car7指向了同一块堆内存数据，car6进行修改时也会修改car7
		car6.price = 222222; 
		
		System.out.println(car6.toString());
		System.out.println(car7.toString());
		System.out.println("**********************");
		
		
		
		
		
		//外部对象无法直接调用并操作类中的属性
		Book book1 = new Book();
		// book1.price = 100;
		// book1.title = "Java";
		
		
		//通过setter和getter来操作类中的属性
		book1.setPrice(100);
		book1.setTitle("JAVA");
		System.out.println(book1.toString());
		
		//通过构造方法设置属性
		Book book2 = new Book(222,"JSP");
		System.out.println(book2.toString());
		System.out.println("**********************");
		
		
		
		//匿名对象，没有栈指向
		System.out.println(new Book(1222, "J2EE").toString());
		System.out.println("**********************");
		
		//测试简单JAVA类
		
		Student student = new Student(1,"Zeke","Freshman");
		student.setSid(1111);  //通过实例化对象 修改设置其sid
		System.out.println(student.toString());
		System.out.println("**********************");
		
		
		
		
		
		
		
		
	}

}
