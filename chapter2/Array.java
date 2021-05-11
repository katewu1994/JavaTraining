package exe2_4_1;

public class Array {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//要素数３のString型の配列を生成する
		String[] str = new String[3];
		
		//配列を初期化する
		str[0] = "one";
		str[1] = "two";
		str[2] = "three";
		
		//各要素を表示する
		for (int i = 0; i < str.length; i ++) {
			System.out.println(str[i]);
		}
		
		//配列の要素数を表示する
		System.out.println("The number of elements: " + str.length);
	}

}
