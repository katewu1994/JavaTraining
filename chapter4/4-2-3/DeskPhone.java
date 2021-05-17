package exe4_2_3;

public class DeskPhone extends BasePhone {
	
//	コンストラクタ（引数一つ）
	public DeskPhone(String name) {
		super(name);
		System.out.println(name + "卓上電話です。");
	}
	
//	Phoneインタフェースからオーバーライドしたcall()メソッド
	public void call() {
		System.out.println(name + "さんの卓上電話が鳴ります。");
	}
}
