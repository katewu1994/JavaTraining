package exe3_1_1;

class Item {
	
	String code; //商品コード
	String name; //商品名
	int price;   //単価
	
	//表示メソッド
	public void print() {
		System.out.println("Product code:" + code);
		System.out.println("Name:" + name);
		System.out.println("Price:" + price);
	}

}
