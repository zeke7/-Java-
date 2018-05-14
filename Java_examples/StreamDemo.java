import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class ShopCar{
	private String pname;
	private double price;
	private int amount;
	
	public ShopCar(String pname, double price, int amount){
		this.pname = pname;
		this.price = price;
		this.setAmount(amount);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}

public class StreamDemo {

	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		all.add("num 1");
		all.add("num 2");
		all.add("num 3");
		all.add("num 3");
		all.add("num 3");
		all.add("num 3");
		
		//取得Stream对象
		Stream<String> stream = all.stream();
		//计算集合中的元素的个数
		//System.out.println(stream.count());
		
		//过滤重复元素
		//System.out.println(stream.distinct().count());
		
		//去掉重复数据
		//List<String> newAll = stream.distinct().collect(Collectors.toList());
		//newAll.forEach(System.out :: println);
		
		List<String> all1 = new ArrayList<String>();
		all1.add("a1");
		all1.add("a2");
		all1.add("A3");
		all1.add("b1");
		all1.add("b2");
		all1.add("B3");
		all1.add("ab1");
		
		Stream<String> stream1 = all1.stream();
		
		//筛选数据
		/*List<String> newAll = stream1.map((x)->x.toLowerCase())
									 .filter((x) -> x.contains("a"))
									 .collect(Collectors.toList());
		*/
		
		//Stream提供数据分页操作
		/*List<String> newAll = stream1.map((x)->x.toLowerCase())
				 					 .skip(2)
				 					 .limit(2)
				 					 .collect(Collectors.toList());
		*/
		
		//newAll.forEach(System.out :: println);
		
		//数据匹配
		/*
		if(stream1.anyMatch((x)->x.contains("a"))){
			System.out.println("There has some contents include \"a\" " );
		}*/
		
		/*
		if(stream1.allMatch((x)->x.contains("a"))){
			System.out.println("Contents all include \"a\" " );
		}*/
		
		Predicate<String> p1 = (x)->x.contains("a");
		Predicate<String> p2 = (x)->x.contains("b");
		
		if(stream1.anyMatch(p1.and(p2))){
			System.out.println("There has some contents include \"a\" and \"b\" " );
		}
		
		//数据分析方法 reduce
		
		List<ShopCar> sc = new ArrayList<ShopCar>();
		sc.add(new ShopCar("JAVA", 10.2, 20));
		sc.add(new ShopCar("Node.js", 22.2, 10));
		sc.add(new ShopCar("PHP", 120.2, 40));
		sc.add(new ShopCar("JS", 130.2, 30));
		
		Stream<ShopCar> stream2 = sc.stream();
		
		//计算每件商品购买总价
		//sc.stream().map((x)->x.getAmount() * x.getPrice()).forEach(System.out :: println);
		
		//计算所有商品总价
		//double s = sc.stream().map((x)->x.getAmount() * x.getPrice()).reduce((sum,m)-> sum + m).get();
		
		//使用mapToXxx()
		DoubleSummaryStatistics dss = sc.stream().mapToDouble((x) -> x.getAmount() * x.getPrice()).summaryStatistics();
		
		System.out.println(dss.getSum());
		
		
		
		
		
	}

}
