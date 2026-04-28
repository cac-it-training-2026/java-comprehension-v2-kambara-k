package q02_advanced.question01;

public class Coupon extends Member {
	private int id;
	private double discountRate;
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

	public Coupon() {
	}

	/**
	 * @param id
	 * @param discountRate
	 * @param discription
	 */
	public Coupon(int id, double discountRate, String discription) {
		this.id = id;
		this.discountRate = discountRate;
		this.discription = discription;
	}

	public String toString() {
		String str = "Coupon [id=" + id + ", discountRate=" + discountRate + ", discription="
				+ discription + "]";

		return str;
	}

}
