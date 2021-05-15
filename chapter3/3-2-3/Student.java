package exe3_2_3;

class Student {
	
//	メンバ変数
	private String name;
	private int math;
	private int chemistry;
	private int physics;
	
//	コンストラクタ
	public Student(String pName,int pMath, int pChemistry, int pPhysics) {
		name = pName;
		math = pMath;
		chemistry = pChemistry;
		physics = pPhysics;
	}
	
//	メンバ変数の値取得メソッド
	public String getName() {
		return name;
	}
	
	public int getMath() {
		return math;
	}
	
	public int getChemistry() {
		return chemistry;
	}
	
	public int getPhysics() {
		return physics;
	}
	
//	合計値取得メソッド
	public int getTotal() {
		return math + chemistry + physics;
	}
	
}
