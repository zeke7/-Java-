
public class RegexDemo {

	public static void main(String[] args) {
		
		//单个字符(数量:1)
		//字符: 表示由一位字符组成
		String str1 = "b";
		System.out.println(str1.matches("b"));
		
		//[abc]: 表示可能是a或b或c
		String str2 = "a";
		System.out.println(str2.matches("[abc]"));
		
		//[^abc]: 表示不是a,b,c中的任意一个
		String str3 = "a";
		System.out.println(str3.matches("[^abc]"));
		
		//[a-zA-Z]: 所有字母
		System.out.println(str3.matches("[a-zA-Z]"));
		
		//[0-9], \\d :表示任意一位数字
		String str4 = "0";
		System.out.println(str4.matches("[0-9]"));
		System.out.println(str4.matches("\\d"));
		
		//.:表示任意的一位字符
		System.out.println(str3.matches("."));
		
		//多个字符(数量 > 1)
		//......
		
		//String 类对正则的支持
		String s = "av(d[aafs[34f%@#dgs32wefw#@DFAFAdfsf";
		
		//取出小写字母
		String regex1 = "[^a-z]";
		System.out.println(s.replaceAll(regex1,""));
		
		//按照数字进行拆分
		String regex2 = "\\d+";
		String result [] = s.split(regex2);
		for(int i = 0; i < result.length; i++){
			System.out.println(result[i]);
		}
		
		//验证一个字符串是否是数字
		String s1 = "10.1";
		String regex3 = "\\d+(\\.\\d+)?";
		System.out.println(s1.matches(regex3));
		
		//判断字符串是否是IP地址
		String IP = "192.168.1.1";
		String regex4= "(\\d{1,3}\\.){3}\\d{1,3}";
		System.out.println(s1.matches(regex4));
		
		//验证email地址
		String email = "hfang@coastal.edu";
		String emailRegex = "[a-zA-Z][a-zA-Z0-9_\\.]{0,28}[a-zA-Z0-9]@\\w+\\.(net|cn|com\\.cn|net\\.cn|org|gov|edu)";
		System.out.println(email.matches(emailRegex));
		
		
	}

}
