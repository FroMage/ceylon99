package ceylon99;

class Ex15ListJava<T> {
	
	private T[] array;
	
	Ex15ListJava(T... elements){
		array = elements;
	}
	
	T get(int i){
		return array[i];
	}
}

public class Ex15Java {
	
	public static void main(String[] args) {
		Ex15ListJava<String> list = new Ex15ListJava<>("fu", "bar", "gee");
		// Type mismatch: cannot convert from Ex15ListJava<String> to Ex13ListJava<Object>
//		Ex15ListJava<Object> listOfObjects = list;
		Ex15ListJava<? extends Object> listOfObjects = list;
		Object object = listOfObjects.get(0);
		System.out.println(object);
	}
}
