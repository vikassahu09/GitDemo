package oopsConcept;
//Parameterized constructor
public class Program26 {

	public static void main(String[] args) {
		Sample17 ref= new Sample17(30);

	}

}
class Sample16{
	Sample16(int i){
		System.out.println("Sample16");
	}
	
}
class Sample17 extends Sample16{
	Sample17(int arg){
		super(12); // Parameterized constructor
		System.out.println("Sample17");
	}
	
}
