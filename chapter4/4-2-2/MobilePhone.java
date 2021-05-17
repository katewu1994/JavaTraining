package exe4_2_2;

//  MobilePhoneクラスを定義する
class MobilePhone implements Phone{
	
//	メンバ変数
	private String name;
	
//	コンストラクタ
	public MobilePhone(String name) {
		this.name = name;
		System.out.println(name + "さんの携帯電話です");
	}
	
//	callメソッドをオーバーライドする
	public void call() {
		System.out.println(name + "さんの携帯が鳴ります。");
	}
	
//	stopメソッドをオーバーライドする
	public void stop() {
		System.out.println(name + "さんの携帯が切れます。");
	}
	

}
