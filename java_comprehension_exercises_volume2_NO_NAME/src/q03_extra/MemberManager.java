package q03_extra;

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
	 * @param inputId
	 * @param list
	 */
	public static void ShowCreateUser(List<Member> members, int inputId) {
		for (Member member : members) {
			if (member.getId() == inputId) {
				member.showMember();
			}
		}
		System.out.println("******************");
	}
}
