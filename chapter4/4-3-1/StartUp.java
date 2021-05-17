package exe4_3_1;

public class StartUp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
//		Bookクラスのオブジェクト生成
		Book book = new Book("Java Programing","Java Ichiro");
		
//		Libraryクラスのオブジェクト生成
		Library lib = new Library("Tokyo","03-1234-5678",book);
		
//		display()メソッドの呼び出し
		lib.display();
	}

}
