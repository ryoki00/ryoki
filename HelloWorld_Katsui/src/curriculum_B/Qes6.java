package curriculum_B;


	import java.util.Random;
import java.util.Scanner;


	public class Qes6 {
	    public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);// Scannerの準備
	        Random rand = new Random();

	        System.out.println("商品を入力してください（例: パソコン,冷蔵庫,テレビ,扇風機）：");
	        String input = scanner.nextLine();
	        String[] items = input.split("、"); // 「、」区切りで分割

	        for (String item : items) {
	            item = item.trim(); // 前後の空白削除
	            int stock = rand.nextInt(12); // 0〜11の乱数
	            switch (item) {
	                case "パソコン":
	                case "冷蔵庫":
	                case "扇風機":
	                case "洗濯機":
	                case "加湿器":
	                    System.out.println(item + "の残り台数は " + stock + " 台です。");
	                    break;
	                case "テレビ":
	                case "ディスプレイ":
	                    // ディスプレイの時は 11 から乱数を引いた値
	                    int displayStock = item.equals("ディスプレイ") ? (11 - stock) : stock;
	                    System.out.println(item + "の残り台数は " + displayStock + " 台です。");
	                    break;
	                default:
	                    System.out.println("『" + item + "』は指定の商品ではありません");
	                    break;
	            }
	        }
	        scanner.close();
	    }
	}

