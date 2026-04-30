package q02_advanced.question01;

/**
 * 会員登録及び会員表示を行う
 */
public class SystemMain01 {

	public static void main(String[] args) {

		System.out.println("===会員情報を表示します===");

		// 会員オブジェクト生成
		Member member1 = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);
		Member member2 = new Member(2, "aaaAAA", "Sato Kensuke", 43, 1);

		// 会員情報表示
		member1.showMember();
		member2.showMember();

	}
}
