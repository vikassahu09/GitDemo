package oops2;
//Compile time Polymorphism-> Method Overloading
public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simulator simulate=new Simulator();
		simulate.SimulateNoise(new Dog());
		simulate.SimulateNoise(new Cat());
	}

}
class Simulator{
	void SimulateNoise(Dog arg) {
		arg.makeNoise();
		
	}
	void SimulateNoise(Cat arg1) {
		arg1.makeNoise();
	}
}
