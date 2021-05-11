package exe2_2_5;

public class Profile {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//変数を定義し初期化する
		String name = "Yamazaki Yui";
		String company = "FUJITSU";
		int workingyear = 5;
		
		//氏名と会社名を表示する
		System.out.println("My name is " + name + ".");
		System.out.println("I am working at" + company + ".");
		
		//所属年数を判定し、メッセージを表示する
		if (workingyear < 2 && workingyear > 0) {
			System.out.println("I am a new employee.");            //　所属年数1年（0年以上2年未満）　→　私は新入社員です。
			
		}
		else if (workingyear < 6 && workingyear >= 2) {
			System.out.println("I am a young employee.");          //　所属年数2年以上6年未満　→　私は若者社員です。
		}
		else if (workingyear < 15 && workingyear >= 6) {
			System.out.println("I am a mid-level employee.");      //　所属年数6年以上15年未満　→　私は中堅社員です。
		}
		else if (workingyear >= 15) {
			System.out.println("I am a veteran employee.");        //　所属年数15以上　→　私はベテラン社員です。
		}
		else {
			System.out.println("The working year is wrong.");      //　所属年数上記以外　→　所属年数が間違っています。
		}
		

	}

}
