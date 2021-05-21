package s2_3;


public class Shop {
	
	String shopName;
	String telNo;
	Goods goods;
	
	public Shop() {}
	
	public Shop(String shopName, String telNo) {
		this.shopName = shopName;
		this.telNo = telNo;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	public String getShopName() {
		return shopName;
	}
	
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	
	public String getTelNo() {
		return telNo;
	}
	
	public void createGoods(String goodsName, int price) {
		goods = new Goods(goodsName, price);
	}
	
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	
	public Goods getGoods() {
		return goods;
	}
	
	
	public void printShop() {
		System.out.println("(Shop)　 " + shopName + "です。　TEL: " + telNo);
		goods.printGoods();
	}
	
	public void saleGoods(String goodsName, ShoppingBag shoppingBag) {
		if(goodsName.equals(goods.getGoodsName())) {
			if(shoppingBag.getMoney() >= goods.getPrice()) {
				int change = shoppingBag.getMoney() - goods.getPrice();
				System.out.println("　(Shop)　" + shopName + "「" + goodsName + "は" + goods.getPrice() + "円です。 "
						+ "まいどあり！お釣りは" + change +"円です。」");
				shoppingBag.setGoods(goods);
				shoppingBag.money = change;
			}
			else {
				System.out.println("　(Shop)　" + shopName + "「" + goodsName + "は" + goods.getPrice() + "円です。 "
						+ "「お金が足りません。」");
			}
		}
		else {
			System.out.println("　(Shop)　" + shopName + "「" + goodsName + "は取り扱っていません。申し訳ございません。" );
		}
	}
}
