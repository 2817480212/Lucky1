package test;

public class Master {
	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.setName("С��");
		String sound = myDog.bark();
		System.out.println(sound);
		myDog.setAge(4);
		myDog.sleep();
		myDog.eat("��ͷ");
		
		Cat myCat = new Cat();
		String sound1 = myCat.bark();
		System.out.println(sound);
		//myCat.bark();
		
		
	}
	

}
