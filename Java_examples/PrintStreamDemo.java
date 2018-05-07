import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo {

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream pu = new PrintStream(new FileOutputStream(new File("d:"+File.separator+"PrintStreamDemo.txt")));
		pu.println("hello world");
		pu.println(11111);
		pu.close();
	}

}
