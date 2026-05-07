package q03_extra;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * IConsoleReaderを継承し、MemberBirthdayの入力を管理する
 */
public class MemberBirthdayReader implements IConsoleReader {

	@Override
	public String setErrorMsg() {
		return "正しい形式(yyyy/MM/dd)で入力してください";
	}

	/**
	 * @param inputString
	 * @return inputStringが適正な値であるときはtrue、そうでないときはfalseを返す。
	 */
	@Override
	public boolean isValid(String inputString) {

		// 日付の形式を指定して、オブジェクトを生成
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		// 厳密な日付チェックを行うように設定
		sdf.setLenient(false);

		try {
			// 文字列型の日付情報を基にDate型の日付情報を作成かつチェック
			sdf.parse(inputString.trim());
			return true;
		} catch (ParseException e) {
			return false;
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
