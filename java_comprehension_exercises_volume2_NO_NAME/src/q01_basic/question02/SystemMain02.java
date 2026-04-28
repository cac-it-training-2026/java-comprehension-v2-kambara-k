package q01_basic.question02;

public class SystemMain02 {

	public static void main(String[] args) {

		Member member = new Member();
		member.setAge(30);
		member.setName("Miura Manabu");
		member.setRank(1);
		System.out.println("---SHOW DATA---");
		member.showMember();
		System.out.println(">>>RANK UP>>> ");
		System.out.println("---GET RANK--- ");
		member.rankUp();
		int newRank = member.getRank();
		System.out.println("newRank" + newRank);

	}
}
