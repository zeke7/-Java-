import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface Test1<P,R>{
	public R trans(P p) ;
}

@FunctionalInterface
interface Test2<R>{
	public R upper() ;
}



public class MethodReferDemo {

	public static void main(String[] args) {
		
		//类名称::static 方法名称
		Test1<Integer, String> t1 = String :: valueOf;
		String str1 = t1.trans(1000);
		System.out.println(str1.replaceAll("0","_"));
		
		//引用某个对象的方法：实例化对象::普通方法 
		Test2<String> t2 = "Hello" :: toUpperCase;
		String str2 = t2.upper();
		System.out.println(str2);
		
		//内建的函数式接口
		
		//功能性接口(Function) - 接收一个参数，返回一个处理结果
		Function<String, Boolean> str = "##hello" :: startsWith;
		System.out.println(str.apply("##"));
		
		//消费型接口(Consumer) - 接收数据
		Consumer<String> cons = System.out :: println;
		cons.accept("Hello");
		
		//供给型接口(Supplier) - 不接收参数，返回一个结果
		Supplier<String> sup = "hello" :: toUpperCase;
		System.out.println(sup.get());
		
		
		//断言型接口(Predicate) - 判断
		Predicate<String> pre = "hello" :: equals;
		System.out.println(pre.test("Hello"));
		
		
		
		
	}

}
