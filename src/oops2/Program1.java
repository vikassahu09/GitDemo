package oops2;

public class Program1 {

	public static void main(String[] args) {
		Sample2 ref = new Sample2();
		ref.display();
		ref.display(12);
		ref.display(2.3);

	}

}

class Sample1 {
	public void display() {
		System.out.println("Display non-arg in Sample1");
	}

	public void display(int arg) {
		System.out.println("Display int-arg in Sample1");
	}
}

class Sample2 extends Sample1 {
	public void display(double arg) {
		System.out.println("Display double-arg in Sample2");
	}

}
