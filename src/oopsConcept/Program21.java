package oopsConcept;

//'this' keyword.
public class Program21 {

	public static void main(String[] args) {

		Car1 c1 = new Car1(34567);
		System.out.println(c1);

		Car1 c2 = new Car1(67576);
		System.out.println(c2);

		System.out.println(c1.engine_num);
		System.out.println(c2.engine_num);

		c1.display();
		c2.display();

	}

}

class Car1 {
	int engine_num;

	Car1(int engine_num) {
		this.engine_num = engine_num;
	}

	public void display() {
		System.out.println(this);
	}
}
