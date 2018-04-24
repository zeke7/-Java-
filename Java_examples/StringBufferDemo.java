public class StringBufferDemo {

	public static void main(String[] args) {
		//StringBuffer类使用append()方法连接字符串
		StringBuffer buf = new StringBuffer();
		buf.append("Hello ").append("World !!!");
		
		
		
		String str = "Hello World!";
		//使用StringBuffer类的构造方法进行转换
		
		StringBuffer buf1 = new StringBuffer(str);
		System.out.println(buf1);
		
		//利用append()方法

		StringBuffer buf2 = new StringBuffer();
		buf2.append(str);
		System.out.println(buf2);
	}
	
	
}
