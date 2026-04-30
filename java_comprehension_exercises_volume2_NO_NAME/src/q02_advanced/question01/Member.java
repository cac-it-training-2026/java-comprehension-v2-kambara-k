package q02_advanced.question01;

import java.util.ArrayList;
import java.util.List;

/**
 * 会員を表すクラス。ID、パスワード、氏名、年齢、ランクなどの会員情報を保持する。
 */
public class Member {
	/** 会員ID */
	private int id;

	/** ログイン用パスワード */
	private String password;

	/** 氏名 */
	private String name;

	/** 年齢 */
	private int age;

	/** 会員ランク */
	private int rank;

	List<Coupon> coupons;

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
	 * @return coupons
	 */
	public List<Coupon> getCoupons() {
		return coupons;
	}

	/**
	 * @param coupons
	 *            セットする coupons
	 */
	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
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
		this.coupons = new ArrayList<>();
		Coupon coupon1 = new Coupon(1, 0.5, "最初の特典");
		Coupon coupon2 = new Coupon(2, 0.25, "今月の特典");
		coupons.add(coupon1);
		coupons.add(coupon2);
	}

	/**
	 * 会員情報を文字列として返す。 id、password、name、age、rank、couponsを含む。
	 */
	public String toString() {
		String str = "Member [id=" + id + ", password=" + password + ", name=" + name
				+ ", age=" + age + ", rank=" + rank + ", coupons=" + coupons;
		return str;
	}

	/**
	 * 会員情報を標準出力に表示する。 内部的にtoString()の結果を出力する。
	 */
	public void showMember() {
		System.out.println(toString());
		System.out.println("******************");
	}
}
