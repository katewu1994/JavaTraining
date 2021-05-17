package exe5_1_2;

public class StartUp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		if(args.length != 1) {
			System.out.println("要素番号を一つ入力してください。");
		}
		else {
//			MyThrowsクラスのオブジェクトを生成する
			MyThrows mt = new MyThrows();
			
//			convertNumber(),exFunc()メソッドを呼び出す
			try {
				int index = mt.convertNumber(args[0]);
				mt.exFunc(index);
			}
			catch(NumberFormatException e) {
				System.out.println("数値を入力してください。");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("要素数を超えています。");
			}
		}
	}

}
