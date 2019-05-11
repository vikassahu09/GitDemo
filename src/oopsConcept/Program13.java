package oopsConcept;
//Different values of argument
public class Program13 {

	public static void main(String[] args) {
		Sample9 ref1= new Sample9(20);
		Sample9 ref2= new Sample9(420);
		Sample9 red3= new Sample9(143);
		
	}

}

class Sample9{
	public Sample9(int arg) {
		System.out.println("Constructor Running");
		System.out.println("arg value is "+arg);
	}
}