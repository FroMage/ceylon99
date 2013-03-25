package ceylon99;

import java.util.HashMap;
import java.util.Map;

public class Ex16Java {
	
	public static void main(String[] args) {
		@SuppressWarnings("serial")
		Map<Number, String> map = new HashMap<Number, String>(){{ put(1, "fu"); put(2, "bar"); }};
		// Type mismatch: cannot convert from Map<Number,String> to Map<Integer,Object>
//		Map<Integer, Object> moreGenericMap = map;
		Map<? super Integer, ? extends Object> moreGenericMap = map;
		Object object = moreGenericMap.get(1);		
		System.out.println(object);
	}
}
