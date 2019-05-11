package oopsConcept;
// Non-static members
public class Program7 {

	public static void main(String[] args) {
		Sample4 ref1= new Sample4();
		System.out.println("i value is : "+ref1.i);
		ref1.display();

	}

}
class Sample4{
	int i=100;				//Instance data members/ Instance variable
	public void display() {	//Instance member function/ instance methods
		System.out.println("DISPLAY");
		
	}
}
