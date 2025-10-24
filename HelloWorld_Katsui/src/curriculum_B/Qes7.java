package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("生徒の人数を入力してください（２以上）：");
		int input = scanner.nextInt();

		int scores[][] = new int[input][4]; // [生徒][教科]
		String[] subjects = { "英語", "数学", "理科", "社会" };
		// 各生徒の点数を入力
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < subjects.length; j++) {
				System.out.print((i + 1) + "人目の『" + subjects[j] + "』の点数を入力してください：");
				scores[i][j] = scanner.nextInt();
			}

		}

		for (int i = 0; i < input; i++) {
			double sumscore = (scores[i][0] + scores[i][1] + scores[i][2] + scores[i][3]);
			double avscore = sumscore / 4;
			System.out.println((i + 1) + "人目の平均点は " + String.format("%.2f", avscore) + " 点です。");
		}
		// 配列を作成
		System.out.println();
		double[] allAv;

		allAv = new double[subjects.length];

		for (int i = 0; i < subjects.length; i++) {
			double subSum = 0d;
			double subAv = 0d;
			for (int j = 0; j < input; j++) {
				subSum += scores[j][i];
			}

			subAv = subSum / input;
			String subjectAv = String.format("%.2f", subAv);
			System.out.println(subjects[i] + "の平均点は " + subjectAv + " 点です。");
			allAv[i] = subAv;
		}
		// 各科目の合計を求める
		double scoreE = 0, scoreM = 0, scoreS = 0, scoreH = 0;
		for (int i = 0; i < input; i++) {
			scoreE += scores[i][0];
			scoreM += scores[i][1];
			scoreS += scores[i][2];
			scoreH += scores[i][3];
		}



		// 全体平均（全員全科目の平均）
		double avscoreAll = (scoreE + scoreM + scoreS + scoreH) / (input * 4);
		System.out.println();
		System.out.println("全体の平均点は " + String.format("%.2f", avscoreAll) + " 点です。");

		scanner.close();
	}
}
