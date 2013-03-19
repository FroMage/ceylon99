package ceylon99;


public class Ex09Java {
	
	private String firstName;
	private String lastName;
	private int age;
	private String title;

	public Ex09Java() {
		this("Gerard");
	}
	
	public Ex09Java(String firstName) {
		this(firstName, "Dupond");
	}
	
	public Ex09Java(String firstName, String lastName) {
		this(firstName, lastName, 20);
	}
	
	public Ex09Java(String firstName, String lastName, int age) {
		this(firstName, lastName, age, "M");
	}
	
	public Ex09Java(String firstName, String lastName, int age, String title) {
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
		System.out.println(new Ex09Java());
		System.out.println(new Ex09Java("Stef", "Epardaud", 0x22, "Dr"));
	}
}
