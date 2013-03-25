package ceylon99;

public class Ex20Java {

	public static String neverNull(){
		return "hello";
	}
	
	public static String sometimesNull(){
		if(System.nanoTime() % 2 == 0)
			return null;
		return "bonjour";
	}
	
	public static void main(String[] args) {
		for(int i=0;i<20;i++){
			System.out.println(neverNull().toUpperCase());
			System.out.println(sometimesNull().toUpperCase());
		}
	}
}
