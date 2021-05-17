package exe4_3_2;

public class Library {
	
//	メンバ変数
	private String address;
	private String phone;
	private Book book;
	
//	コンストラクタ
	public Library(String address, String phone, Book book) {
		this.address = address;
		this.phone = phone;
		this.book = book;
	}
	
//	メソッドを定義する
	public void display() {
		System.out.println("---図書館の情報---");
		System.out.println("ADDRESS: " + address);
		System.out.println("PHONE: " + phone);
		
		System.out.println("---本の情報---");
		book.display();
	}
}
