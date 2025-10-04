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
		byte1=0;
		short1=0;
		int1=0;
		long1=0L;
		float1=	0.0f;
		double1=0.0d;
		char1='\u0000';
		string1=null;
		boolean1=false;
		
		//q3 初期化をしたそれぞれの変数に課題の値を代入
		byte1=10;
		short1=100;
		int1=1000;
		long1=10000;
		float1=9.5f;
		double1=10.5;
		char1='a';
		string1="ハロー";
		boolean1=true;
		
		//q4　上記で作成した変数を使用
		
		System.out.println(long1+int1+short1+byte1);
		System.out.println(byte1*2);
		System.out.println(char1+string1+boolean1);
		System.out.println(long1+int1+short1+byte1+float1+double1);
		System.out.println(long1*int1*short1*byte1);
		System.out.println(double1/short1);
		System.out.println(byte1-short1);
		System.out.print("\n");
		
		//q5　変数を整数型で使用
		int num=20;
		int num1=23;
		System.out.println("ハローJAVA"+(num+num1));
		System.out.print("\n");
		
		//q6　変数をそれぞれの型で使用
		string1="山田太郎";
		int1=18;
		double1=170.5;
		float1=62.2f;
		System.out.println("「初めまして"+(string1)+"です」");
		System.out.println("「年齢は"+(int1)+"歳です」");
		System.out.println("「身長は"+(double1)+"cmです」");
		System.out.println("「体重は"+(float1)+"kgです」");
		string1="寿司";
		System.out.println("「好きな食べ物は"+(string1)+"です」");
		System.out.print("\n");
		
		//q7　bmiを計算
		double1= double1/100;
		double bmi=  float1/ (double1 * double1);;
		System.out.printf("BMIは %.2f です。\n", bmi);
		System.out.print("\n");
		
		
		//q8　q6で宣言した変数に再代入
		string1="鈴木一郎";
		int1=24;
		double1=168.5;
		float1=64.2f;
		System.out.println("「初めまして"+(string1)+"です」");
		System.out.println("「年齢は"+(int1)+"歳です」");
		System.out.println("「身長は"+(double1)+"cmです」");
		System.out.println("「体重は"+(float1)+"kgです」");
		string1="オムライス";
		System.out.println("「好きな食べ物は"+(string1)+"です」");
		
		double1= double1/100;
		double bmi2=  float1/ (double1 * double1);;
		System.out.printf("BMIは %.1f です。", bmi2);
		System.out.print("\n");
		System.out.print("\n");  //?
		
		//q9 8で使用した変数【年齢・身長・体重】の数値を和算で自己代入
		int1 = int1 + int1;
		double1 = double1 + double1;
		float1 = float1 /2;

		System.out.println("「年齢は"+(int1)+"歳です」");
		System.out.println("「身長は"+(double1*100)+"cmです」");
		System.out.println("「体重は"+(float1)+"kgです」");
		System.out.println("「好きな食べ物は"+(string1)+"です」");
		double1= double1/100;
		double bmi3=  float1/ (double1 * double1);;

		System.out.printf("BMIは %.2f です。\n", bmi3);
		System.out.print("\n");
		double1= double1*100;
		
		//q10 8で使用した年齢が25歳以上ならtrueを出力
		int1=24;
		System.out.println(int1 >= 25); 
		System.out.print("\n");
		
		//q11　8で使用した【年齢・身長・体重】を文字列型に型変換
		String age;
		String height;
		String weight;
		age = String.valueOf(int1);
		height= String.valueOf(double1);
		weight = String.valueOf(float1);
		System.out.println("「年齢は"+(age)+"歳、身長は"+(height)+"cm、体重は"+(weight)+"kgです。」");
		System.out.print("\n");
		
		//q12　11で変換した【年齢・身長】を整数型に変換
		int inta;
		int inth;
		
		inta = Integer.parseInt(age);
		inth = (int) Double.parseDouble(height);
		
		
		System.out.println("「年齢は"+(inta)+"歳です」");
		System.out.println("「身長は"+(inth)+"cmです」");
		System.out.print("\n");
		
		//q13　12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力
		System.out.println((inta == 25) || (inth >= 160)); 
		System.out.print("\n");
		
		
	}

}
