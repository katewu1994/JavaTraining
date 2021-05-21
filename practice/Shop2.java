package s2_3;

import java.util.ArrayList;

public class Shop2 extends Shop{
	
	String shopName;
	String telNo;
	ArrayList<Goods> goodsList;
	
	public Shop2() {
	}
	
	public Shop2(String shopName, String telNo) {
		super(shopName, telNo);
		this.shopName = shopName;
		this.telNo = telNo;
		goodsList = new ArrayList<>();
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
	
	public void SetGoodsList(ArrayList<Goods> goodsList) {
		this.goodsList = goodsList;
	}
	
	public ArrayList<Goods> getGoodsList() {
		return goodsList;
	}
	
	
	public void addGoods(String goodsName, int price) {
		goodsList.add(new Goods(goodsName, price));
	}
	
	public void printShop() {
		System.out.println("(Shop)　 " + shopName + "です。　TEL: " + telNo);
		for(Goods goods:goodsList) {
			goods.printGoods();
		}
	}
	
	public void salesGoods(String goodsName, ShoppingBag shoppingBag) {
		Goods target = new Goods("NULL", 0);
		for (Goods goods: goodsList) {
			if(goodsName.equals(goods.getGoodsName())) {
				target = goods;
			}
		}
		super.goods = target;
		super.saleGoods(goodsName, shoppingBag);
	}
}
