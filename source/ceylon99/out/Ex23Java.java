package ceylon99.out;

public class Ex23Java {

	public static void method(String message, Object arg){
		assert message != null : "Missing message";
		assert arg instanceof String || arg instanceof Number : "Unknown arg type: " + arg;
		System.out.println(message+": "+arg);
	}
	
	public static void main(String[] args) {
		method("Hello", 2);
		method("Hello", "you");
		method("Hello", true);
		method(null, 1);
	}
}
