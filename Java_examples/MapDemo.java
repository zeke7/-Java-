import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Three", 33);
		
		System.out.println(map);
		
		//get()方法
		System.out.println(map.get("One"));
		
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		//Iterator输出
		Set<Map.Entry<String, Integer>> set1 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iter1 = set1.iterator();
		while(iter1.hasNext()){
			Map.Entry<String, Integer> me = iter1.next();
			System.out.println(me.getKey() + "=" + me.getValue());
		}
	}

}
