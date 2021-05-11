package exe2_5_2;

public class Search {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//入力済みの配列
		int[] nums = { 7, 13, 28, 33, 50, 57, 69, 86, 91, 108, 111, 126, 135, 150, 158};
		
		//変数を定義する
		int data = Integer.parseInt(args[0]); //文字列を整数値に変換する
		String result = "FAIL"; //初期化
		
		//データを検索する
		for(int i = 0; i < 15; i++) {
			if (data == nums[i]) {
				result = "WIN";
			}
		}
		
		//結果を表示する
		System.out.println("Result: " + result);
	}

}
