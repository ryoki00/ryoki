package curriculum_B;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Qes1_3 {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);// Scannerの準備
		String userName = "";
		while (true) {
			userName = scanner.nextLine(); // 入力された文字列を取得

			// 2.　正規表現パターンを用意する 
			String regex_Alphabet = "^[A-Za-z]+$"; // アルファベットのみ
			String regex_AlphaNum = "^[A-Za-z0-9]+$"; // 半角英数字のみ
			Pattern p1 = Pattern.compile(regex_AlphaNum); // 正規表現パターンの読み込み
			Matcher m1 = p1.matcher(userName); // パターンと検査対象文字列の照合

			if (userName.length() > 10) {
				System.out.println("「名前を10文字以内にしてください」"); // 
				System.out.println(); 
			} else if (userName.length() <= 0 || userName == null) {
				System.out.println("「名前入力してください」");
				System.out.println();
				
			} else if (!m1.matches()) {
				System.out.println("「半角英数字のみで名前を入力してください」");
				System.out.println();
				
			} else {
				System.out.println("ユーザー名「" + userName + "」を登録しました");
				break;
			}
		}

		scanner.close();// Scannerを閉じる（リソース解放）
		Random rand = new Random();
		int num = 0;
		while (true) {

			int myhand = rand.nextInt(3);
			int yourhand = rand.nextInt(3);
			String[] handArray = { "グー", "チョキ", "パー" };
			System.out.println(userName + "の手は「" + handArray[myhand] + "」");
			System.out.println("相手の手は「" + handArray[yourhand] + "」");
			System.out.println();
			num++;

			if (myhand == yourhand) {
				System.out.println("DRAW あいこ もう一回しましょう！");
				System.out.println();
			} else if (myhand == 1 && yourhand == 0) {
				System.out.println("俺の勝ち！");
				System.out.println("負けは次につながるチャンスです！");
				System.out.println("ネバーギブアップ！");
				System.out.println();
				
			} else if (myhand == 2 && yourhand == 1) {
				System.out.println("俺の勝ち！");
				System.out.println("たかがじゃんけん、そう思ってないですか？");
				System.out.println("それやったら次も、俺が勝ちますよ");
				System.out.println();

			} else if (myhand == 0 && yourhand == 2) {
				System.out.println("俺の勝ち！");
				System.out.println("なんで負けたか、明日まで考えといてください。");
				System.out.println("そしたら何かが見えてくるはずです");
				System.out.println();

			} else {
				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて");
				System.out.println();
				System.out.println("勝つまでにかかった合計回数は" + num + "回です");
				break;
			}
		}
	}
}
