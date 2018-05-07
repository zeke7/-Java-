import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MemoStreamDemo {

	public static void main(String[] args) throws IOException {
		String str = "HelloWorld!!!";
		
		//使用内存操作流实现转换
		InputStream input = new ByteArrayInputStream(str.getBytes());
		OutputStream output = new ByteArrayOutputStream();
	
		int temp = 0;
		while((temp = input.read()) != -1){
			output.write(Character.toUpperCase(temp));
		}
		
		System.out.println(output);
	
		input.close();
		output.close();
	
	}

}
