package exe3_1_4;

class Stock {
	
	//メンバ変数を定義する
	private String code;
	private int stockQuantity;
	
	//メソッドを定義する
	//codeの設定
	public void setCode(String pCode) {
		code = pCode;
	}
	
	//stockQuantityの設定
	public void setStockQuantity(int pStockQuantity) {
		stockQuantity = pStockQuantity;
	}
	
	//codeの取得
	public String getCode() {
		return code;
	}
	
	//stockQuantityの取得
	public int getStockQuantity() {
		return stockQuantity;
	}
	
	//在庫を引き当てる
	public void reduceStock(int quantity) {
		stockQuantity = stockQuantity - quantity;
	}
}
