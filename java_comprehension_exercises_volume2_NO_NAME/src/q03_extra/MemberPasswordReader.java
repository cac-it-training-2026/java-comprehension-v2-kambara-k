package q03_extra;

/**
 * IConsoleReaderを継承し、MemberPasswordの入力を管理する
 */
public class MemberPasswordReader implements IConsoleReader {

	/**
	 * @return 入力条件のエラーメッセージ
	 */
	@Override
	public String setErrorMsg() {
		return "8 文字以上 16 文字以内の半角英数字で入力してください";
	}

	/**
	 * @param inputString
	 * @return inputStringが適正な値であるときはtrue、そうでないときはfalseを返す。
	 */
	@Override
	public boolean isValid(String inputString) {
		if (inputString.matches("^[A-Za-z0-9]{8,16}$")) {
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
