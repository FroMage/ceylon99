package ceylon99.out;

import java.util.Arrays;
import java.util.List;

public class Ex16Java {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3);
		// Type mismatch: cannot convert from List<Integer> to List<Number>
//		List<Number> moreGenericList = list;
        List<? extends Number> moreGenericList = list;
		Object object = moreGenericList.get(0);	
		System.out.println(object);
	}
}
