package exe3_1_4;

public class StartUp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//在庫オブジェクトの生成
		Stock stock = new Stock();
		
		//セッターを使用して値を設定する
		stock.setCode("AA0001");
		stock.setStockQuantity(1000);
		
		//在庫引当メソッドを呼び出す
		stock.reduceStock(100);
		
		//在庫数の取得メソッドを呼び出す
		int quantity = stock.getStockQuantity();
		
		//在庫数を表示する
		System.out.println("変更後の在庫数" + quantity);	
	}

}
