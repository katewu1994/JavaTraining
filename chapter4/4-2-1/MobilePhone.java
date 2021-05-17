package exe4_2_1;

class MobilePhone extends Phone{
	
	public void call(String number) {
		if(number != null) {
			System.out.println("携帯電話で通話中です。");
		}
		else {
			System.out.println("おつなぎできません。");
		}
	}
	
	public void shot() {
		System.out.println("写真を撮りました。");
	}
}
