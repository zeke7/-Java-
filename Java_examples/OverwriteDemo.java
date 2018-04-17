class A{
	public void print(){
		//如果B中没有覆写，B类实例化将会调用此方法
		System.out.println("The print method in class A");
	}
}
class B extends A{
	public void print(){
		//如果B中进行了覆写，B类实例化将会调用此方法
		System.out.println("The print method in class B");
	}
}


public class OverwriteDemo {

	public static void main(String[] args) {
		B b = new B();
		b.print();
	}

}
