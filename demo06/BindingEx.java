package demo06;

public class BindingEx {
	public static void main(String[] args) {

		Parent p = new Child();
		Child c = new Child();
		p.method();
		c.method();
		System.out.println(p.x);
		System.out.println(c.x);
	}
}

class Parent{
	int x = 100;
	void method() {
		System.out.println("Parent method()");
	}
}

class Child extends Parent{
	int x = 200;
	void method() {
		System.out.println("Child method()");
	}
	
}