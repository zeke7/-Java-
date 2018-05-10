import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class CollectionOutputDemo {

	public static void main(String[] args) {
		
		//Iterator 输出接口
		Set<String> all = new HashSet<String>();
		all.add("num 1");
		all.add("num 2");
		all.add("num 3");
		Iterator<String> iter = all.iterator();
		while(iter.hasNext()){
			String str = iter.next();
			System.out.println(str);
		}
		
		//Enumeration
		//实例化对象只能靠Vector子类
		Vector<String> all1 = new Vector<String>();
		all1.add("num 11");
		all1.add("num 22");
		all1.add("num 33");
		Enumeration<String> enu = all1.elements();
		while(enu.hasMoreElements()){
			String str = enu.nextElement();
			System.out.println(str);
		}
		
	}

}
