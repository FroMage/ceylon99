package ceylon99;

import java.util.Arrays;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		// Type mismatch: cannot convert from List<Number&Comparable<?>> to List<Integer>
//		List<Integer> ints = Arrays.asList(1, 2, 3, 4.0);
		// Let's try:
//		List<Number&Comparable<?>> ints = Arrays.asList(1, 2, 3, 4.0);
		// Type mismatch: cannot convert from List<Number&Comparable<?>> to List<Number>
//		List<Number> ints = Arrays.asList(1, 2, 3, 4.0);
		List<? extends Number> ints = Arrays.asList(1, 2, 3, 4.0);
		for(Number i : ints){
			System.out.println(i);
		}
	}
}
