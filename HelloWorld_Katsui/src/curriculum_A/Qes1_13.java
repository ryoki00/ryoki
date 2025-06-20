package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//q1
		byte byte1;
		short short1;
		int int1;
		long long1;
		float float1;
		double double1;
		char char1;
		String String1;
		boolean boolean1;
		
		//q2
		byte1=0;
		short1=0;
		int1=0;
		long1=0L;
		float1=	0.0f;
		double1=0.0d;
		char1='\u0000';
		String1=null;
		boolean1=false;
		
		//q3
		byte1=10;
		short1=100;
		int1=1000;
		long1=10000;
		float1=9.5f;
		double1=10.5;
		char1='a';
		String1="ハロー";
		boolean1=true;
		
		//q4
		System.out.println(long1+int1+short1+byte1);
		System.out.println(byte1*2);
		System.out.println(char1+String1+boolean1);
		System.out.println(long1+int1+short1+byte1+float1+double1);
		System.out.println(long1*int1*short1*byte1);
		System.out.println(double1/short1);
		System.out.println(byte1-short1);
		System.out.print("\n");
		
		//q5
		int num=20;
		int num1=23;
		System.out.println("ハローJAVA"+(num+num1));
		System.out.print("\n");
		
		//q6
		String1="山田太郎";
		int1=18;
		double1=170.5;
		float1=62.2f;
		System.out.println("「初めまして"+(String1)+"です」");
		System.out.println("「年齢は"+(int1)+"歳です」");
		System.out.println("「身長は"+(double1)+"cmです」");
		System.out.println("「体重は"+(float1)+"kgです」");
		String1="寿司";
		System.out.println("「好きな食べ物は"+(String1)+"です」");
		System.out.print("\n");
		
		//q7
		double1= double1/100;
		double bmi=  float1/ (double1 * double1);;
		System.out.printf("BMIは %.2f です。\n", bmi);
		System.out.print("\n");
		
		
		//q8
		String1="鈴木一郎";
		int1=24;
		double1=168.5;
		float1=64.2f;
		System.out.println("「初めまして"+(String1)+"です」");
		System.out.println("「年齢は"+(int1)+"歳です」");
		System.out.println("「身長は"+(double1)+"cmです」");
		System.out.println("「体重は"+(float1)+"kgです」");
		String1="オムライス";
		System.out.println("「好きな食べ物は"+(String1)+"です」");
		
		double1= double1/100;
		double bmi2=  float1/ (double1 * double1);;
		System.out.printf("BMIは %.1f です。", bmi2);
		System.out.print("\n");
		System.out.print("\n");  //?
		
		//q9
		System.out.println("「年齢は"+(int1*2)+"歳です」");
		System.out.println("「身長は"+(double1*200)+"cmです」");
		System.out.println("「体重は"+(float1*2)+"kgです」");
		System.out.println("「好きな食べ物は"+(String1)+"です」");
		System.out.printf("BMIは %.2f です。\n", bmi2/2);
		System.out.print("\n");
		double1= double1*100;
		
		//q10
		System.out.println(int1 >= 25); 
		System.out.print("\n");
		
		//q11
		String Age;
		String Height;
		String Weight;
		Age = String.valueOf(int1);
		Height= String.valueOf(double1);
		Weight = String.valueOf(float1);
		System.out.println("「年齢は"+(Age)+"歳、身長は"+(Height)+"cm、体重は"+(Weight)+"kgです。」");
		System.out.print("\n");
		
		//q12
		int inta;
		int inth;
		
		inta = Integer.parseInt(Age);
		inth = (int) Double.parseDouble(Height);
		
		
		System.out.println("「年齢は"+(inta)+"歳です」");
		System.out.println("「身長は"+(inth)+"cmです」");
		System.out.print("\n");
		
		//q13
		System.out.println((inta == 25) || (inth >= 160)); 
		System.out.print("\n");
		
		
	}

}
