package oopsConcept;

//Local variable are given first priority // this keyword
public class Program29 {

	public static void main(String[] args) {
		Sample21 ref = new Sample21();
		ref.display();

	}

}

class Sample21 {
	int j = 10;

	public void display() {
		int j = 200;
		System.out.println("j value is " + j);
		System.out.println("Non-static j value is " + this.j);
		Sample21 ref = new Sample21();
		System.out.println(ref.j);
	}
}