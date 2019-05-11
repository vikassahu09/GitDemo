package oopsConcept;

// constructor overloading
public class Program18 {

	public static void main(String[] args) {
		Sample11 ref1= new Sample11();
		Sample11 ref2= new Sample11(25, 13.34);
		Sample11 ref3 = new Sample11(33.33);
		Sample11 ref4= new Sample11(135);
	}

}

class Sample11 {
	Sample11() {
		System.out.println("No-arg constructor");
	}
	
	Sample11(int arg){
		System.out.println("Int-arg contructor");
	}
	
	Sample11(double arg){
		System.out.println("Double-arg constructor");
	}
	
	Sample11(int arg1, double arg2){
		System.out.println("int-double arg constructor");
	}
	
	Sample11(double arg1, int arg2){
		System.out.println("double-int arg constructor");
	}
}