package q03_extra;

/**
 * IConsoleReaderを継承し、MemberIdの入力を管理する。
 */
public class MemberIdReader implements IConsoleReader {

	/**
	 * @return 入力条件のエラーメッセージ
	 */
	@Override
	public String setErrorMsg() {
		return "1-9 の整数を入力してください";
	}

	/**
	 * @param inputString
	 * @return inputStringが適正な値であるときはtrue、そうでないときはfalseを返す。
	 */
	@Override
	public boolean isValid(String inputString) {
		if (inputString.matches("^[1-9]$")) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @return inputをint型へ変換する必要があるためtrueを返す。
	 */
	@Override
	public boolean isParseInt() {
		return true;
	}
}
