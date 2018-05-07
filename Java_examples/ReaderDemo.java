import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;

public class ReaderDemo {
	public static void main(String[] args) throws IOException {
		mkfile();
		//定义输入文件
		File file = new File("D:" + File.separator + "FileDemo"+ 
				   File.separator + "FileDemo2" + File.separator +"FileDemoTest3.txt");
						
		if(file.exists()){
			
			Reader in = new FileReader(file);
			
			char data [] = new char [1024];
			int len = in.read(data);
			
			//关闭资源
			in.close();
			System.out.println("[" + new String(data,0,len) + "]");
			
		}
		
	}
	
	public static void mkfile() throws IOException{
		
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
	}
}
