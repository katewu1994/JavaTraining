package s2_3;

public class Goods {
	
	private String goodsName;
	private int price;
	
	public Goods() {}
	
	public Goods(String goodsName, int price) {
		this.goodsName = goodsName;
		this.price = price;
	}
	
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public String getGoodsName() {
		return goodsName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void printGoods() {
		System.out.println("　(Goods)　" + goodsName + "　" + price + "円");
	}
}
