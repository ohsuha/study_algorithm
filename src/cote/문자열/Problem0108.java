package src.cote.문자열;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem0108 {
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();

		char[] chars = s.toCharArray();

		ArrayList list = new ArrayList();
		for (char c : chars) {
			if (Character.isLetter(c)) {
				list.add(Character.toLowerCase(c));
			}
		}

		int lt = 0;
		int rt = list.size() - 1;
		String result = "NO";

		while (lt < rt) {
			if (list.get(lt) == list.get(rt)) {
				result = "YES";
				lt++;
				rt--;
			} else {
				result = "NO";
				break;
			}
		}

		System.out.println(result);
	}

	// 알파벳만 모아서 string builder 하고 reverse
	public void solution1 () {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();

		String answer = "NO";
		s = s.toUpperCase().replaceAll("[^A-Z]","");
		//"[^A-Z]" 가 아니면! ^ 는 부정
		String compare = new StringBuffer(s).reverse().toString();

		if (s.equals(compare)) {
			answer = "YES";
		}

		System.out.println(answer);
	}
}
