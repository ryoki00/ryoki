package animal;

public class AnimalMain {
	public static void main(String[] args) {
		// インスタンス
		Animal lion = new Animal();

		// setter
		lion.setName("ライオン");
		lion.setLength(2.1);
		lion.setSpeed(80);

		// getter
		System.out.println("動物名：" + lion.getName());
		System.out.println("体長：" + lion.getLength() + "m");
		System.out.println("速度：" + lion.getSpeed() + "km/h");
	}
}