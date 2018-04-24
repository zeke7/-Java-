package test2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

//Callable 接口
class MyThread implements Callable<String>{
	private int tic = 10;

	@Override
	public String call() throws Exception {
		
		for(int x = 0; x < 100; x ++){
			if(this.tic > 0){
				System.out.println("Tickets = " + this.tic -- );
			}
		}
	
		return "Sold out";
	}
}


public class ThreadDemo3 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyThread mt1 = new MyThread();
		FutureTask<String> task1 = new FutureTask<String>(mt1);
		MyThread mt2 = new MyThread();
		FutureTask<String> task2 = new FutureTask<String>(mt2);
		
		new Thread(task1).start();
		new Thread(task2).start();
		
		System.out.println("A " + task1.get() );
		System.out.println("B " + task2.get() );
	}
}
