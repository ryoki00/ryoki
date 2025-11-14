package question_28;

public class Animal {

	private String[][] result;

	public Animal(String input) {

		//,区切りで文字を分割
		String[] str = input.split(",");

		this.result = new String[str.length][3];

		for (int i = 0; i < str.length; i++) {
		//：区切りで文字を分割
			this.result[i] = str[i].split(":");
		}
	}

	public void show() {

		for (int a = 0; a < this.result.length; a++) {
			System.out.println("動物名:" + this.result[a][0]);
			System.out.println("体長:" + this.result[a][1] + "m");
			System.out.println("速度:" + this.result[a][2] + "km/h");
			System.out.println("学名:" + this.getLatinName(this.result[a][0]));
			System.out.println();
		}
	}

	private String getLatinName(String name) {
		switch (name) {

		case "ライオン":
			return "パンテラ レオ";
		case "ゾウ":
			return "ロキソドンタ・サイクロティス";
		case "パンダ":
			return "アイルロポダ・メラノレウカ";
		case "チンパンジー":
			return "パン・トゥログロディテス";
		case "シマウマ":
			return "チャップマンシマウマ";

		default:
			return "不明";
		}

	}

}
