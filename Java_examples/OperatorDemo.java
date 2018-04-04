
public class OperatorDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//四则运算
		int num1 = 300;
		int num2 = 15;
		
		System.out.println(num1 + num2);  //加法
		System.out.println(num1 - num2);  //减法
		System.out.println(num1 * num2);  //乘法
		System.out.println(num1 / num2);  //除法
		System.out.println(num1 % num2);  //取模
		
		int num3 = 5;
		
		System.out.println(num3++);  //先使用当前变量储存的值，后再进行自增
		System.out.println(num3--);  //先使用当前变量储存的值，后再进行自减
		
		System.out.println(++num3);  //先进行自增，后再使用变量储存的值
		System.out.println(--num3);  //先进行自减，后再使用变量储存的值
		
		//三目运算
		int numA = 22;
		int numB = 11;
		
		int numbigger = numA > numB ? numA : numB; 
		System.out.println(numbigger);
		
		//逻辑运算
		// 非 (!) 运算符
		boolean flag = false;
		if(!flag){
			System.out.println("!flag 为 true");
		}
		
		//  & 与 && 运算符
		//运行此代码会报错
		if((2 == 0) & (2/0 == 0)){
			System.out.println("Print Something....");
		}
		//运行此代码不会报错
		if((2 == 0) && (2/0 == 0)){
			System.out.println("Print Something....");
		}
		
		//  | 与 || 运算符
		//运行此代码会报错
		if((2 == 2) | (2/0 == 0)){
			System.out.println("Print Something....");
		}
		//运行此代码不会报错
		if((2 == 2) || (2/0 == 0)){
			System.out.println("Print Something....");
		}
			
		
		
		
		
	}

}
