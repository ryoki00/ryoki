package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		// 九九表（1〜9の掛け算）を出力するプログラム
		
		// 外側のfor文：左側の数（1〜9）を順に処理
		for (int i = 1; i <= 9; i++) {
			
			// 内側のfor文：右側の数（1〜9）を順に処理
			for (int j = 1; j <= 9; j++) {
				
				// 9×9のときのみ「||」を付けない（行の最後だから）
				if (j == 9) {
					// %02d：2桁表示（例：01, 02, ... 09）
					System.out.printf("%02d * %02d = %02d", i, j, i * j);
					
				} else {
					// 行の途中は区切り「||」を付ける
					System.out.printf("%02d * %02d = %02d || ", i, j, i * j);

				}
			}
			
			// 1行出力が終わったら空行を入れて見やすくする
			System.out.println();
			System.out.println();
		}
	}
}
