package oopsConcept;

public class Program16 {

	public static void main(String[] args) {

		Student3 st1 = new Student3(420, "Rama");
		System.out.println("id of the 1st Student is : " + st1.id);
		System.out.println("Name of the 2nd Student is: " + st1.name);
		Student3 st2 = new Student3(143, "Lucky");
		System.out.println("id of the 2nd Student is : " + st2.id);
		System.out.println("Name of the 2nd Student is : " + st2.name);

	}

}

class Student3 {
	int id;
	String name;

	public Student3(int arg1, String arg2) {
		id = arg1;
		name = arg2;
		System.out.println("Student created");
	}

}