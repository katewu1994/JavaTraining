package exe2_2_4;

public class Season {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int i = 3;      //任意の季節の値を変数に格納する
		
		//季節の値を判断し季節を表示する
		switch(i) {
		case 1:
			System.out.print("Spring");    // 1 →　春 
			break;
		case 2:
			System.out.print("Summer");    // 2 →　夏
			break;
		case 3:
			System.out.print("Autumn");    // 3 →　秋
			break;
		case 4:
			System.out.print("Winter");    // 4 →　冬
			break;
		default:
			System.out.print("Please enter the number from 1 to 4."); // 1から4以外 →　1~4の数字を指定します
		}

	}

}
