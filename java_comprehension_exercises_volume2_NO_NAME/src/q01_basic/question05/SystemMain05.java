package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		// 2つの要素を持つ会員配列を作成
		AbstMember[] members = new AbstMember[2];

		// 会員インスタンス生成後、配列に代入
		NonMember nonmember = new NonMember("Sato Kensuke");
		members[0] = nonmember;
		Member member = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);
		members[1] = member;

		// 会員情報の表示
		MemberManager.showAllMembers(members);

		// 購入時メッセージの表示
		System.out.println("---BUY ITEM---");
		nonmember.buyItem();
		member.buyItem();

	}

}
