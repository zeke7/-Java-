
public class SystemDemo {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		String str = "";
		for(int i = 0; i < 30000; i++){
			str += i;
		}		
		long end = System.currentTimeMillis();
		
		System.out.println("Time: " + (end - start));
		
	}

}
