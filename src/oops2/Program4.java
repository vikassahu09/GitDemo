package oops2;

public class Program4 {

	public static void main(String[] args) {
		Demo1 ref=new Demo1();
		ref.disp();
		Demo2 ref1= new Demo2();
		ref1.disp();
		Demo3 ref2=new Demo3();
		ref2.disp();

	}

}
class Demo1 {
	void disp() {
		System.out.println("Display in Demo1");
	}
}
class Demo2 extends Demo1{
	public void disp() {
		System.out.println("Disp in demo2");
	}

}
class Demo3 extends Demo2{
	public void disp() {
		System.out.println("display in Demo3");
	}
}