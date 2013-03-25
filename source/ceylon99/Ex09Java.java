package ceylon99;

public class Ex09Java {
	
	public String field;
	
	public Ex09Java(String field) {
		this.field = field;
	}
	
	public String getProperty() {
		return field.toUpperCase();
	}

	public void setProperty(String field) {
		this.field = field.toLowerCase();
	}

	@Override
	public String toString() {
		return "Field: " + field + ", Property: " + getProperty();
	}
	
	public static void main(String[] args) {
		System.out.println(new Ex09Java("Hello"));
	}
}
