package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	private static void output(String str, int num) {
		System.out.println(str + " " + num);
	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	private static void multiply(int num1, int num2) {
		System.out.println(num1 * num2);
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	private static void array(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	private static void multiply(double num1, double num2) {
		System.out.println(num1 + num2);
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	private static int[] random(int num1) {
		int[] nums = new int[num1];
		Random rand = new Random(); // 乱数生成器
		for (int i = 0; i < num1; i++) {
			nums[i] = rand.nextInt(100) + 1;
			System.out.println(nums[i]);
		}
		return nums;

	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	private static double average(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		double ave = (double) sum / nums.length;
		System.out.println(ave);
		return ave;
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	private static void judge(double ave) {

		System.out.println(ave >= 50);
	}

	public static void main(String[] args) {
		// Q1
		output("Hello JavaSE", 11);
		// Q2
		multiply(3, 5);
		// Q3 
		int[] arr = { 1, 2, 3, 4, 0 };
		array(arr);
		// Q4
		multiply(3.4, 5.2);
		// Q5
		int[] random = random(3);
		// Q6
		double ave = average(random);
		// Q7
		judge(ave);
	}
}
