package ceylon99;

public class Ex16Java {
	
	public static void main(String[] args) {
		System.out.println("A");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// damn it!!!
			throw new RuntimeException(e);
		}
		System.out.println("B");
	}
}
