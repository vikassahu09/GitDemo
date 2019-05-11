package oopsConcept;
// Re-assigning value to non static member(instance member)
public class Program8 {

	public static void main(String[] args) {
		Sample5 ref1 = new Sample5();
		System.out.println("i value is : "+ref1.i);
		ref1.i=200;
		Sample5 ref2= new Sample5();
		System.out.println("i value is : " +ref2.i);
		ref2.i=300;
		System.out.println();
/* whenever a 'new()' keyword is seen a new object is created in memory and 
 * non static member of class will be loaded in it.		
 */

	}

}

class Sample5{
	int i = 100;
}