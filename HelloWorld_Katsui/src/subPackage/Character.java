package subPackage;

public class Character {

	protected String name;

	public Character(String name) {
		this.name = name;
	}

	public Character() {

	}

	public void hellow() {
		System.out.println("こんにちは「" + this.name + "さん");
	}

}
