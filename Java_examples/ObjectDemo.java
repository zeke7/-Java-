

class Cara extends Object{
	
	private int price;
	
	public Cara(int price){
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cara other = (Cara) obj;
		if (price != other.price)
			return false;
		return true;
	}
	
	
	
}
class Carb extends Object{
	@Override
	public String toString() {
		return "This is CAR B";
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		Object obja = "Hello";
		String str = (String) obja;
		
		//如果没有覆写toString()方法，就会输出对象的编码
		Cara a = new Cara(100);
		System.out.println(a);
		
		//覆写toString()方法
		Carb b = new Carb();
		System.out.println(b);
		
		//Object 类可以接收一切类型的对象
		Object obj = new String []{"aaa","bbb","ccc"};
		System.out.println(obj);
		
		if(obj instanceof String[]){
			//向下转型
			String[] data = (String []) obj;
			for(int i = 0; i < data.length; i++){
				System.out.println(data[i]);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
