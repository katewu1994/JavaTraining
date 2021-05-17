package exe4_3_2;

public class Book {
	
//	メンバ変数
	private String title;
	private String author;
	
//	コンストラクタ
	public Book(String title, String author) {
		this.title =title;
		this.author = author;
	}
	
//	タイトルと著者を表示
	public void display() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
	}
	
//	タイトルをセットする
	public void setTitle(String title) {
		this.title = title;
	}
	
//	タイトルを取得する
	public String getTitle() {
		return title;
	}
	
//	著者名をセットする
	public void SetAuthor(String author) {
		this.author =author;
	}
	
//	著者名を取得する
	public String getAuthor() {
		return author;
	}

}
