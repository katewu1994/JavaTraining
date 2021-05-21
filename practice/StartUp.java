package s2_3;

public class StartUp {

	public static void main(String[] args) {
		
		Shop2 tokyoShop = new Shop2("東京店","1234-5678");
		
		tokyoShop.addGoods("water", 1200);
		tokyoShop.addGoods("apple", 350);
		tokyoShop.addGoods("hamburger", 890);
		tokyoShop.addGoods("bread", 2000);
		tokyoShop.addGoods("sandwich", 120);
		
		Customer customer = new Customer("Leo");
		customer.createBag(2000);
		
		System.out.println("===========");
		tokyoShop.printShop();
		System.out.println("===========");
		
		System.out.println();
		customer.buyGoods(tokyoShop, "sandwich");
		
		System.out.println();
		customer.buyGoods(tokyoShop, "water");
		
		System.out.println();
		customer.buyGoods(tokyoShop, "apple");
		
		System.out.println();
		customer.buyGoods(tokyoShop, "bread");
		
		System.out.println();
		customer.buyGoods(tokyoShop, "coffee");
		
		System.out.println();
		customer.printCustomer();
	}

}
