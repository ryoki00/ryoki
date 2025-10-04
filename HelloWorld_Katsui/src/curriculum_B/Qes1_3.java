package curriculum_B;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Qes1_3 {

	public static void main(String[] args) {

		// 入力受付用のScannerを用意
		Scanner scanner = new Scanner(System.in);
		String userName = "";

		// ===== ユーザー名入力処理 =====
		while (true) {
			System.out.println("ユーザー名を入力してください（半角英数字10文字以内）：");
			userName = scanner.nextLine(); // 入力された文字列を取得

			// 正規表現（ルール）を定義
			String regex_Alphabet = "^[A-Za-z]+$";   // アルファベットのみ（未使用）
			String regex_AlphaNum = "^[A-Za-z0-9]+$"; // 半角英数字のみOK
			Pattern p1 = Pattern.compile(regex_AlphaNum); // パターンをコンパイル
			Matcher m1 = p1.matcher(userName); // 入力文字列と照合

			// --- 入力チェック ---
			if (userName.length() > 10) {
				// 文字数が10を超える場合
				System.out.println("「名前を10文字以内にしてください」");
				System.out.println();
			} else if (userName == null || userName.length() <= 0) {
				// 入力が空またはnullの場合
				System.out.println("「名前を入力してください」");
				System.out.println();
			} else if (!m1.matches()) {
				// 半角英数字以外が含まれている場合
				System.out.println("「半角英数字のみで名前を入力してください」");
				System.out.println();
			} else {
				// すべての条件を満たした場合
				System.out.println("ユーザー名「" + userName + "」を登録しました");
				break; // ループを抜ける
			}
		}

		// Scannerを閉じる（リソース解放）
		scanner.close();

		// ===== じゃんけんゲーム開始 =====
		Random rand = new Random(); // 乱数生成器
		int num = 0; // じゃんけんの試行回数カウンタ

		while (true) {
			// 0:グー、1:チョキ、2:パー をランダムに出す
			int myhand = rand.nextInt(3);
			int yourhand = rand.nextInt(3);

			// 手の名前を配列で管理
			String[] handArray = { "グー", "チョキ", "パー" };

			// 自分と相手の手を表示
			System.out.println(userName + "の手は「" + handArray[myhand] + "」");
			System.out.println("相手の手は「" + handArray[yourhand] + "」");
			System.out.println();

			// カウンタを1増やす
			num++;

			// --- 勝敗判定 ---
			if (myhand == yourhand) {
				// あいこの場合
				System.out.println("DRAW あいこ もう一回しましょう！");
				System.out.println();

			} else if (myhand == 1 && yourhand == 0) {
				// プレイヤーがチョキ・相手がグー → 負け
				System.out.println("俺の勝ち！");
				System.out.println("負けは次につながるチャンスです！");
				System.out.println("ネバーギブアップ！");
				System.out.println();

			} else if (myhand == 2 && yourhand == 1) {
				// プレイヤーがパー・相手がチョキ → 負け
				System.out.println("俺の勝ち！");
				System.out.println("たかがじゃんけん、そう思ってないですか？");
				System.out.println("それやったら次も、俺が勝ちますよ");
				System.out.println();

			} else if (myhand == 0 && yourhand == 2) {
				// プレイヤーがグー・相手がパー → 負け
				System.out.println("俺の勝ち！");
				System.out.println("なんで負けたか、明日まで考えといてください。");
				System.out.println("そしたら何かが見えてくるはずです");
				System.out.println();

			} else {
				// それ以外 → プレイヤーの勝ち
				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて");
				System.out.println();
				// 勝つまでの回数を表示
				System.out.println("勝つまでにかかった合計回数は" + num + "回です");
				break; // ゲーム終了
			}
		}
	}
}
