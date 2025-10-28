package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//q1ローカル変数として宣言
		byte byte1;
		short short1;
		int int1;
		long long1;
		float float1;
		double double1;
		char char1;
		String string1;
		boolean boolean1;

		//q2 それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化
		byte1 = 0;
		short1 = 0;
		int1 = 0;
		long1 = 0L;
		float1 = 0.0f;
		double1 = 0.0d;
		char1 = '\u0000';
		string1 = null;
		boolean1 = false;

		//q3 初期化をしたそれぞれの変数に課題の値を代入
		byte1 = 10;
		short1 = 100;
		int1 = 1000;
		long1 = 10000;
		float1 = 9.5f;
		double1 = 10.5;
		char1 = 'a';
		string1 = "ハロー";
		boolean1 = true;

		//q4　上記で作成した変数を使用

		System.out.println(long1 + int1 + short1 + byte1);
		System.out.println(byte1 * 2);
		System.out.println(char1 + string1 + boolean1);
		System.out.println(long1 + int1 + short1 + byte1 + float1 + double1);
		System.out.println(long1 * int1 * short1 * byte1);
		System.out.println(double1 / short1);
		System.out.println(byte1 - short1);
		System.out.print("\n");

		//q5　変数を整数型で使用
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));
		System.out.print("\n");

		//q6　変数をそれぞれの型で使用
		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2;
		System.out.println("「初めまして" + (name) + "です」");
		System.out.println("「年齢は" + (age) + "歳です」");
		System.out.println("「身長は" + (height) + "cmです」");
		System.out.println("「体重は" + (weight) + "kgです」");
		String food = "寿司";
		System.out.println("「好きな食べ物は" + (food) + "です」");
		System.out.print("\n");

		//q7　bmiを計算

		double bmi = weight / ((height / 100) * (height / 100));
		System.out.printf("BMIは %.2f です。\n", bmi);
		System.out.print("\n");

		//q8　q6で宣言した変数に再代入
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		System.out.println("「初めまして" + (name) + "です」");
		System.out.println("「年齢は" + (age) + "歳です」");
		System.out.println("「身長は" + (height) + "cmです」");
		System.out.println("「体重は" + (weight) + "kgです」");
		food = "オムライス";
		System.out.println("「好きな食べ物は" + (food) + "です」");

		double bmi2 = weight / ((height / 100) * (height / 100));
		System.out.printf("BMIは %.1f です。", bmi2);
		System.out.print("\n");
		System.out.print("\n"); //?

		//q9 8で使用した変数【年齢・身長・体重】の数値を和算で自己代入
		age = age + age;
		height = height + height;
		weight = weight + weight;

		System.out.println("「年齢は" + (age) + "歳です」");
		System.out.println("「身長は" + (height) + "cmです」");
		System.out.println("「体重は" + (weight) + "kgです」");
		System.out.println("「好きな食べ物は" + (food) + "です」");
		double bmi3 = weight / ((height / 100) * (height / 100));

		System.out.printf("BMIは %.2f です。\n", bmi3);
		System.out.print("\n");

		//q10 8で使用した年齢が25歳以上ならtrueを出力
		age = 24;
		height = 168.5;
		weight = 64.2;
		System.out.println(age >= 25);
		System.out.print("\n");

		//q11　8で使用した【年齢・身長・体重】を文字列型に型変換
		String age1;
		String height1;
		String weight1;
		age1 = String.valueOf(age);
		height1 = String.valueOf(height);
		weight1 = String.valueOf(weight);
		System.out.println("「年齢は" + (age1) + "歳、身長は" + (height1) + "cm、体重は" + (weight1) + "kgです。」");
		System.out.print("\n");

		//q12　11で変換した【年齢・身長】を整数型に変換
		int inta;
		int inth;

		inta = Integer.parseInt(age1);
		inth = (int) Double.parseDouble(height1);

		System.out.println("「年齢は" + (inta) + "歳です」");
		System.out.println("「身長は" + (inth) + "cmです」");
		System.out.print("\n");

		//q13　12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力
		System.out.println((inta == 25) || (inth >= 160));
		System.out.print("\n");

	}

}
