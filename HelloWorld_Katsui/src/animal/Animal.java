package animal;

public class Animal {
	// フィールド1
	private String name;
	private double length;
	private int speed;

	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// getter
	public String getName() {
		return name;
	}

	public double getLength() {
		return length;
	}

	public int getSpeed() {
		return speed;
	}
}