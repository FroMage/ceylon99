package ceylon99;


public class Ex12Java {
	
	private int width;
	private int height;

	public Ex12Java() {
		this(2);
	}
	
	public Ex12Java(int width) {
		this(width, width * 2);
	}
	
	public Ex12Java(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return width + " * " + height;
	}
	
	public static void main(String[] args) {
		System.out.println(new Ex12Java());
		System.out.println(new Ex12Java(10));
		System.out.println(new Ex12Java(10, 50));
	}
}
