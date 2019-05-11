package oopsConcept;
//Reference variable
public class Program9 {

	public static void main(String[] args) {
		Sample6 ref= new Sample6();
		System.out.println("i value is : "+ref.i);
		ref.i=200;
		System.out.println("i value is : "+ref.i);
		ref.i=300;
		System.out.println("i value is : "+ ref.i);
		Sample6 ref1= new Sample6();
		System.out.println("i value is "+ref1.i);
		
	}

}

class Sample6{
	
	int i=100;
}