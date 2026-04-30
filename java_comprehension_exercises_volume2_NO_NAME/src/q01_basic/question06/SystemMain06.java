package q01_basic.question06;

import java.io.IOException;

/**
 * コンソールから会員情報を入力し、Memberを生成して表示する
 */
public class SystemMain06 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 入力用インスタンスの生成
		ConsoleReader cr = new ConsoleReader();

		// 会員情報
		int inputId = 0;
		String inputPassword = null;
		String name = "Miura Manabu";
		int age = 28;
		int rank = 2;

		System.out.println("---CREATE MEMBER DATA---");

		// 会員IDの入力
		try {
			inputId = cr.inputNumber();
		} catch (IOException e) {
			e.printStackTrace();
			return; // 入力エラー時に処理を終了させる
		}

		// パスワードの入力
		try {
			inputPassword = cr.inputString();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("error!");
			e.printStackTrace();
			return; // 入力エラー時に処理を終了させる
		}

		// 会員オブジェクト生成
		Member member = new Member(inputId, inputPassword, name, age, rank);

		// 会員情報表示
		System.out.println("---SHOW MEMBER--- ");
		member.showMember();

	}

}
