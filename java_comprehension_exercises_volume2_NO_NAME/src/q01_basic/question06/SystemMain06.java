package q01_basic.question06;

import java.io.IOException;

import q01_basic.question05.Member;

public class SystemMain06 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		ConsoleReader cr = new ConsoleReader();
		int inputId = 0;
		String inputPassword = null;
		String name = "Miura Manabu";
		int age = 28;
		int rank = 2;

		System.out.println("---CREATE MEMBER DATA---");
		//TODO ここから実装する
		try {
			inputId = cr.inputNumber();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		try {
			inputPassword = cr.inputString();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("error!");
			e.printStackTrace();
			return;
		}

		Member member = new Member(inputId, inputPassword, name, age, rank);

		System.out.println("---SHOW MEMBER--- ");
		member.showMember();

	}

}
