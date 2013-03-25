package ceylon99;

import java.util.Arrays;
import java.util.List;

public class Ex08Java {
	
	private String name;
	private int age;
	
	public Ex08Java(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Age: " + age;
	}
	
	public static void main(String[] args) {
		List<Ex08Java> items = Arrays.asList(new Ex08Java("Stef", 0x22), new Ex08Java("Emmanuel", 0b100011));
		for(Ex08Java item : items){
			System.out.println(item);
		}
	}
}
