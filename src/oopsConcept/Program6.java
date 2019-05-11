package oopsConcept;
/*
 * A static variable can also be used with "final" keyword.
 * The static variable declared with "final" keyword cannot be reassign.
 */
public class Program6 {

	public static void main(String[] args) {
		System.out.println("i value is : "+Sample3.i);
		System.out.println("d value is : "+Sample3.d);
//		Sample3.i=100;  //Error
//		Sample3.d=3.4;	//Error
		

	}
	
}
class Sample3{
	final static int i=90;		//Because these are static and final.
	final static double d=3.3;
}

