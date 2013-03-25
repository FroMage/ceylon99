package ceylon99;

public class Ex21Java {

	public static void method(Object o){
		if(o instanceof String){
			System.out.println("Got a string: " + ((String)o).toUpperCase());
		}else if(o instanceof Number){
			System.out.println("Got a number: " + (((Number)o).intValue() < 0));
		}else{
			System.out.println("Well, no idea: "+o);
		} 
	}
	
	public static void main(String[] args) {
		method(1);
		method("yo");
		method(true);
	}
}
