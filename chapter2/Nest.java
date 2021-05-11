package exe2_2_6;

public class Nest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//整数を格納する変数を宣言して、任意の値で初期化する
		int n = 31;
		
		//値が０より大きい場合、値の判定を行う
		if (n > 0) {
			int m = n / 2;
			if (2 * m == n) {
				System.out.print(n + " : even"); //nは偶数
			}
			else {
				System.out.print(n + " : odd"); //nは奇数
			}
		}
		//値が0以下の場合
		else {
			System.out.print("Please enter a number greater than 0.");
		}

	}

}
