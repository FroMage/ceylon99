package ceylon99;

class Ex13ListJava<T> {
	
	private T[] array;
	
	Ex13ListJava(T... elements){
		array = elements;
	}
	
	T get(int i){
		return array[i];
	}
}

public class Ex13Java {
	
	public static void main(String[] args) {
		Ex13ListJava<String> list = new Ex13ListJava<>("fu", "bar", "gee");
		// Type mismatch: cannot convert from Ex13ListJava<String> to Ex13ListJava<Object>
//		Ex13ListJava<Object> listOfObjects = list;
		Ex13ListJava<? extends Object> listOfObjects = list;
		Object object = listOfObjects.get(0);
		System.out.println(object);
	}
}
