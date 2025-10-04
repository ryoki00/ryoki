package curriculum_B;

import java.util.Scanner;

public class Qes7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("生徒の人数を入力してください（２以上）：");
        int input = scanner.nextInt();

        int scores[][] = new int[input][4]; // [生徒][教科]

        // 各生徒の点数を入力
        for (int i = 0; i < input; i++) {
            System.out.print((i + 1) + "人目の『英語』の点数を入力してください：");
            scores[i][0] = scanner.nextInt();
            System.out.print((i + 1) + "人目の『数学』の点数を入力してください：");
            scores[i][1] = scanner.nextInt();
            System.out.print((i + 1) + "人目の『理科』の点数を入力してください：");
            scores[i][2] = scanner.nextInt();
            System.out.print((i + 1) + "人目の『社会』の点数を入力してください：");
            scores[i][3] = scanner.nextInt();
            System.out.println();
        }

        
        for (int i = 0; i < input; i++) {
            double sumscore = (scores[i][0] + scores[i][1] + scores[i][2] + scores[i][3]);
            double avscore = sumscore / 4;
            System.out.println((i + 1) + "人目の平均点は " + String.format("%.2f", avscore) + " 点です。");
        }

        // 各科目の合計を求める
        double scoreE = 0, scoreM = 0, scoreS = 0, scoreH = 0;
        for (int i = 0; i < input; i++) {
            scoreE += scores[i][0];
            scoreM += scores[i][1];
            scoreS += scores[i][2];
            scoreH += scores[i][3];
        }

        System.out.println();
  
        double avscoreE = scoreE / input;
        double avscoreM = scoreM / input;
        double avscoreS = scoreS / input;
        double avscoreH = scoreH / input;

        System.out.println("英語の平均点は " + String.format("%.2f", avscoreE) + " 点です。");
        System.out.println("数学の平均点は " + String.format("%.2f", avscoreM) + " 点です。");
        System.out.println("理科の平均点は " + String.format("%.2f", avscoreS) + " 点です。");
        System.out.println("社会の平均点は " + String.format("%.2f", avscoreH) + " 点です。");

        // 全体平均（全員全科目の平均）
        double avscoreAll = (scoreE + scoreM + scoreS + scoreH) / (input * 4);
        System.out.println();
        System.out.println("全体の平均点は " + String.format("%.2f", avscoreAll) + " 点です。");

        scanner.close();
    }
}
