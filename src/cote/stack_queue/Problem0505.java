package src.cote.stack_queue;

import java.util.Scanner;

public class Problem0505 {
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		char[] chars = input.toCharArray();

		int lineCnt = 0;
		int line = 0;
		int sum = 0;
		char before = 'A';
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '(') {
				line++;
				lineCnt++;
			}

			if (before == '(' && chars[i] == ')') {
				line--;
				sum += line;
				lineCnt--;
			}

			if (before == ')' && chars[i] == ')') {
				line--;
			}

			before = chars[i];
		}

		System.out.println(sum + lineCnt);
	}
}
