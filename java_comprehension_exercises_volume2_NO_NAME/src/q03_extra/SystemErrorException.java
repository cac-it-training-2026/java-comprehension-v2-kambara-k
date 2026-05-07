package q03_extra;

public class SystemErrorException extends Exception {

	/**
	 * 空のMemberオブジェクトを生成する。 各フィールドはデフォルト値で初期化される。
	 */
	public SystemErrorException() {

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
	public SystemErrorException(String message, Throwable cause, boolean enableSupperession,
			boolean writableStackTrace) {
		super(message, cause, enableSupperession, writableStackTrace);

	}

	public SystemErrorException(String message, Throwable cause) {
		super(message, cause);
	}

	public SystemErrorException(String message) {
		super(message);
	}

	public SystemErrorException(Throwable cause) {
		super(cause);
	}
}
