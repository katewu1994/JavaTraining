package exe2_3_5;

public class Matrix {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//九九の表を作る
		for (int i = 1; i <= 9; i ++) {
			for (int j = 1; j <= 9; j ++) {
				int ans = i * j;
				if (ans < 10) {
					System.out.print("  " + ans);
				}
				else {
					System.out.print(" "+ ans);
				}
			}
			System.out.println();
		}
		
	}

}
