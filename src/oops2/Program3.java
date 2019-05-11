package oops2;

public class Program3 {

	public static void main(String[] args) {
		Sample4 ref=new Sample4();
		ref.display();

	}

}
class Sample3 {
	public void display() {
		System.out.println("Display in Sample3");
	}
}
class Sample4 extends Sample3{
	public void display() {
		System.out.println("Display in sample4");
	}
}