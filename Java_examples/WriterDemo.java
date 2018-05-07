import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("D:" + File.separator + "FileDemo"+ 
				File.separator + "FileDemo2" + File.separator +"FileDemoTest4.txt");
			
		if(!file.getParentFile().exists()){
			file.getParentFile().mkdirs();
		}
		
		Writer out = new FileWriter(file);
	
		String str = "Hey, my name is Zeke...";
	
		out.write(str);
		
		out.close();
	}

}
