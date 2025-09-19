package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
			for(int i = 1; i <= 9; i++) {
	            for(int j = 1; j <= 20; j++){
	            	if( j == 20) {
	            		System.out.print(String.format("%03d", j)+ " * " + String.format("%03d", i) +" = "+ String.format("%03d", i*j));
	            	}else {
	            		System.out.print(String.format("%03d", j)+ " * " + String.format("%03d", i) +" = "+ String.format("%03d", i*j)+" || ");
	            	}
	            	
	            }
	            //改行
	            System.out.println();
	            System.out.println();
	        }
		}
	}


