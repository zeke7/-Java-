import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		
		//取得当前时间
		long cur = System.currentTimeMillis() ;
		Date date = new Date(cur);
		System.out.println(date);
		
		//处理格式化日期: SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		String str = sdf.format(date);
		System.out.println(str);
		
		//将字符串转换为Date对象
		String str1 = "2018-04-27 15:29:00.558";
		Date date1 = sdf.parse(str1);
		System.out.println(date1);
		
		//使用Calendar
		Calendar cal = Calendar.getInstance();
		StringBuffer buf = new StringBuffer();
		buf.append(cal.get(Calendar.YEAR)).append(" Year");
		System.out.println(buf);
		
		
		
	}

}
