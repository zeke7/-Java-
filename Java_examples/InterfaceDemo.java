
interface Ai {
	public static final String WELMSG = "hello";
	public abstract void print();
}
interface Bi{
	public abstract void get();
}

class Ci implements Ai,Bi{

	@Override
	public void get() {
		System.out.println("From interface B...");
	}

	@Override
	public void print() {
		System.out.println("From interface A...");
		
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		Ci c = new Ci();
		
		Ai a = c; //向上转型
		Bi b = c; //向上转型
		
		a.print();
		b.get();
	}

}
