package exe4_2_2;

public class StartUp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		MobilePhone mp = new MobilePhone("山田");
		
		System.out.println("-callメソッドの呼び出し-");
		mp.call();
		
		System.out.println("-stopメソッドの呼び出し-");
		mp.stop();
	}

}
