package q01_basic.question03;

public class SystemMain03 {

	public static void main(String[] args) {

		// 会員インスタンス生成
		Member member1 = new Member();
		Member member2 = new Member("Miura Manabu", 28, 2);

		// 会員情報の表示
		System.out.println("---SHOW DATA(NULL)---");
		member1.showMember();
		System.out.println("---SHOW DATA(Miura)---");
		member2.showMember();

	}

}
