import java.io.File;
import java.text.SimpleDateFormat;

public class FileDemo {

	public static void main(String[] args) throws Exception{
		
		// File.separator路径分割符
		File file1 = new File("D:"+File.separator+"FileDemoTest1.txt");
		
		if(file1.exists()){   //判断文件是否存在
			//文件删除
			file1.delete();
		}else{
			//文件创建
			file1.createNewFile();
		}
		
		System.out.println(file1.exists());
		
	
		File file2 = new File("D:"+File.separator+"FileDemo"+File.separator+"FileDemo1"+File.separator+"FileDemoTest2.txt");
		//判断父路径是否存在
		if(!file2.getParentFile().exists()){
			file2.getParentFile().mkdirs();
		}else{
			file2.createNewFile();
		}
		
		//判断文件大小
		System.out.println(file2.length());
		//判断是否是文件
		System.out.println(file2.isFile());
		//判断是否是文件夹
		System.out.println(file2.isDirectory());
		//最后修改时间
		System.out.println("Last Modified: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(file2.lastModified()));
		
		
	}

}
