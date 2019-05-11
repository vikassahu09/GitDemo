package oopsConcept;
/*
 * The static members are kept/stored in static pool area as single copy in memory.
 * The static data members once reassigned, we can not get back the old value.
 */
public class Program5 {

	public static void main(String[] args) {
	System.out.println("i value is : "+Sample2.i);
	System.out.println("d value is : "+Sample2.d);
	Sample2.i=100;
	Sample2.d=4.5;
	System.out.println("After re-assigning");
	System.out.println("i value is : " +Sample2.i);
	System.out.println("d value is : "+Sample2.d);
		
	}

}


class Sample2
{
	static int i=90;
	static double d= 3.3;
}