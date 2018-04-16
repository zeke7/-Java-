
public class StringDemo2 {

	public static void main(String[] args) {
		String str1 = "helloworld";
		
		// charAt()方法返回指定index的字符
		char a = str1.charAt(0);
		System.out.println(a);
		
		//toCharArray() 将字符串转换为字符数组
		char [] charArray = str1.toCharArray();
		System.out.println("字符数组......");
		for(int i = 0; i < str1.length(); i ++){
			System.out.print(charArray[i] + ",");
		}
		System.out.println("..............");
		
		//字符串变为字节数组方便数据传输和转换，处理乱码
		byte [] byteArray = str1.getBytes();
		System.out.println("字节数组......");
		for(int i = 0; i < str1.length(); i ++){
			System.out.print(byteArray[i] + ",");
		}
		System.out.println("..............");
		
		//equals()进行字符串比较，区分大小写
		String str2 = "HELLOWORLD";
		System.out.println(str1.equals(str2));
		//equalsIgnoreCase()进行字符串比较，区分大小写
		System.out.println(str2.equalsIgnoreCase(str2));
		
		//通过字符编码判断两个字符串大小
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
		
		//判断子字符串是否存在
		System.out.println(str1.contains("hello"));
		
		//indexOf()从前向后查找字符串，返回第一个字符的位置
		System.out.println(str1.indexOf("world"));
		
		//lastIndexOf()从后向前查找字符串，返回第一个字符的位置
		System.out.println(str1.lastIndexOf("world"));
		
		//startWith() 是否以指定字符串开头
		System.out.println(str1.startsWith("hello"));
		
		//endsWith() 是否以指定字符串结尾
		System.out.println(str1.endsWith("world"));
		
		//字符串替换，全部替换
		System.out.println(str1.replaceAll("o", "-"));
		
		//替换首个符合要求的字符
		System.out.println(str1.replaceFirst("o", "-"));
		
		//字符串截取
		System.out.println(str1.substring(0, 5));
		
		//字符串拆分
		String str3 = "hello.world.good.morning";
		String strArray [] = str3.split("\\.");
		System.out.println("字符串拆分......");
		for(int i = 0; i < strArray.length; i ++){
			System.out.print(strArray[i] + ",");
		}
		System.out.println("..............");
		
		//字符串连接
		System.out.println(str1.concat(str2));
		
		//大写小写转换
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toLowerCase());
		
		//去掉开头结尾的空格
		String str4 = " h h h h h h    ";
		System.out.println("["+str4.trim()+"]");
		
	}

}
