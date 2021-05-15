package exe3_2_3;

public class StartUp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
//		studentオブジェクトを生成する
		Student stu1 = new Student("YUI",77,87,93);
		
//		情報を表示する
		System.out.println(stu1.getName() + " ==> " + stu1.getMath() + " : "
		+ stu1.getChemistry() + " : "+ stu1.getPhysics() + " = " + stu1.getTotal());
	}

}
