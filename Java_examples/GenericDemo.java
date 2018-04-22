class Msg<T>{
	private T msg;

	public T getMsg() {
		return msg;
	}

	public void setMsg(T msg) {
		this.msg = msg;
	}
	
}

//泛型接口
interface IMsg<T>{
	public void print(T t);
}

//接口的子类 1, 继续使用泛型
class MsgImpl<T> implements IMsg<T>{

	@Override
	public void print(T t) {
		System.out.println(t);
	}
	
}

//接口的子类 2, 定义一个明确的泛型类型
//......

public class GenericDemo {

	public static void main(String[] args) {
		
		Msg<String> m1 = new Msg<>();
		m1.setMsg("Hello");
		printMsg(m1);
		
		Msg<Integer> m2 = new Msg<>();
		m2.setMsg(111);
		printMsgNumber(m2);
		
		//接口子类实例化对象
		IMsg<String> m3 = new MsgImpl();
		m3.print("Hello world");
		
		

	}
	
//	public static void printMsg(Msg<?> msg){
//		System.out.println(msg.getMsg());
//	}
	
	public static void printMsg(Msg<? super String> msg){
		System.out.println(msg.getMsg());
	}
	
	public static void printMsgNumber(Msg<? extends Number> msg){
		System.out.println(msg.getMsg());
	}


}
