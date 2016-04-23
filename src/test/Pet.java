package test;

public class Pet {
	private String name;
	private String species;
	private int age;

	public String bark() {
		return "ÍôÍô";
	}

	public void eat(String food) {
		System.out.println(name + "ÕıÔÚ³Ô" + food);
	}

	public void sleep() {
		System.out.println(name + "ÕıÔÚË¯¾õ");
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
			System.out.println("ÊäÈë´íÎó");
		} else
			this.age = age;
	}

}
