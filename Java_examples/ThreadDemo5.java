package test4;


class MyThread implements Runnable{
	
	private int tic = 50;
	
	@Override
	public void run() {
		//不同步的情况
		for(int i = 0; i < 20; i ++){
			//同步代码块
			/*
			synchronized(this){    //当前操作只允许一个线程进入
				try {
					//线程的休眠
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(this.tic > 0){
					System.out.println(Thread.currentThread().getName() + ", tickets = " + this.tic --);
				}
			}
			*/
			
			//调用同步方法
			this.sale();
			
		}
	}
	
	//同步方法
	public synchronized void sale(){
		try {
			//线程的休眠
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(this.tic > 0){
			System.out.println(Thread.currentThread().getName() + ", tickets = " + this.tic --);
		}
	}
	
}


public class ThreadDemo5 {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
	
		Thread t1 = new Thread(mt,"Thread A");
		Thread t2 = new Thread(mt,"Thread B");
		Thread t3 = new Thread(mt,"Thread C");
		
		//设置优先级
		//t1.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
