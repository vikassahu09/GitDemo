package oops2;
// PAssing non primitive data
public class Program6 {

	public static void main(String[] args) {
		Demo5 ref1=new Demo5();
		ref1.run(new Demo4());
		
		System.out.println(".......................");
		Demo4 ref2 =new Demo4();
		ref1.run(ref2);

	}

}
class Demo4{
	void test(String s) {
		System.out.println(s);
		}
	
}
class Demo5{
	void run(Demo4 ref) {
		System.out.println(ref);
		ref.test("Java");
	}
}
