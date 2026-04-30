package q02_advanced.question03;

import java.util.List;

/**
 * MemberStorageにアクセスし、ログイン処理を行う
 */
class LoginService {

	/**
	 * memberStorage Memberクラスのリスト一覧
	 */
	private MemberStorage memberStorage;

	/**
	 * 指定されたMemberクラスのリスト一覧でLoginServiceオブジェクトを生成する。
	 *
	 * @param id
	 *            会員ID
	 */
	public LoginService(MemberStorage memberStorage) {
		this.memberStorage = memberStorage;
	}

	/**
	 * 入力された情報を元にログイン処理を行い、IdとPasswordが一致していれば当該memmberを返す。
	 */
	public Member doLogin(int inputId, String inputPassword) {
		List<Member> members = memberStorage.getMembers();

		for (Member member : members) {
			if ((member.getId() == inputId) &&
					(member.getPassword().equals(inputPassword))) {
				return member;
			}
		}
		return null;
	}
}
