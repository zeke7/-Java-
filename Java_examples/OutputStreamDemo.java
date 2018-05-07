import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("D:" + File.separator + "FileDemo"+ File.separator + "FileDemo2" + File.separator +"FileDemoTest3.txt");
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
