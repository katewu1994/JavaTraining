package exe3_1_1;

public class StartUp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//itemオブジェクトを生成する
		Item item1 = new Item();
		
		//itemオブジェクトの属性に直接アクセスして値を設定する
		item1.code = "AA001";
		item1.name = "ballpen";
		item1.price = 100;
		
		//print()メソッドを呼び出す
		item1.print();
		
		Item item2 = new Item();
		
		item2.code = "BB001";
		item2.name = "notebook";
		item2.price = 150;
		
		item2.print();
	}

}
