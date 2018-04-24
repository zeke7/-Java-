//继承Thread类

/*
class MyThread extends Thread{
	private String title;
	public MyThread(String title){
		this.title = title;
	}
	
	@Override
	public void run() {	
		for(int x = 0; x < 10; x ++){
			System.out.println("Thread" + this.title + " --> " + x);
		}
	}
}
*/

//Runnable接口

class MyThread implements Runnable{
	private String title;
	public MyThread(String title){
		this.title = title;
	}
	
	@Override
	public void run() {	
		for(int x = 0; x < 10; x ++){
			System.out.println("Thread" + this.title + " --> " + x);
		}
	}
}



public class ThreadDemo1 {

	public static void main(String[] args) {
		MyThread mt1 = new MyThread("A");
		MyThread mt2 = new MyThread("B");
		MyThread mt3 = new MyThread("C");
	
		Thread m1 = new Thread(mt1);
		Thread m2 = new Thread(mt2);
		Thread m3 = new Thread(mt3);
	
		m1.start();
		m2.start();
		m3.start();
		
	}

}
