package oopsConcept;
//User defined argumented constructor
public class Program12 {

	public static void main(String[] args) {
		Sample8 ref1= new Sample8(20);
		System.out.println(".....................................");
		System.out.println("i value is "+ref1.i);

	}

}
class Sample8{
	int i=100;
	//User defined argumented constructor
	public Sample8(int arg) {
	System.out.println("Constructor Running");
	System.out.println("Arg value is "+arg);
		
	}
}
