package exe2_3_4;

public class TriangleOp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int mid = 5;
		
		for(int i = 0; i < 6; i ++) {
			for(int j = 0; j < 11; j ++) {
				if (j < mid - i || j> mid + i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
			
	}

}
