package exe3_2_5;

public class StartUp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
//		現在のアカウントを確認する
		System.out.println("今日の利率：" + Account.getInterest());
		
//		アカウントを開設する
		System.out.println("以下のアカウントを開設します。");
		
		Account account1 = new Account("Aoi");
		Account account2 = new Account("Leo",2000);
		
//		情報を表示する
		System.out.println("--------------------");
		account1.print();
		System.out.println("--------------------");
		account2.print();
		System.out.println("--------------------");
		
//		利率計算
		System.out.println("一年後の残高は？");
		account1.interestAt();
		account2.interestAt();

//		情報を表示する
		System.out.println("--------------------");
		account1.print();
		System.out.println("--------------------");
		account2.print();
		System.out.println("--------------------");
				
	}
}
