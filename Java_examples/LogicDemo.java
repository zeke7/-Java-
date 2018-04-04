
public class LogicDemo {

	public static void main(String[] args) {
		
		//if...else
		int flag = 1;
		if(flag == 1){
			System.out.println("flag = 1...");
		}else{
			System.out.println("flag != 1...");
		}
		
		//if...else if...else if...(else if...)...else
		int grade = 60;
		if(grade < 60){
			System.out.println("grade < 60...");
		}else if(grade == 60){
			System.out.println("grade = 60...");
		}else if(grade > 60 && grade <= 100){
			System.out.println("60 < grade <= 100...");
		}else{
			System.out.println("grade > 100");
		}
		
		//switch
		int case_num = 1;
		switch(case_num){
			case 0:
				System.out.println("case_num is 0");
				break;
			case 1:
				System.out.println("case_num is 1");
				break;
			case 2:
				System.out.println("case_num is 2");
				break;
			default:
				System.out.println("case_num is not 0, 1, or 2.");
				break;
		}
		
		
		//do...while 第一次肯定会执行
		int i = 0;
		do{
			System.out.println(i);
			i++;
		}while(i > 5);
		
		//条件不符合不执行
		while(i > 5){
			System.out.println(i);
		}
		
		//for循环
		for(int  j= 0; j < 5; j++){
			System.out.println(i);  //打印5次i变量的值
		}
		
		//continue
		for(int  j= 0; j < 5; j++){
			if(j == 2){
				continue;
			}
			System.out.println(j);  //只有2 不会被输出
		}
		
		//break
		for(int  j= 0; j < 5; j++){
			if(j == 2){
				break;
			}
			System.out.println(j);  //2和之后的数都不会被输出
		}
		
		
	}

}
