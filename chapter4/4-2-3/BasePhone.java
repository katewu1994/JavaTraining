package exe4_2_3;

public abstract class BasePhone implements Phone{
	
//	メンバ変数
	protected String name;
	
//	コンストラクタ（引数一つ）
	public BasePhone(String name) {
		this.name = name;
	}
	
//	phoneインタフェースからオーバーライドしたstopメソッド
	public void stop() {
		System.out.println(name + "さんの電話が切れます。");
	}
}
