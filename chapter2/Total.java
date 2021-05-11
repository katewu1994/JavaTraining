package exe2_5_1;

public class Total {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//入力済みの配列
		int[] test = { 21, 33, 38, 50, 64, 71, 75, 79, 82, 95 };
		
		//変数の定義を初期化する
		int total = 0;
		float average = 0;
		int i;
		
		//合計点を計算し、表示する
		for (i = 0; i < test.length; i ++) {
			total = total + test[i];
		}
		System.out.println("TOTAL : " + total);
		
		//平均点を計算し、表示する
		average = (float) total / test.length;
		System.out.println("EVERAGE : " + average);
		
		//上位5人の点数を表示する
		for(i = 9; i > 4; i--) {
			System.out.println("Test(" + i +"):" + test[i] );
		}
		
	}

}
