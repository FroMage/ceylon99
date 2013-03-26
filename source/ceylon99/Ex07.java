package ceylon99;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ex07 {
	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(1, 2, 3);
		List<Integer> more = new LinkedList<>();
		for(Integer i : ints){
		    more.add((i + 1) * 2);
		}
		for(Integer i : more){
			System.out.println(i);
		}
	}
}
