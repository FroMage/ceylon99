package ceylon99;

import java.util.Arrays;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(1, 2, 3);
		for(Integer i : ints){
			System.out.println(i);
		}
	}
}
