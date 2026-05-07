package q01_basic.question01;

/**
 * 会員を表すクラス。 氏名、年齢、ランクなどの会員情報を保持する。
 */
class Member {
	/** 会員氏名 */
	String name;

	/** 年齢 */
	int age;

	/** 会員ランク */
	int rank;

	/**
	 * 空のMemberオブジェクトを生成する。 各フィールドはデフォルト値で初期化される。
	 */
	public Member() {

	}

	/**
	 * 会員情報を標準出力に表示する。氏名、年齢、ランクを整形して出力する。
	 */
	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("name：" + name);
		System.out.println("age：" + age);
		System.out.println("rank：" + rank);
		System.out.println("***************** ");
	}

}
