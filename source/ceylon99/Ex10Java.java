package ceylon99;


public class Ex10Java {
	
	private int width;
	private int height;

	public Ex10Java() {
		this(2);
	}
	
	public Ex10Java(int width) {
		this(width, width * 2);
	}
	
	public Ex10Java(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return width + " * " + height;
	}
	
	public static void main(String[] args) {
		System.out.println(new Ex10Java());
		System.out.println(new Ex10Java(10));
		System.out.println(new Ex10Java(10, 50));
	}
}
