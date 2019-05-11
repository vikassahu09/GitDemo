package oopsConcept;

// Hierarchical inheritance
class Mainclass {

	public static void main(String[] args) {
		Sample15 ref3 = new Sample15();
		System.out.println("c value is: " + ref3.c);
		ref3.test();
		System.out.println("i value is : " + ref3.i);
		ref3.disp();
		System.out.println(".....................");
		Sample14 ref2 = new Sample14();
		System.out.println("d value is : " + ref2.d);
		ref2.demo();
		System.out.println("i value is : " + ref2.i);
		ref2.disp();

	}

}

public class Program24 {
	int i = 100;

	public void disp() {
		System.out.println("Disp Running");
	}

}

class Sample14 extends Program24 {
	double d = 5.5;

	public void demo() {
		System.out.println("Demo Running");
	}
}

class Sample15 extends Program24 {
	char c = 'a';

	public void test() {
		System.out.println("Test Running");
	}
}