package exe5_1_3;

public class StartUp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		if (args.length != 3) {
			System.out.println("名前、年齢、給料の順に入力してください。");
		}
		else {
			EmployeeInfo ei = new EmployeeInfo(args[0],
					Integer.parseInt(args[1]),
					Integer.parseInt(args[2]));
			
			try {
				ei.displayInfo();
			}
			catch(MyException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
