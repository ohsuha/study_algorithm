package src.cote.문자열;

import java.util.Scanner;

public class Problem0109 {
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		char[] s = scanner.nextLine().toCharArray();

		String number = "";

		for (char c : s) {
			if(Character.isDigit(c)){
				number = number + c;
			}
		}

		System.out.println(Integer.parseInt(number));
	}
}
