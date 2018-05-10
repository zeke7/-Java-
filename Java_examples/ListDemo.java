import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		
		//ArrayList 子类
		List<String> all = new ArrayList<String>();
		System.out.println("Size: " + all.size());
		all.add("num 1");
		all.add("num 2");
		all.add("num 3");
		System.out.println("Size: " + all.size());
		
		//Collection -> size() 取得长度
		//List -> get() 根据索引取得数据
		for(int i = 0; i < all.size(); i++){
			String str = all.get(i);
			System.out.println(str);
		}
		
		//使用Collection接口
		Collection<String> all1 = new ArrayList<String>();
		all1.add("num 11");
		all1.add("num 22");
		all1.add("num 33");
		Object obj[] = all1.toArray(); 
		for(int i = 0; i < obj.length; i++){
			System.out.println(obj[i]);
		}
		
		//Vector
		List<String> all2 = new Vector<String>();
		
		
		
	}

}
