import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamDemo {

	public static void main(String[] args) throws IOException {
		
		//定义输入文件
		File file = new File("D:" + File.separator + "FileDemo"+ 
			File.separator + "FileDemo2" + File.separator +"FileDemoTest3.txt");
		
		if(!file.getParentFile().exists()){
			file.getParentFile().mkdirs();
		}
		
		//OutputStream实例化子类
		OutputStream op = new FileOutputStream(file);
		//进行文件内容的追加
		//OutputStream op = new FileOutputStream(file, true);
		
		//进行文件内容的输出
		String str = "My name is Zeke...";
		byte data [] = str.getBytes();
		op.write(data);
		
		//关闭资源
		op.close();
		
		//判断文件是否存在
		if(file.exists()){
			//使用FileInputStream子类进行读取
			InputStream input = new FileInputStream(file);
			
			//准备容器
			byte data2 [] = new byte [1024];
			int len = input.read(data2);
			
			//关闭资源
			input.close();
			System.out.println("[" + new String(data2,0,len) + "]");
			
		}
		
		//利用while读取
		//准备容器
		InputStream input1 = new FileInputStream(file);
		
		byte data1 [] = new byte [1024];
		
		int foot = 0;
		int temp = 0;
		while((temp = input1.read()) != -1){
			data1[foot ++] = (byte)temp;
		}

		input1.close();
		System.out.println("["+ new String(data1,0,foot) +"]");
	}

}
