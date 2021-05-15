package exe3_2_1;

class Employee {
	
	//メンバ変数を定義する
	private int id;
	private String name;
	private String section;
	private String phone;
	
	//コンストラクタを定義する
	public Employee(int pId, String pName, String pSection, String pPhone) {
		id = pId;
		name = pName;
		section = pSection;
		phone = pPhone;
	}
	
	//メソッドを定義する
	//表示メソッド
	public void print() {
		System.out.println("ID:" + id);
		System.out.println("NAME:" + name);
		System.out.println("SECTION:" + section);
		System.out.println("PHONE:" + phone);
	}
	
}
