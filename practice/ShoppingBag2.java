package s2_3;

import java.util.*;

public class ShoppingBag2 extends ShoppingBag{
	
	int money;
	ArrayList<Goods> buyGoodsList;
	
	public ShoppingBag2() {}
	
	public ShoppingBag2(int money) {
		super(money);
		this.money = money;
		buyGoodsList = new ArrayList<>();
	}
	
	public void setMoney(int money) {
		this.money =money;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setBuyGoodsList(ArrayList<Goods> buyGoodsList) {
		this.buyGoodsList = buyGoodsList;
	}
	
	public ArrayList<Goods> getBuyGoodsList() {
		return buyGoodsList;
	}
	
	public void printShoppingBag() throws MyException{
		System.out.println("　(ShoppingBag)　限度額　" + money + "円");
		for(Goods goods: buyGoodsList) {
			if(goods == null) {
				throw new MyException("　(ShoppingBag2)　商品は入っていません。");
			}
			else {
				goods.printGoods();
				money = money - goods.getPrice();
				}
			}
	}
	
	public void setGoods(Goods goods) {
		buyGoodsList.add(goods);
	}
}

