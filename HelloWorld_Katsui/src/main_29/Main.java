package main_29;

import java.util.Scanner;

import sub_29.Sub;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("数字を入力してください：");
		String number = scanner.nextLine();
		
		System.out.print("昇順、降順を入力してください：");
		String order  = scanner.nextLine();
		
		Sub sub = new Sub(number);
		sub.show(order);
		scanner.close();
	}

}
