package ceylon99.out;

public class Ex25Java {

	private String name;
	private int age;
	
	public Ex25Java(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ex25Java other = (Ex25Java) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		Ex25Java stef = new Ex25Java("stef", 0x22);
		Ex25Java stef2 = new Ex25Java("stef", 0x22);
		System.out.println(stef == stef2);
		System.out.println(stef.equals(stef2));
	}

}
