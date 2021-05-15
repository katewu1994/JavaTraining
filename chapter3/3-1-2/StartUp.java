package exe3_1_2;

public class StartUp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//Employeeオブジェクトを生成する
		Employee emp = new Employee();
		
		//Employeeオブジェクトの属性にセンターを使用して値を設定する
		emp.setId(381065);
		emp.setName("YAMAZAKI AOI");
		emp.setSection("システム開発部");
		emp.setPhone("1234-5678");
		
		//print() メソッドを呼び出す
		emp.print();
	}

}
