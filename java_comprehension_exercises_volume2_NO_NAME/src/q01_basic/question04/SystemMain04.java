package q01_basic.question04;

public class SystemMain04 {

	public static void main(String[] args) {

		// 2つの要素を持つ会員配列を作成
		Member[] members = new Member[2];

		// 会員インスタンス生成後、配列に代入
		members[0] = new Member(1, "Password", "Miura Manabu", 28, 2);
		members[1] = new Member(2, "aaaAAA", "Sato Kensuke", 43, 1);

		// 会員情報の表示
		System.out.println("---SHOW ALL MEMBERS--- ");
		MemberManager.showAllMembers(members);
	}
}
