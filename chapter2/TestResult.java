package exe2_2_2;

public class TestResult {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//任意のテスト点数を変数に格納する
		int score = 50;
		
		//テストの点数をもとに、合否を判定して結果を表示する
		// 70点以上　→　A
		if(score >= 70) {
			System.out.print("A");
		}
		// 50点未満　→　C
		else if(score < 50) {
			System.out.print("C");
		}
		// 70点未満50点以上　→　B
		else {
			System.out.print("B");

	}

	}

}
