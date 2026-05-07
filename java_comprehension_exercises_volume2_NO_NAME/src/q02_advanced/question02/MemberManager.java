package q02_advanced.question02;

import java.util.List;

/**
 * Member型リストを扱うクラス
 */
public class MemberManager {

	/**
	 * インスタンス化の禁止
	 */
	private MemberManager() {
	}

	/**
	 * Memberリストにある全ての会員情報を標準出力に表示する。
	 */
	public static void showAllMembers(List<Member> members) {
		for (Member member : members) {
			member.showMember();
		}
	}

	/**
	 * 登録済のパスワードを変更する。
	 */
	public static void updatePassword(List<Member> members, int targetId, String newPassword) {
		boolean found = false;
		for (Member member : members) {
			if (member.getId() == targetId) {
				member.setPassword(newPassword);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("該当者はいませんでした。");
		}
	}
}
