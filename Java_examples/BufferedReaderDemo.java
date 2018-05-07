import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader buf1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input something: ");
		String str = buf1.readLine();
		System.out.println("Content: " + str);
		buf1.close();
		
		//创建一个文件
		PrintStream pu = new PrintStream(new FileOutputStream(new File("d:"+File.separator+"PrintStreamDemo.txt")));
		pu.println("hello world");
		pu.println(11111);
		pu.close();
		
		File file = new File("d:"+File.separator+"PrintStreamDemo.txt");
		BufferedReader buf2 = new BufferedReader(new FileReader(file));
		String str1 = null;
		while((str1 = buf2.readLine()) != null){
			System.out.println(str1);
		}
		
		buf2.close();
		
		
	}

}
