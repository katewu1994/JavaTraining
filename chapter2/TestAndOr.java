package exe2_2_3;

public class TestAndOr {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//任意のテスト点数を変数に格納する
		int score1 = 50;
		int score2 = 90;
		
		//テストの点数をもとに、合否を判定して結果を表示する
		if (score1 >= 80 && score2 >= 80) {
			System.out.print("Well done!");    //二つのテストが８０点以上　→　よくできました！
		}
		else if (score1 <= 80 && score2 <= 80) {
			System.out.print("Just trying!");   //二つのテストが８０点未満　→　もう少し頑張りましょう！　
		}	
		else {
			System.out.print("Just a little bit more!");    //いずれか一つのテストが８０点以上　→　あと少し！
		}

	}

}
