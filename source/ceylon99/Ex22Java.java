package ceylon99;

public class Ex22Java {

	class Inner {
		void m(){
			f();
			Ex22Java.this.f();
		}
		void f(){
			System.out.println("Inner");
		}
	}
	void f(){
		System.out.println("Ex22Java");
	}
	
	public static void main(String[] args) {
		new Ex22Java().new Inner().m();
	}
}
