
public class DataTypeDemo {

	public static void main(String[] args) {
		/*第4节 数据类型 */
		
		//整形 int, 以及 long, byte类型的转换
		int num = 20; // 常量
		num = num + 1; // num 为变量，此处将num的值 +1 ==> num = 21
		System.out.println(num); // 输出num
		
		int max = Integer.MAX_VALUE; // 最大int
		int min = Integer.MIN_VALUE; // 最小int
		
		System.out.println(max); // 输出max 2147483647
		System.out.println(min); // 输出min -2147483648
		
		//int +/- int = int
		//当储存值超过最大值
		System.out.println(max + 1); // 输出 -2147483648
		//当储存值小于最小值 
		System.out.println(min - 1); // 输出 2147483647
		
		//int +/- long = long
		System.out.println(max + 1L); // 输出 2147483648
		System.out.println(max + (long)1); // 输出 2147483648
		//long +/- int = long
		System.out.println((long)min - 1); // 输出 -2147483649
		
		// 范围大(long)--> 范围小 (int)
		long long_number = 32425252455524522L;
		int int_number = (int)long_number; // 会出现数据溢出
		System.out.println(int_number); 
		
		//Byte型数据 (最小值-128，最大值127)
		//byte wrong_num = 140;  从int到byte，可能会出现数据错误
		int int_num = 130;
		byte byte_num = (byte) int_num; // 会出现数据溢出
		System.out.println(byte_num); 
		
		/*===========================================================*/
		//float，double浮点数类型
		double dou_num = 1.52;
		//double * int --> double
		System.out.println(dou_num * 2);
		
		//float向下转型
		float f_num1 = (float)11.52; 
		float f_num2 = 11.52F;
		
		//整形不保留小数位，要使用double数据类型来显示小数
		int x = 13;
		int y = 2;
		System.out.println(x/(double)y);
		
		
		/*===========================================================*/
		//char数据类型     'A'(65)~'Z'(90), 'a'(97)~'z'(122) '0'(48)~'9'(57)
		char a = 'A';
		int num_char = a;
		System.out.println(num_char);
		
		/*===========================================================*/
		//boolean 数据类型
		boolean flag = true;
		if(flag){
			System.out.println("布尔值正确，输出。。。");
		}
		
		/*===========================================================*/
		//String 数据类型
		String str = "Hello world"; // str是变量,  "Hello world"是常量
		
		//字符串连接操作
		String str1 = "Hello";
		String str2 = "World";
		System.out.println(str1 + str2);
		System.out.println(str1 += "World");
		
		//转义字符
		String str3 = "Hello\n World\t \"Hello\" \'Wor\\ld\' ";
		System.out.println(str3);
		
		
		
		
		
	}

}
