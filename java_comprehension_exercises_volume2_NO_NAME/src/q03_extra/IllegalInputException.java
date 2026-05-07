package q03_extra;

public class IllegalInputException extends Exception {
	/**
	 * 空のMemberオブジェクトを生成する。 各フィールドはデフォルト値で初期化される。
	 */
	public IllegalInputException() {

	}

	/**
	 * 指定された情報で親クラスコンストラクタを呼び出す
	 *
	 * @param message
	 * 
	 * @param cause
	 * 
	 * @param enableSupperession
	 * 
	 * @param writableStackTrace
	 * 
	 */
	public IllegalInputException(String message, Throwable cause, boolean enableSupperession,
			boolean writableStackTrace) {
		super(message, cause, enableSupperession, writableStackTrace);

	}

	public IllegalInputException(String message, Throwable cause) {
		super(message, cause);
	}

	public IllegalInputException(String message) {
		super(message);
	}

	public IllegalInputException(Throwable cause) {
		super(cause);
	}
}
