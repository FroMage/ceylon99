package ceylon99;

import java.util.Arrays;
import java.util.List;

public class Ex05 {
	public static void main(String[] args) {
		List<? extends Object> items = Arrays.asList(1, 2, 3, 4.0);
		for(Object i : items){
			System.out.println(((Number)i).floatValue());
			System.out.println(((Comparable<Number>)i).compareTo((Number)i));
		}
	}
}
