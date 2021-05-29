package lamda;

import java.util.function.BiPredicate;

public class Better {

	public static boolean getbetter(String s1,String s2) {
		return s1.length()> s2.length();
	}
	
	public String betterString(String s1,String s2,BiPredicate<String,String > p) {
		return p.test(s1, s2) ? s1:s2;
	}
}
