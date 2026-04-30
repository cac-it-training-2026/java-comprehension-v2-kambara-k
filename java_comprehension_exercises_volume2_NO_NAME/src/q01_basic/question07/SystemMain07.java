package q01_basic.question07;

import java.io.IOException;

/**
 * 数値リストを操作し、合計計算・変換・削除を行う
 */
public class SystemMain07 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		NumberList numberList = new NumberList();
		System.out.println("1-任意の整数をListに代入します");
		System.out.print("input number>>");
		int limit = 0;

		// 入力値取得
		ConsoleReader cr = new ConsoleReader();
		limit = cr.inputNumber();

		System.out.println("****************");
		System.out.println("Listの合計を計算します");
		int sum = 0;

		// 1からlimitまでの数値をリストに追加
		numberList.addFromOneTo(limit);
		System.out.println(numberList.getNumbers());

		// リスト内数値の合計を計算して表示
		sum = numberList.calcSumOfList();
		System.out.println("1から" + limit + "までの合計は" + sum + "です。");

		// リスト内数値をそれぞれ2倍して表示
		System.out.println("****************");
		System.out.println("Listの各要素を2倍します");
		numberList.doubleListEachValue();
		System.out.println(numberList.getNumbers());

		// リストの前半分を削除し表示
		System.out.println("****************");
		System.out.println("Listの前半分のインデックスの要素を削除します");
		numberList.removeIndexOfFirstHalf();
		System.out.println(numberList.getNumbers());
	}

}
