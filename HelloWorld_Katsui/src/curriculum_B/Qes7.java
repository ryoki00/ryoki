package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);// Scannerの準備

		System.out.print("生徒の人数を入力してください（２以上）：");
		int input = scanner.nextInt();

		int scores[][] = new int[input][4];

		for (int i = 0; i < input; i++) {

			System.out.print(i + 1 + "人目の『英語』の点数を入力してください：");
			scores[i][0] = scanner.nextInt();
			System.out.print(i + 1 + "人目の『数学』の点数を入力してください：");
			scores[i][1] = scanner.nextInt();
			System.out.print(i + 1 + "人目の『理科』の点数を入力してください：");
			scores[i][2] = scanner.nextInt();
			System.out.print(i + 1 + "人目の『社会』の点数を入力してください：");
			scores[i][3] = scanner.nextInt();
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < input; i++) {

			double sumscore = (scores[i][0] + scores[i][1] + scores[i][2] + scores[i][3]);
			double avscore = sumscore / 4;

			System.out.println(i + 1 + "人目の平均点は" + String.format("%.2f", avscore) + "点です。");

		}
		double scoreE = 0;

		for (int i = 0; i < input; i++) {

			scoreE += (scores[i][0]);

		}
		System.out.println();
		double avscoreE = scoreE / 4;

		System.out.println("英語の平均点は" + String.format("%.2f", avscoreE) + "点です。");
		double scoreM = 0;

		for (int i = 0; i < input; i++) {

			scoreM += (scores[i][1]);

		}

		double avscoreM = scoreM / 4;

		System.out.println("数学の平均点は" + String.format("%.2f", avscoreM) + "点です。");
		double scoreS = 0;

		for (int i = 0; i < input; i++) {

			scoreS += (scores[i][2]);

		}

		double avscoreS = scoreS / 4;

		System.out.println("理科の平均点は" + String.format("%.2f", avscoreS) + "点です。");
		double scoreH = 0;

		for (int i = 0; i < input; i++) {

			scoreH += (scores[i][3]);

		}

		double avscoreH = scoreH / 4;

		System.out.println("社会の平均点は" + String.format("%.2f", avscoreH) + "点です。");
		
		double avscoreAll = (scoreE+scoreM+scoreS+scoreH)/(input*4);
		System.out.println("全体の平均点は" + String.format("%.2f", avscoreAll) + "点です。");
	}

}
