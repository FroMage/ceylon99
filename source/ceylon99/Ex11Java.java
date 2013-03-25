package ceylon99;


public class Ex11Java {
	
	private String firstName;
	private String lastName;
	private int age;
	private String title;

	public Ex11Java() {
		this("Gerard");
	}
	
	public Ex11Java(String firstName) {
		this(firstName, "Dupond");
	}
	
	public Ex11Java(String firstName, String lastName) {
		this(firstName, lastName, 20);
	}
	
	public Ex11Java(String firstName, String lastName, int age) {
		this(firstName, lastName, age, "M");
	}
	
	public Ex11Java(String firstName, String lastName, int age, String title) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.title = title;
	}
	
	@Override
	public String toString() {
		return title + " " + firstName + " " + lastName + " (" + age +")";
	}
	
	public static void main(String[] args) {
		System.out.println(new Ex11Java());
		System.out.println(new Ex11Java("Stef", "Epardaud", 0x22, "Dr"));
	}
}
