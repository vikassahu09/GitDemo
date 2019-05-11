package oopsConcept;

// Single level inheritance- first half
public class Program22 {

	public static void main(String[] args) {
		Program22A ref1 = new Program22A();
		System.out.println("i value is " + ref1.i);
		ref1.disp();

		Sample12 ref2 = new Sample12();
		System.out.println("i value is " + ref2.i);
		System.out.println("d value is " + ref2.d);
		ref2.disp();
		ref2.demo();

	}

}
