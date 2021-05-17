package exe5_1_1;

public class Division {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		if(args.length != 2) {
			System.out.println("Usage : java Division <割られる整数> <割る整数>");
		}else {
//			例外処理を追加する
			try {
//				文字列を数値に変換
				int x = Integer.parseInt(args[0]);
				int y = Integer.parseInt(args[1]);
				
//　　　　　　　　割り算
				int w = x / y;
				System.out.println(args[0] + "を" + args[1] + "で割った値は" + w + "です。");
			}
			catch(ArithmeticException e) {
				System.out.println("割る数に0が指定されています。");
//				エラー情報を表示する
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			catch(NumberFormatException e) {
				System.out.println("入力された値を整数化できません。");
//				エラー情報を表示する
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}	
	}

}
