package q01_basic.question02;

public class SystemMain02 {

	public static void main(String[] args) {

		// 会員インスタンス生成
		Member member = new Member();

		// サンプルデータ設定
		member.setAge(30);
		member.setName("Miura Manabu");
		member.setRank(1);

		// 会員情報の表示
		System.out.println("---SHOW DATA---");
		member.showMember();

		// ランクを1加算し更新
		System.out.println(">>>RANK UP>>> ");
		System.out.println("---GET RANK--- ");
		member.rankUp();
		int newRank = member.getRank();

		// 更新後のランクを表示
		System.out.println("newRank" + newRank);

	}
}
