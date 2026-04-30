package q02_advanced.question03;

import java.io.IOException;

/**
 * 会員情報の表示・ログイン処理を行う。
 */
public class SystemMain03 {

	public static void main(String[] args) {

		// 入力用インスタンスの生成
		ConsoleReader cr = new ConsoleReader();
		LoginService loginService = new LoginService(new MemberStorage());
		System.out.println("ログイン情報を入力してください");
		boolean isLogin = false;
		Member member = null;

		// ログイン成功まで繰り返し
		while (!isLogin) {
			int inputId = 0;

			// 対象ID入力
			try {
				inputId = cr.inputNumber();
			} catch (IOException e) {
				e.printStackTrace();
				continue;
			}

			String inputPassword = null;

			// 新パスワード入力
			try {
				inputPassword = cr.inputString();
			} catch (IOException e) {
				e.printStackTrace();
				continue;
			} catch (NumberFormatException e) {
				System.out.println("error!");
				e.printStackTrace();
				continue;
			}

			// ログイン処理
			member = loginService.doLogin(inputId, inputPassword);
			if (member == null) {
				System.out.println("ID またはパスワードが違っています。");
				System.out.println("再度入力してください。");
				continue;
			} else {
				System.out.println("ログインに成功しました");
				isLogin = true;
			}
		}

		// 会員情報表示
		System.out.println("ログインユーザ情報を表示します。");
		member.showMember();

	}

}
