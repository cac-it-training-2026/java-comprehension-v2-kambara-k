package q01_basic.question02;

/**
 * 会員を表すクラス。 氏名、年齢、ランクなどの会員情報を保持する。
 */
class Member {

	/** 会員氏名 */
	private String name;

	/** 年齢 */
	private int age;

	/** 会員ランク */
	private int rank;

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * @param rank
	 *            セットする rank
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	/**
	 * 空のMemberオブジェクトを生成する。 各フィールドはデフォルト値で初期化される。
	 */
	public Member() {

	}

	/**
	 * rankフィールドの値を1加算
	 */
	public void rankUp() {
		this.rank += 1;
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
