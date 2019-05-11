package oopsConcept;

public class Program15 {

	public static void main(String[] args) {
		Student2 ref1= new Student2(420);
		System.out.println("id of 1st student is : "+ref1.id);
		Student2 ref2= new Student2(143);
		System.out.println("id of the 2nd student is : "+ref2.id);
		
		
	}

}
class Student2{
		
	int id= 0;
	public Student2(int arg) {
		id=arg;
		System.out.println("Student of id "+id+" Created");
	}
}