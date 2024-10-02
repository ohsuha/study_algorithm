package src.cote.stack_queue;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem0502 {
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] strings = input.split("");

		int count = 0;
		String answer = "";

		for (int i = 0; i < strings.length; i++) {
			if (strings[i].equals("(")) {
				count++;
				continue;
			} else if (strings[i].equals(")")) {
				count--;
				continue;
			}

			if (count == 0) {
				answer += strings[i];
			}
		}

		System.out.println(answer);
	}
}
