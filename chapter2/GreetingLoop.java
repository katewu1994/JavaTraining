package exe2_4_2;

public class GreetingLoop {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//要素数３のString型の配列を生成する
		String[] str = new String[3];
		
		//配列を初期化する
		str[0] = "Good morning";
		str[1] = "Good afternoon";
		str[2] = "Good evening";
		
		//配列を5回繰り返して要素を表示する
		for(int i = 1; i <= 5; i ++) {
			for(int j = 0; j <= 2; j ++) {
				System.out.print(str[j] + " ");
			}
			System.out.println();
		}
		System.out.println();

	}

}
