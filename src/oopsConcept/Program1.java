package oopsConcept;
/* The static member declared in a class  can be accessed within the same class 
 * by calling it with member name or it can also be invoked using its's class name*/

class Program1 {
	static int i=10;
	public static void disp() {
		System.out.println("Disp Running");
	}
	public static void vikas() {
		disp();
		System.out.println(+i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vikas();
		disp();									//calling it with member
		System.out.println("i value is: "+i);	//calling it with member
		
	}

}
