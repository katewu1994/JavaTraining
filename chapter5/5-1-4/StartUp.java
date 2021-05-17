package exe5_1_4;

public class StartUp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Manager mgr = new Manager();
		
		if(args.length != 1) {
			System.out.println("Usage: java StartUp <従業員番号>");
		}else {
			try {
				int id = Integer.parseInt(args[0]);
				Employee emp = mgr.findEmployee(id);
				emp.print();
			}
			catch(NotFoundException e) {
				System.out.println(e.getMessage());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
