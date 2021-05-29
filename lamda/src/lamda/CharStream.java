package lamda;

import java.util.stream.IntStream;

public class CharStream {
public static boolean isApphbet(String s1) {
	
	return s1== null ||  s1.isEmpty() ? false : s1.chars().allMatch((ch)->Character.isLetter(ch));
}
}
