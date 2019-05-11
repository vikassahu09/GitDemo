package oopsConcept;
//Multilevel inheritance(consider last two program)
public class Program23 {

	public static void main(String[] args) {
		Sample13 ref3 = new Sample13();
		System.out.println("C value is " + ref3.c);
		ref3.test();
		System.out.println("d value is " + ref3.d);
		ref3.demo();
		System.out.println("i value is " + ref3.i);
		ref3.disp();

	}

}

class Sample13 extends Sample12 {
	char c = 'a';

	public void test() {
		System.out.println("Test Running");
	}
}
