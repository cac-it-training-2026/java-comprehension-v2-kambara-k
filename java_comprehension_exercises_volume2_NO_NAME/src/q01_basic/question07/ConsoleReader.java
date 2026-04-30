package q01_basic.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 標準入力を制御するクラス
 */
class ConsoleReader {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * 整数の標準入力。
	 * 
	 * @return 入力整数
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public int inputNumber() throws IOException, NumberFormatException {

		System.out.print("input number>>");
		try {
			String inputIdStr = br.readLine();
			return Integer.parseInt(inputIdStr);
		} catch (NumberFormatException e) {
			System.out.println("error!");
			e.printStackTrace();
			throw e;
		}
	}
}
