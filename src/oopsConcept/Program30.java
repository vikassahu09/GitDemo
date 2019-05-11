package oopsConcept;
//super keyword
public class Program30 {

	public static void main(String[] args) {
		Sample23 ref= new Sample23();
		ref.display();

	}

}
class Sample22{
	int j=20;
}
class Sample23 extends Sample22{
	int j=200;
	public void display() {
		System.out.println("j value is "+ j);
		System.out.println("i value is "+super.j);
		System.out.println("j value is "+ this.j);
		
	}
	
}