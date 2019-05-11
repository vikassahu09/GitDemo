package oopsConcept;

public class Program28 {

	public static void main(String[] args) {
		Sample20 ref = new Sample20(5);

	}

}

class Sample20 {
	public Sample20() {
		this(2.2);
		System.out.println("No-arg constructor");
	}

	public Sample20(int arg) {
		this();
		System.out.println("int-arg constructor");
	}

	public Sample20(double arg) {
		
		System.out.println("double-arg constructor");
	}
}