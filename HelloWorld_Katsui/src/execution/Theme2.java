package execution;

import process.Process;

//実行
public class Theme2 {

	public static void main(String[] args) {

		Process message = new Process("こんにちは！", "日本", "寿司", "和食");
		message.show();
	}

}
