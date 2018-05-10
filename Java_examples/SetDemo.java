import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
	
		Set<String> all = new HashSet<String>();
		all.add("num 1");
		all.add("num 2");
		all.add("num 3");
		all.add("num 3");
		System.out.println(all);
		
		Set<String> all1 = new TreeSet<String>();
		all1.add("num 2");
		all1.add("num 1");
		all1.add("num 1");
		all1.add("num 3");
		System.out.println(all1);
		
		
		
	}

}
