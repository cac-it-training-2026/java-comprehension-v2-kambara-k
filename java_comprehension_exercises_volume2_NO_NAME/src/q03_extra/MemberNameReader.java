package q03_extra;

/**
 * IConsoleReaderを継承し、MemberNameの入力を管理する
 */
public class MemberNameReader implements IConsoleReader {

	/**
	 * @return 入力条件のエラーメッセージ
	 */
	@Override
	public String setErrorMsg() {
		return "名前は半角英字 16 文字以内で入力してください";
	}

	/**
	 * @param inputString
	 * @return inputStringが適正な値であるときはtrue、そうでないときはfalseを返す。
	 */
	@Override
	public boolean isValid(String inputString) {
		if (inputString.matches("^[A-Za-z ]{1,16}$")) {
			return true;
		} else {
			setErrorMsg();
			return isParseInt();
		}
	}

	/**
	 * @return inputをint型へ変換しないためfalseを返す。
	 */
	@Override
	public boolean isParseInt() {
		return false;
	}

}
