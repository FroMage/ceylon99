package ceylon99;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex20Java<T> {

	private List<T> store = new ArrayList<>();
	
	public <Other> void addAllYouCan(List<Other> otherList){
		for(Other other : otherList){
			// Cannot perform instanceof check against type parameter T. Use its erasure Object instead 
			// since further generic type information will be erased at runtime
//			if(other instanceof T){
//				store.add((T)other);
//			}
		}
	}
	
	@Override
	public String toString() {
		return store.toString();
	}
	
	public static void main(String[] args) {
		Ex20Java<Number> numbers = new Ex20Java<>();
		List<? extends Object> floatsAndStrings = Arrays.asList(1.2, 3.4, "hello");
		numbers.addAllYouCan(floatsAndStrings);
		System.out.println(numbers);
	}
}
