package lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Better better = new Better();
		String test1 =  better.betterString("ahmed", "mansour", (s1,s2)-> s1.length() > s2.length());
		String test2 =  better.betterString("ahmed", "mansour", (s1,s2)->  true);
		String test3 =  better.betterString("ahmed", "mansour", Better::getbetter);

		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test3);
		
		String alpha = "ahmed";
		String notalpha = "ahmed123";
		System.out.println(CharStream.isApphbet(alpha));
		System.out.println(CharStream.isApphbet(notalpha));

		
		
	}

}
