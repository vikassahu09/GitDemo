package oopsConcept;
/* The static variable can be utilized without initialization. and 
 * when they utilized without initialization they use default values.
 */
public class Program4 {
	
	public static void main(String[] args) 
	{
		System.out.println("i value is: "+Sample1.i);
		System.out.println("d value is : "+Sample1.d);
		System.out.println("c value is : "+Sample1.c);
		System.out.println("b value is : "+Sample1.b);
		
	}
	

}

class Sample1{
	static int i;
	static double d;
	static char c;
	static boolean b;
}
