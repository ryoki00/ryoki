package sub_29;

import java.util.Arrays;

public class Sub {
	private int[] nums;
	private static final String[] datas = {
			"北海道:札幌市:83424",
			"青森県:青森市:9646",
			"岩手県:盛岡市:15275",
			"宮城県:仙台市:7282",
			"秋田県:秋田市:11638",
			"山形県:山形市:9323",
			"福島県:福島市:13784",
			"茨城県:水戸市:6097",
			"栃木県:宇都宮市:6408",
			"群馬県:前橋市:6362",
			"埼玉県:さいたま市:3798"
	};

	public Sub(String number) {
		String[] inputs = number.split(",");
		this.nums = new int[inputs.length];

		for (int i = 0; i < this.nums.length; i++) {
			this.nums[i] = Integer.parseInt(inputs[i]);
		}

	}

	public void show(String order) {

		Arrays.sort(this.nums);
		if (order.equals("降順")) {

			for (int i = 0; i < this.nums.length / 2; i++) {
				int temp = this.nums[i];
				this.nums[i] = this.nums[this.nums.length - 1 - i];
				this.nums[this.nums.length - 1 - i] = temp;
			}

		}

		for (int num : this.nums) {

			System.out.println();
			String[] content = datas[num].split(":");
			System.out.println("都道府県名：" + content[0]);
			System.out.println("県庁所在地：" + content[1]);
			System.out.println("面積：" + Double.parseDouble(content[2]) + "km2");
			System.out.println();
		}

	}

}
