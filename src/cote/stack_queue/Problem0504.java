package src.cote.stack_queue;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem0504 {
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		char[] chars = input.toCharArray();

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < chars.length; i++) {
			if ('0' < chars[i] && chars[i] <= '9') {
				list.add(chars[i] - 48);
			} else {
				switch (chars[i]) {
					case '+': {
						int result = list.get(list.size() - 2) + list.get(list.size() - 1);
						list.remove(list.size() - 1);
						list.remove(list.size() - 1);
						list.add(result);
						break;
					}
					case '-': {
						int result = list.get(list.size() - 2) - list.get(list.size() - 1);
						list.remove(list.size() - 1);
						list.remove(list.size() - 1);
						list.add(result);
						break;
					}
					case '*': {
						int result = list.get(list.size() - 2) * list.get(list.size() - 1);
						list.remove(list.size() - 1);
						list.remove(list.size() - 1);
						list.add(result);
						break;
					}
					case '/': {
						int result = list.get(list.size() - 2) / list.get(list.size() - 1);
						list.remove(list.size() - 1);
						list.remove(list.size() - 1);
						list.add(result);
						break;
					}
				}
			}
		}

		System.out.println(list.get(0));
	}
}
