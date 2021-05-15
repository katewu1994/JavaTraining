package exe3_2_2;

class Stock {
	
//	メンバ変数を定義する
	private String code;
	private int stockQuantity;
	
//	コンストラクタ（引数一つ）を定義する
	public Stock(String code){
		this.code = code;
	}
	
//	コンストラクタ（引数二つ）を定義する
	public Stock(String code, int stockQuantity) {
		this.code = code;
		this.stockQuantity = stockQuantity;
	}
	
//	メソッドを定義する
//	商品コードの設定
	public void setCode(String code) {
		this.code = code;
	}

	
//	在庫数の設定
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	
//	商品コードの取得
	public String getCode() {
		return code;
	}
	
//	在庫数の取得
	public int getStockQuantity() {
		return stockQuantity;
	}
	
//	在庫を引当たる
	public void reduceStock(int quantity) {
		stockQuantity = stockQuantity - quantity;
	}
	
//	情報の表示
	public void print() {
		System.out.println("CODE:" + code);
		System.out.println("STOCK:" + stockQuantity);
	}
}
