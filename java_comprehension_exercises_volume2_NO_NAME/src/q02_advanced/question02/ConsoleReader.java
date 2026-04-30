package q02_advanced.question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * 文字列の標準入力。
	 * 
	 * @return 入力文字列
	 * @throws IOException
	 */
	public String inputString() throws IOException {
		System.out.print("input password>>");
		String inputPassword = br.readLine();
		return inputPassword;
	}

	/**
	 * 整数の標準入力。
	 * 
	 * @return 入力整数
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public int inputNumber() throws IOException, NumberFormatException {
		System.out.print("input id>>");
		String inputIdStr = br.readLine();
		return Integer.parseInt(inputIdStr);

	}
}
