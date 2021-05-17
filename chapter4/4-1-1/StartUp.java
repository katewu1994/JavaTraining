package exe4_1_1;

public class StartUp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
//		Managerクラスのオブジェクトを生成する
		Manager mgr = new Manager(5);
		
//		スーパークラスのprint()メソッドを呼び出す
		mgr.print();
		
//		サブクラスのdisplay()メソッドを呼び出す
		mgr.display();
	}

}
