import java.io.IOException;

public class RuntimeDemo {

	public static void main(String[] args) throws InterruptedException {
		Runtime run = Runtime.getRuntime();
		System.out.println("1. MAX = " + run.maxMemory());
		System.out.println("2. TOTAL = " + run.totalMemory());
		System.out.println("3. FREE = " + run.freeMemory());
		
		//产生垃圾
		String str = "";
		for(int i = 0; i < 2000; i++){
			str += i;
		}
		
		System.out.println("1. MAX = " + run.maxMemory());
		System.out.println("2. TOTAL = " + run.totalMemory());
		System.out.println("3. FREE = " + run.freeMemory());
		
		//释放垃圾空间
		run.gc();
		System.out.println("1. MAX = " + run.maxMemory());
		System.out.println("2. TOTAL = " + run.totalMemory());
		System.out.println("3. FREE = " + run.freeMemory());
		
		//Runtime可以调用本机的可执行程序，创建进程 exec()
		try {
			Process pro = run.exec("mspaint.exe");
			Thread.sleep(8000);
			pro.destroy();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
