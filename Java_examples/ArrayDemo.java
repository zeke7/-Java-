
class Car{
	
	//Field 成员变量，属性
	int price;
	String brand;	
	
	public Car(){}
	
	public Car(int price, String brand){
		this.price = price;
		this.brand = brand;
	}
	
	
	//Method 方法
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String toString(){
		return "The price is " + this.price + ", the brand is " + this.brand ;
	}
	
}

public class ArrayDemo {

	public static void main(String[] args) {
		//声明并开辟数组
		int arr1 [] = new int[10];
		
		//把数组中每个值赋值为1
		for(int i = 0; i < arr1.length; i++){
			arr1[i] = 1;
		}
		
		//输出数组
		for(int i = 0; i < arr1.length; i++){
			System.out.print(arr1[i] + ",");
		}
		System.out.println();
		
		//静态初始化
		int arr2 [] = {1,2,3,4,5,6};
		int arr3 [] = new int[]{1,2,3,4,5,6};
		
		
		//二维数组
		int arr_2D [][] = new int[][]{{1,2,3},{1,2,3}};
		//输出二维数组
		for(int i = 0; i < arr_2D.length; i++){
			for(int j = 0; j < arr_2D[i].length; j++){
				System.out.print(arr_2D[i][j] + ",");
			}
			System.out.println();
		}
		
		
		//对象数组
		Car cars [] = new Car[5];
		
		
		//输出数组,未赋值
		for(int i = 0; i < cars.length; i++){
			System.out.print(cars[i] + ",");
		}
		
		System.out.println();
		System.out.println("存入两个对象。。。");
		
		//实例化对象数组中的对象
		//声明对象
		Car car1 = new Car(1000000,"BMW");
		Car car2 = new Car(1200000,"BenZ");
		
		cars[0] = car1;
		cars[1] = car2;
		
		for(int i = 0; i < cars.length; i++){
			if(cars[i] != null){
				System.out.println(cars[i].toString());
			}
		}
		
		
	}

}
