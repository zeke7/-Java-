

abstract class AbstractA{
	//有方法的实际方法
	public void print(){
		System.out.println("Specific method.....");
	}
	//抽象方法
	public abstract void printAbstract() ;
	
	
	private static class AbstractB extends AbstractA{
		@Override
		public void printAbstract() {
			System.out.println("AbstractB print method......");
		}
	}
	
	//为用户隐藏一些不需要知道的子类
	public static AbstractA getInstance(){
		return new AbstractB();
	}
	
}

class RealA extends AbstractA{

	@Override
	public void printAbstract() {
		System.out.println("RealA print method......");
	}
	
}

public class AbstractDemo {

	public static void main(String[] args) {
		//向上转型
		AbstractA a = new RealA();
		//被子类覆写的方法
		a.printAbstract();

		AbstractA.getInstance().printAbstract();
	}

}
