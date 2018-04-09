
public class StringDemo1 {

	public static void main(String[] args) {
		
		//直接赋值
		String str1 = "Hello world";
		String str2 = "Hello world";
		String str3 = "Hello world";
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str2 == str3);
		
		//使用new关键字，实例化String对象
		String str4 = new String("Hello world");
		
		//String 比较
		String s1 = "hello";
		String s2 = new String("hello");
		String s3 = s2;  
		
		// "==" 比较， 比较的是字符串对象的地址
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);
		
		// equals()方法，内容比较
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		
		//String的匿名对象"hello"
		String in = null;
		if("hello".equals(in)){
			System.out.println("Hello");
		}
		
		
		

	}

}
