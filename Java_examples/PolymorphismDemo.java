class A{
	public void print(){
		System.out.println("The print method in class A");
	}
}
class B extends A{
	public void print(){
		System.out.println("The print method in class B");
	}
	public void methodB(){
		System.out.println("Extended method.....");
	}
	
}

class C extends A{
	public void print(){
		System.out.println("The print method in class C");
	}
}

public class PolymorphismDemo {

	public static void main(String[] args) {
		
		//向上转型
		A a1 = new B();    //看new的是哪一个类
		A a2 = new C();
		a1.print();
		a2.print();
		
		//向下转型
		B b = (B) a1;   
		b.methodB();  //调用子类中的特殊方法
		b.print();
		
		//使用instanceof来判断是否是某类对象
		System.out.println(a1 instanceof A);
		System.out.println(a1 instanceof B);
		
		
	}

}
