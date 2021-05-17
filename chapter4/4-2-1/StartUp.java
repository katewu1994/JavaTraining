package exe4_2_1;

public class StartUp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
//		MobilePhoneクラスのオブジェクト生成
		MobilePhone mp = new MobilePhone();
		
//		call()メソッドの呼び出し
		System.out.println("-callメソッドの呼び出し-");
		mp.call("03-1234-5678");
		
//		shot()メソッドの呼び出し
		System.out.println("-shotメソッドの呼び出し-");
		mp.shot();
	}

}
