package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		// 1〜20の掛け算表（1〜9倍）を出力するプログラム
		
		// 外側のfor文：掛けられる数（1〜9）を順番に処理
		for (int i = 1; i <= 9; i++) {
			
			// 内側のfor文：掛ける数（1〜20）を順番に処理
			for (int j = 1; j <= 20; j++) {
				
				// jが20（最後の列）の場合は区切り「||」を付けない
				if (j == 20) {
					System.out.print(
						String.format("%03d", j) + " * " +
						String.format("%03d", i) + " = " +
						String.format("%03d", i * j)
					);
				} else {
					// それ以外は「||」で区切る
					System.out.print(
						String.format("%03d", j) + " * " +
						String.format("%03d", i) + " = " +
						String.format("%03d", i * j) + " || "
					);
				}
			}
			
			// 1行分の九九が終わったら改行を2つ入れて見やすくする
			System.out.println();
			System.out.println();
		}
	}
}
