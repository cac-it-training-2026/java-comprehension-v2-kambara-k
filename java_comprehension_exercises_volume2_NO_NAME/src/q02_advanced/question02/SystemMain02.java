package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 会員情報の表示・パスワード更新処理を行う。
 */
public class SystemMain02 {

	public static void main(String[] args) {

		// 会員データ作成
		List<Member> members = new ArrayList<>();
		members.add(Member.getInstance(1, "pass1", "山田太郎", 30, 2));
		members.add(Member.getInstance(2, "pass2", "佐藤花子", 25, 3));

		// 全会員情報表示
		System.out.println("===会員情報を表示します===");
		MemberManager.showAllMembers(members);

		System.out.println("===パスワードを変更します===");

		// 入力用インスタンスの生成
		ConsoleReader cr = new ConsoleReader();
		int targetId = 0;

		// 対象ID入力
		try {
			targetId = cr.inputNumber();
		} catch (IOException e) {
			e.printStackTrace();
			return; // 入力エラー時に処理を終了させる
		}

		String newPassword = null;

		// 新パスワード入力
		try {
			newPassword = cr.inputString();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("error!");
			e.printStackTrace();
			return; // 入力エラー時に処理を終了させる
		}

		// 入力情報を元にパスワードを更新
		MemberManager.updatePassword(members, targetId, newPassword);

		// 全会員情報表示
		System.out.println("---SHOW MEMBER--- ");
		MemberManager.showAllMembers(members);
	}
}
