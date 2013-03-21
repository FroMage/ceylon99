package ceylon99;

public class Ex23Java {

	private String name;
	private int age;
	
	public Ex23Java(String name, int age) {
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
		Ex23Java other = (Ex23Java) obj;
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
		Ex23Java stef = new Ex23Java("stef", 0x22);
		Ex23Java stef2 = new Ex23Java("stef", 0x22);
		System.out.println(stef == stef2);
		System.out.println(stef.equals(stef2));
	}

}
