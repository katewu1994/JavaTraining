package exe2_4_4;

public class MaxMin {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//int型の配列を生成し、任意の数値を初期化
		int[] nums = { 33,64,34,44,63,35,42,74,25,86 };
		
		//最大値と最小値の変数を宣言し、初期化する
		int max = nums[0];
		int min = nums[0];
		
		//配列要素の中から、最大値と最小値を求める
		for(int i = 1; i < nums.length; i ++) {
			if (nums[i] > max) {
				max = nums[i];
			}
			else if(nums[i] < min) {
				min = nums[i];
			}
		}
		
		//最大値と最小値を表示する
		System.out.println("MAX : " + max );
		System.out.println("MIN : " + min );

	}

}
