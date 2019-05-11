package oopsConcept;

//Constructors with different values.
public class Program19 {

	public static void main(String[] args) {
		System.out.println(".............1st box Volume................");
		Box b1 = new Box();
		// System.out.println("Volume of 1st box : "+b1.volume()); // doubt(Why volume()
		// not called in SOP statement)
		b1.volume();
		System.out.println("...............Volume of 2nd Box.............");
		Box b2 = new Box(20);
		b2.volume();
		System.out.println(".......Volume of the 3rd Box.................");
		Box b3 = new Box(10, 20, 30);
		b3.volume();
	}

}

class Box {
	int length, width, height;

	Box() {
		length = width = height = 0;
	}

	Box(int len) {
		length = width = height = len;
	}

	Box(int l, int w, int h) {
		length = l;
		width = w;
		height = h;
	}

	public void volume() {
		int result = length * width * height;
		System.out.println("Volume is " + result);
	}
}