package src.cote.문자열;

import java.util.Scanner;

public class Problem0106 {

	public void algorithm() {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		char[] chars = string.toCharArray();
		String result = "";

		for (char c : chars) {
			if (!result.contains(String.valueOf(c))) {
				result += c;
			}
		}
		System.out.println(result);
	}
}
