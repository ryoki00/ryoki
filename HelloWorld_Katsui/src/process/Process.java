package process;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Process {
	//フィールド
	private String greeting;
	private String place;
	private String food;
	private String type;
	private LocalDateTime now;

	//コンストラクタ
	public Process(String greeting, String place, String food, String type) {
		this.greeting = greeting;
		this.place = place;
		this.food = food;
		this.type = type;

	}

	//表示1
	public void show() {
		System.out.println(this.greeting + "ここは" + this.place + "です!");
		System.out.println("この" + this.food + "はうまい");
		System.out.println(this.food + "は" + this.type + "です");

		this.now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		System.out.println("今の現在日時は" + this.now.format(formatter) + "です");

	}

	/*
		 
		下記がコンソールに出力されるように作成してください
		
			こんにちは！ここは日本です！
			この寿司はうまい
			寿司は和食です
			今の現在日時は2023/03/09 10:23:39です
	
		【条件】
			・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
			・適切なファイルにフィールドで変数を必要な数作ってください。
			・thisを使って作成してください。
			・日時は今日の日付を取得してください。
			
	  */

}
