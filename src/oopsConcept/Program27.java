package oopsConcept;

public class Program27 {

	public static void main(String[] args) {
		Sample19 ref= new Sample19();

	}

}
class Sample18{
	Sample18(){
		System.out.println("No-arg constructor");
	}
	Sample18(int arg){
		System.out.println("Int-arg constructor");
	}
}
class Sample19 extends Sample18{
	Sample19(){
		super();
		System.out.println("Sample19");
	}
}