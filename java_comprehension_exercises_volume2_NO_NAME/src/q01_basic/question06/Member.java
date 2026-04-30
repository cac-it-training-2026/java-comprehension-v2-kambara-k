package q01_basic.question06;

/**
 * 会員を表すクラス。 AbstMemberクラスを継承し、ID、パスワード、年齢、ランクなどの会員情報を保持する。
 */
public class Member extends AbstMember {

	/** 会員ID */
	private int id;

	/** ログイン用パスワード */
	private String password;

	/** 年齢 */
	private int age;

	/** 会員ランク */
	private int rank;

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
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
	 * 指定された情報でMemberオブジェクトを生成する
	 *
	 * @param id
	 *            会員ID
	 * @param password
	 *            パスワード
	 * @param name
	 *            会員名
	 * @param age
	 *            年齢
	 * @param rank
	 *            会員ランク
	 */
	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	/**
	 * AbstMemberクラスからオーバーライドし、商品を購入する処理を行う。 出力
	 */
	@Override
	public void buyItem() {

	}

	/**
	 * 会員情報を標準出力に表示する。 ID、パスワード、氏名、年齢、ランクを整形して出力する。
	 */
	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("id：" + id);
		System.out.println("password：" + password);
		System.out.println("name：" + name);
		System.out.println("age：" + age);
		System.out.println("rank：" + rank);
		System.out.println("***************** ");
	}

}
