package question31;

class Person {
	private String name;
	private int age;
	private double height;
	private double weight;
	static int count;

	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count++;
	}

	public double bmi() {
		return this.weight / this.height / this.height;
	}

	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
	}

	public void printCount() {
		System.out.println("合計は" + Person.count + "人です");

	}

}
