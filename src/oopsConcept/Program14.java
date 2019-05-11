package oopsConcept;

public class Program14 {

	public static void main(String[] args) {
		Sample10 ref1= new Sample10(100);
		System.out.println("i value is : "+ref1.i);
		Sample10 ref2= new Sample10(420);
		System.out.println("i value is : "+ref2.i);
		Sample10 ref3= new Sample10(143);
		System.out.println("i value is : " + ref3.i);

	}

}
class Sample10{
	int i=10;
	public Sample10(int arg) {
		i=arg;
		System.out.println("Constructor");
	}
}