package exe4_2_3;

public class MobilePhone extends BasePhone {
	
	
//	コンストラクタ（引数一つ）
	public MobilePhone(String name) {
		super(name);
		System.out.println(name + "さんの携帯電話です。");
	}

//	Phoneインタフェースからオーバーライドしたcall()メソッド
	public void call() {
		System.out.println(name + "さんの携帯電話が鳴ります。");
	}
	
}
