package q02_advanced.question02;

/**
 * クーポンを表すクラス。ID、割引率、説明などのクーポン情報を保持する。
 */
public class Coupon {

	/** 会員ID */
	private int id;

	/** 割引率 */
	private double discountRate;

	/** 説明 */
	private String discription;

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
	 * @return discountRate
	 */
	public double getDiscountRate() {
		return discountRate;
	}

	/**
	 * @param discountRate
	 *            セットする discountRate
	 */
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	/**
	 * @return discription
	 */
	public String getDiscription() {
		return discription;
	}

	/**
	 * @param discription
	 *            セットする discription
	 */
	public void setDiscription(String discription) {
		this.discription = discription;
	}

	/**
	 * 空のMemberオブジェクトを生成する。 各フィールドはデフォルト値で初期化される。
	 */
	public Coupon() {

	}

	/**
	 * 指定された情報でMemberオブジェクトを生成する。
	 * 
	 * @param id
	 *            会員ID
	 * @param discountRate
	 *            割引率
	 * @param discription
	 *            説明
	 */
	public Coupon(int id, double discountRate, String discription) {
		this.id = id;
		this.discountRate = discountRate;
		this.discription = discription;
	}

	/**
	 * 会員情報を文字列として返す。 id、discountRate、discriptionを含む。
	 */
	public String toString() {
		String str = "Coupon [id=" + id + ", discountRate=" + discountRate + ", discription="
				+ discription + "]";

		return str;
	}

	/**
	 * 指定された情報でCouponオブジェクトを生成し、そのオブジェクトを返す。
	 */
	public static Coupon getInstance(int id, double discountRate, String discription) {
		Coupon coupon = new Coupon(id, discountRate, discription);
		return coupon;
	}

}
