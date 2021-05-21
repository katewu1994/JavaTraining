package s2_3;

public class Customer {
	
	private String customerName;
	private ShoppingBag shoppingBag;
	
	public Customer() {}
	
	public Customer(String customerName) {
		this.customerName = customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void createBag(int money) {
		shoppingBag = new ShoppingBag2(money);
	}
	
	public void setShoppingBag(ShoppingBag shoppingBag) {
		this.shoppingBag = shoppingBag;
	}
	
	public ShoppingBag getShoppingBag() {
		return shoppingBag;
	}
	
	public void printCustomer() {
		System.out.println("(Customer)　" + customerName + "の買物かご");
		try {
			shoppingBag.printShoppingBag();
		}catch(MyException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void queryShop(Shop shop) {
		System.out.println("(Customer)　" + customerName + "「この店は何店ですか？」");
		shop.printShop();
	}
	
	public void buyGoods(Shop shop, String goodsName) {
		System.out.println("(Customer)　" + customerName + "「" + goodsName +"をください。」");
		shop.saleGoods(goodsName, shoppingBag);
	}
	
}
