package oopsConcept;
// Constructor

public class Program11 {

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		new Sample7();
		new Sample7();
		new Sample7();
		Sample7 ref= new Sample7();
		System.out.println("Main Ended");
		
	}

}
class Sample7{
	//User-defined non-argumented constructor
	public Sample7()
	{
		System.out.println("Sample7 constructor");
	}
	
}