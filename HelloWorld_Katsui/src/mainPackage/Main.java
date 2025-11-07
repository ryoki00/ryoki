package mainPackage;

import java.util.Scanner;

import subPackage.Hero;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("名前を入力してください：");
		String name = scanner.nextLine();
		Hero hero = new Hero();
		hero.setName(name);
		System.out.println("こんにちは「" + hero.getName() + "」さん");

		hero.showStatus();
		hero.hellow();
		scanner.close();
	}

}
