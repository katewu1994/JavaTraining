package exe3_2_4;

public class StartUp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
//		studentオブジェクトを生成する
		Student[] studentList = {new Student("Aki",23,43,54),
				new Student("Yui",34,65,32),
				new Student("Leo",45,75,95),
				new Student("Ayu",34,53,64),
				new Student("Sari",32,65,75)};
		
//		合計を初期化する
		int total = 0;
		
//		loop
		for (Student stu : studentList) {
			System.out.println(stu.getName() + " ==> " + stu.getMath() + " : "
					+ stu.getChemistry() + " : "+ stu.getPhysics() + " = " + stu.getTotal());//学生情報を表示する
			total = total + stu.getTotal();//合計を計算する
		}
		
//		平均を定義し、計算する
		float average = (float) total / studentList.length; 
		System.out.println("------------------------------------");
		
//		平均を表示する
		System.out.println("AVERAGE: " + average);
		
	}
}
