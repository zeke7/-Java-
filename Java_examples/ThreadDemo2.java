package test1;

//继承Thread类
//每个线程对象都在卖自己的10张票
//没有数据共享概念
class MyThread extends Thread{
	private int tic = 10;
	
	@Override
	public void run() {	
		for(int x = 0; x < 100; x ++){
			if(this.tic > 0){
				System.out.println("Tickets = " + this.tic -- );
			}
		}
	}
}

//Runnable接口
//一共卖10张票
class MyThread1 implements Runnable{
	private int tic = 10;
	
	@Override
	public void run() {	
		for(int x = 0; x < 100; x ++){
			if(this.tic > 0){
				System.out.println("Tickets = " + this.tic -- );
			}
		}
	}
}


public class ThreadDemo2 {
	public static void main(String[] args) {
	/*	
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		MyThread mt3 = new MyThread();
	
		mt1.start();
		mt2.start();
		mt3.start();
	*/
		
		MyThread1 mt = new MyThread1();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
	
		
	}
}
