package q01_basic.question05;

/**
 * 非会員を表すクラス。 AbstMemberクラスを継承し、ID、パスワード、氏名、年齢、ランクなどの会員情報を保持する。
 */
public class NonMember extends AbstMember {

	/**
	 * 指定された情報でMemberオブジェクトを生成する
	 *
	 * @param name
	 *            会員名
	 */
	public NonMember(String name) {
		this.name = name;
	}

	/**
	 * 商品を購入する処理を行う。 定価購入するメッセージを標準出力に表示する。
	 */
	public void buyItem() {
		System.out.println(name + " purchased the item at a fixed price");
	}

	/**
	 * 非会員情報を標準出力に表示する。 氏名を整形して出力する。
	 */
	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println(name + " is a non-member");
		System.out.println("***************** ");
	}

}
