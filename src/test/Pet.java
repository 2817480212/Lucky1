package test;

public class Pet {
	private String name;
	private String species;
	private int age;

	public String bark() {
		return "����";
	}

	public void eat(String food) {
		System.out.println(name + "���ڳ�" + food);
	}

	public void sleep() {
		System.out.println(name + "����˯��");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 20 || age < 0) {
			System.out.println("�������");
		} else
			this.age = age;
	}

}
