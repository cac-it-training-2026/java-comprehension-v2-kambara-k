package q03_extra;

import java.text.ParseException;

/**
 * MemberStorageにアクセスし、ユーザ登録処理を行う
 */
class CreateUserService {
	/**
	 * memberStorage Memberクラスのリスト一覧
	 */
	private MemberStorage memberStorage;

	/**
	 * 指定された情報でMemberオブジェクトを生成
	 * 
	 * @param memberStorage
	 *            Memberクラスのリスト一覧
	 */
	public CreateUserService(MemberStorage memberStorage) {
		this.memberStorage = memberStorage;
	}

	/**
	 * 会員情報の中から引数で取得した id がフィールドの値と一致するユーザーが存在するか確認<br>
	 * し、重複チェックを行いつつ登録処理を行うメソッド
	 */
	public boolean execure(int id, String password, String name, String birthday)
			throws IllegalInputException, ParseException {

		for (Member member : memberStorage.getMembers()) {
			if (member.getId() == id) {
				String errorMsg = "ID が重複しています。再度入力してください。";
				throw new IllegalInputException(errorMsg);
			}
		}
		memberStorage.getMembers().add(Member.getInstance(id, password, name, birthday));
		return true;
	}
}
