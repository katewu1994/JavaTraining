package exe5_1_3;

public class EmployeeInfo {
	
//	メンバ変数を定義する
	private String name;
	private int age;
	private int salary;
	
//	コンストラクタ
	public EmployeeInfo(String name, int age, int salary) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
//	displayInfo()メソッドを定義する
	public void displayInfo() throws MyException{
		if (age < 0 || salary < 0) {
			throw new MyException("年齢、または給料にマイナスの値が入力されました。");
		}
		
		System.out.println("NAME: " + name);
		System.out.println("AGE: " + age);
		System.out.println("SALARY: " + salary + " YEN");
	}
}
