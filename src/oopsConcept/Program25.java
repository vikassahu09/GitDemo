 package oopsConcept;
//Constructor chaining- Default constructor
class MainClass1 {

	public static void main(String[] args) {
		Demo2 ref= new Demo2();

	}

}

public class Program25{
	Program25(){
		//default super()
		System.out.println("Demo1 Constructor");
	}
	
}
class Demo2 extends Program25{
	Demo2(){
		//Default super()
		System.out.println("Demo2 Constructor");
	}
}