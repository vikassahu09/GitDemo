package oops2;

public class Program5 {

	public static void main(String[] args) {
		Cat kitty = new Cat();
		kitty.makeNoise();
		Dog doggy = new Dog();
		doggy.makeNoise();

	}

}

class Animal {
	public void makeNoise() {
		System.out.println("Make some noise");
	}
}

class Cat extends Animal {
	public void makeNoise() {
		System.out.println("Meaow Meaow");
	}
}

class Dog extends Animal {
	public void makeNoise() {
		System.out.println("Bow Bow");
	}
}