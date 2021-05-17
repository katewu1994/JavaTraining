package exe5_1_2;

public class MyThrows {
	
//	メンバ変数を定義する
	private int[] number = {10,20,30,40};
	
//	メソッドを定義する
//	文字列の数値変換
	public int convertNumber(String str) throws NumberFormatException{
		int index = Integer.parseInt(str);
		return index;
	}
	
//	情報の表示
	public void exFunc(int index) throws ArrayIndexOutOfBoundsException{
		System.out.println("要素番号：" + index + "の値は" + number[index] +"です。");
	}
}
