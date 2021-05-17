package exe4_2_3;

public class StartUp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
//		Controllerクラスのオブジェクト生成
		Controller con = new Controller();
		
//		MobilePhoneクラスのオブジェクト生成
		MobilePhone mp = new MobilePhone("山田");
		
		System.out.println("-callメソッドの呼び出し-");
		con.call(mp);
		
		System.out.println("-stopメソッドの呼び出し-");
		con.stop(mp);
		
		System.out.println("----------------------------");
		
		DeskPhone dp = new DeskPhone("岡山");
		
		System.out.println("-callメソッドの呼び出し-");
		con.call(dp);
		
		System.out.println("-stopメソッドの呼び出し-");
		con.stop(dp);
	}

}
