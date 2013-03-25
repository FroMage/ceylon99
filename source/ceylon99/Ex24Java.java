package ceylon99;

public class Ex24Java {

	class Inner {
		void m(){
			this.f();
			Ex24Java.this.f();
		}
		void f(){
			System.out.println("Inner");
		}
	}
	void f(){
		System.out.println("Ex24Java");
	}
	
	public static void main(String[] args) {
		new Ex24Java().new Inner().m();
	}
}
