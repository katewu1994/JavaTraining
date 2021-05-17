package exe4_1_1;

//Employeeクラスを継承したManagerクラスを継承する
class Manager extends Employee {
	
//	メンバ変数
	int staff;
	
//	コントラクタ
	Manager(int pStaff){
		staff = pStaff;
	}
	
//	displayメソッドを定義する
	void display() {
		System.out.println("STAFF:" + staff);
	}
	
}
