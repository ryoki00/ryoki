package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

    public static void main(String[] args) {
    	
        // 入力受付と乱数生成の準備
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        // ユーザーに商品名の入力を促す
        System.out.println("商品を入力してください（例: パソコン、冷蔵庫、テレビ、扇風機）：");
        String input = scanner.nextLine(); // 1行の入力を取得

        // 入力された文字列を「、」で区切って配列に分割
        // 例：「パソコン、冷蔵庫」→ ["パソコン", "冷蔵庫"]
        String[] items = input.split("、");

        // 入力された各商品ごとに処理
        for (String item : items) {
            item = item.trim(); // 前後の空白を削除（安全のため）

            // 0〜11の範囲で在庫数をランダムに生成
            int stock = rand.nextInt(12);

            // 商品名ごとに処理を分岐
            switch (item) {
            
                // 一般的な家電5種類（パソコン・冷蔵庫・扇風機・洗濯機・加湿器）
                case "パソコン":
                case "冷蔵庫":
                case "扇風機":
                case "洗濯機":
                case "加湿器":
                    System.out.println(item + "の残り台数は " + stock + " 台です。");
                    break;

                // 「テレビ」と「ディスプレイ」の場合だけ特別なルール
                case "テレビ":
                case "ディスプレイ":
                    // ディスプレイのときは、在庫を(11 - 乱数)で計算して逆転させる
                    int displayStock = item.equals("ディスプレイ") ? (11 - stock) : stock;
                    System.out.println(item + "の残り台数は " + displayStock + " 台です。");
                    break;

                // それ以外の入力（登録されていない商品）の場合
                default:
                    System.out.println("『" + item + "』は指定の商品ではありません。");
                    break;
            }
        }

        // Scannerを閉じる（リソース解放）
        scanner.close();
    }
}
