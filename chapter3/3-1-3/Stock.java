package exe3_1_3;

//在庫クラス
class Stock {
	
	//メンバ変数を定義する
	private String code;
	private int stockQuantity;
	
	//メソッドを定義する
	//商品コードの設定
	public void setCode(String pCode) {
		code = pCode;
	}
	
	//在庫数を定義する
	public void setStockQuantity(int pStockQuantity) {
		stockQuantity = pStockQuantity;
	}
	
	//表示メソッド
	public void print() {
		System.out.print("PRODUCT CODE:" + code);
		System.out.print("STOCK QUANTITTY:" + stockQuantity);
	}

}
