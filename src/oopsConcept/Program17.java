package oopsConcept;
// Re-assigning in constructor
public class Program17 {

	public static void main(String[] args) {
		Student4 st1= new Student4(12, "Rama", 35.5);
		System.out.println("marks : "+st1.marks);
		st1.marks=36.5;
		System.out.println("marks : "+st1.marks);
		System.out.println("............................................");
		Student4 st2= new Student4(23, "Lucky", 40.0);
		System.out.println("marks: "+st2.marks);
		st2.marks=50.0;
		System.out.println("marks: "+st2.marks);
	
	}

}
class Student4{
	int id;
	String name;
	double marks;
	public Student4(int arg1, String arg2, double arg3) {
		id=arg1;
		name=arg2;
		marks=arg3;
	}
	
}