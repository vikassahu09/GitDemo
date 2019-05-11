package oopsConcept;

public class Program10 {

	public static void main(String[] args) {
		Student s1= new Student();
		Student s2=new Student();
		System.out.println("id is : "+s1.id);
		System.out.println("Name is : "+s1.name);
		System.out.println("School name is : "+Student.school);
		System.out.println("...................................................");
		System.out.println("id is : "+s2.id);
		System.out.println("Name is : "+s2.name);
		System.out.println("School name is : "+Student.school);
		System.out.println("After re-assigning............................");
		s1.id=23;
		s1.name="vikas";
		System.out.println("id is : "+s1.id);
		System.out.println("Name is : " +s1.name);
		Student.study();
		

	}

}

class Student
{
	int id= 420;
	String name="Rama";
	static String school= "QSP";
	public static void study() {
		System.out.println("Studying..............");
	}
}
