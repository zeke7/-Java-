//代替多例设计模式
//继承Enum

//枚举张定义的构造方法不能够使用public声明
//枚举对象必须放在首行

interface Bigcolor{
	public String getColor();
}
enum Color implements Bigcolor{
	RED("red"),GREEN("green"),BLUE("blue");  //此处为实例化对象
	private String attr;
	private Color(String attr){
		this.attr = attr;
	}
	@Override
	public String toString() {
		return this.attr;
	}
	@Override
	public String getColor() {
		return this.attr;
	}
	
}

public class EnumDemo {
	
	public static void main(String[] args) {
		Color red = Color.RED;	
		System.out.println(red);
		
		for(Color c : Color.values()){
			System.out.println(c.ordinal() + " - " +c.name());
		}
		
		//添加构造方法，属性...
		for(Color c : Color.values()){
			System.out.println(c);
		}
		
		//实现接口
		Bigcolor green = Color.GREEN;
		System.out.println(green.getColor());
		
	}
}
