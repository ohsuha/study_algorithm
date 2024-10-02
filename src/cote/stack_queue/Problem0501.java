package src.cote.stack_queue;

import java.util.Scanner;

public class Problem0501 {
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] split = input.split("");
		String answer = "YES";
		int rc = 0;

		if (split[0].equals(")")) {
			rc = 123;
		} else if (split[split.length - 1].equals("(")) {
			rc = 123;
		} else {
			for (int i = 0; i < split.length; i++) {

				if (split[i].equals("(")) {
					rc++;
				} else if (split[i].equals(")")) {
					rc--;
				}
			}
		}

		if (rc != 0) {
			answer = "NO";
		}
		System.out.println(answer);
	}
}
