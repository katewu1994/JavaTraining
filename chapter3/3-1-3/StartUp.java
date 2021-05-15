package exe3_1_3;

public class StartUp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//stockオブジェクトを生成する
		Stock stock = new Stock();
		
		//セッターを使用して値を設定する
		stock.setCode("AA001");
		stock.setStockQuantity(1000);
		
		//print()メソッドを呼び出す
		stock.print();
	}

}
