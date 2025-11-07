package subPackage;

import java.util.Random;

public class Hero extends Character {

	private int hp;
	private int mp;
	private int attack;
	private int speed;
	private int defence;

	public Hero() {
		super();
		Random rand = new Random();
		this.hp = rand.nextInt(1000);
		this.mp = rand.nextInt(1000);
		this.attack = rand.nextInt(1000);
		this.speed = rand.nextInt(1000);
		this.defence = rand.nextInt(1000);
	}

	public Hero(String name) {
		super(name);
	}

	public void showStatus() {
		System.out.println("ステータス");
		System.out.println("HP:" + this.hp);
		System.out.println("MP:" + this.mp);
		System.out.println("攻撃力:" + this.attack);
		System.out.println("素早さ:" + this.speed);
		System.out.println("防御力:" + this.defence);
		System.out.println();
	}

	public void hellow() {
		System.out.println("さあ冒険に出かけよう！");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
