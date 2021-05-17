package exe4_1_2;

//Employeeクラスを継承したManagerクラスを継承する
class Manager extends Employee {
	
//	メンバ変数
	private int staff;
	
//	コントラクタ
	public Manager(int staff){
		this.staff = staff;
	}
	
	public Manager(int id, String name, String section, String phone, int staff) {
		super(id, name, section, phone);
		this.staff = staff;
	}
	
//	Employeeクラスのprint()メソッドをオーバーライドする
	public void print() {
		super.print();
		System.out.println("STAFF:" + staff);
	}
	
}
