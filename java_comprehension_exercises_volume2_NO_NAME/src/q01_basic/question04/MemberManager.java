package q01_basic.question04;

/**
 * Member型配列を扱うクラス
 */
public class MemberManager {

	/**
	 * インスタンス化の禁止
	 */
	private MemberManager() {
	}

	/**
	 * 配列にある全ての会員情報を標準出力に表示する。
	 */
	public static void showAllMembers(Member[] members) {
		for (Member member : members) {
			member.showMember();
		}
	}

}
