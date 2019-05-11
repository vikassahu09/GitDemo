package oopsConcept;
/* The static member declared in a class  can be accessed within the same class 
 * by calling it with member name or it can also be invoked using its's class name*/
 
class Program2 
{
	static int i=10;
	public static void disp()
	{
	System.out.println("Disp Running");	
	}

	public static void main(String[] args) 
	{
		Program2.disp();								//invoked using its's class name
		System.out.println("i value is :" +Program2.i);	//invoked using its's class name
	}

}
