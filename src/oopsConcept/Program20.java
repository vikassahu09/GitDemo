package oopsConcept;

//'this' keyword.
public class Program20 {

	public static void main(String[] args) {

		Car c1 = new Car(12345);
		System.out.println(c1.engine_num);

	}

}

class Car {
	int engine_num;

	Car(int engine_num) {

		this.engine_num = engine_num;
	}
}
