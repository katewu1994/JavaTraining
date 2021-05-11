package exe2_2_1;

public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//任意のテスト点数を変数に格納する
		int score = 50;
		
		//テストの点数をもとに、合否を判定して結果を表示する
		// 70点以上　→　合格
		if(score >= 70) {
			System.out.print("PASS");
		}
		// 70点未満　→　不合格
		else {
			System.out.print("FAIL");
		}

	}

}
