package s2_3;

public class ShoppingBag {
	
	int money;
	Goods goods;
	
	public ShoppingBag() {}
	
	public ShoppingBag(int money) {
		this.money = money;
	}
	
	public void setMoney(int money) {
		this.money =money;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	
	public Goods getGoods() {
		return goods;
	}
	
	public void printShoppingBag() throws MyException {
		System.out.println("　(ShoppingBag)　限度額　" + money + "円");
		if(goods == null) {
			throw new MyException("　(ShoppingBag)　商品は入っていません。");
		}
		else {
			goods.printGoods();
		}
	}

}
