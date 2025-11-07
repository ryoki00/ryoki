package subPackage;

public class Character {

	protected String name;

	public Character(String name) {
		this.name = name;
	}

	public Character() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void hellow() {
		System.out.println("こんにちは「" + this.name + "さん");
	}

}
