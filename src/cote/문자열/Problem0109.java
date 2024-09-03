package src.cote.문자열;

import java.util.Scanner;

public class Problem0109 {
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		String number = "";
		for (char c : scanner.nextLine().toCharArray()) {
			if (Character.isDigit(c)) {
				number = number + c;
			}
		}
		System.out.println(Integer.parseInt(number));
	}

	public void solution1() {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();

		s = s.replaceAll("[^0-9]", "");

		System.out.println(Integer.parseInt(s));
	}

	public void solution2() {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();

		int answer = 0;
		for (char x : s.toCharArray()) {
			if (x >= 48 && x <= 57) {
				answer = answer * 10 + (x - 48);
			}
		}
	}
}
