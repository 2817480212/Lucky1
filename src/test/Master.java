package test;

public class Master {
	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.setName("Ð¡°×");
		String sound = myDog.bark();
		System.out.println(sound);
		myDog.setAge(4);
		myDog.sleep();
		myDog.eat("¹ÇÍ·");
		
		Cat myCat = new Cat();
		String sound1 = myCat.bark();
		System.out.println(sound);
		//myCat.bark();
		
		
	}
	

}
