package test3;


class MyThread implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
}


public class ThreadDemo4 {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.run(); //main Thread
		
		//系统自动给线程设置名字
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
		
		//手动设置
		new Thread(mt,"Thread A").start();
		new Thread(mt,"Thread B").start();
		new Thread(mt,"Thread C").start();
	}
}
