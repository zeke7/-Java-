import java.io.IOException;
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input Your Birthday......: ");
		if(scan.hasNext("\\d{4}-\\d{2}-\\d{2}")){
			String bir = scan.next("\\d{4}-\\d{2}-\\d{2}");
			System.out.println("Content: " + bir);
		}else{
			System.out.println("Not correct form...");
		}
		scan.close();
	}
}
