package ceylon99;


public class Ex08Java {
	
	{
		log("anonymous init");
	}
	
	private String first = log("field init 1");
	private Integer age;
	
	public Ex08Java() {
		log("init 1");
		age = 2;
		log("init 2");
	}
	
	{
		log("anonymous init 2");
	}
	
	private String second = log("field init 2");
	
	private String log(String name){
		System.out.println(name);
		System.out.println(" age is: " + age);
		return name;
	}
	
	public static void main(String[] args) {
		new Ex08Java();
	}
}
