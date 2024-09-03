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

	// indexOf()
	public void solution() {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();

		String answer = "";
		for (int i=0; i<string.length(); i++) {
			// System.out.println(string.charAt(i) + " " + i + " " + string.indexOf(string.charAt(i)));
			// string.charAt(i) 과 string.indexOf(string.charAt(i)가 다르면 처음이 아닌 것임!
			if(string.indexOf(String.valueOf(string.charAt(i))) == i) { // 거짓이라면 이미 중복된 문자인 것임
				answer += String.valueOf(string.charAt(i));
			}
		}
		System.out.println(answer);
	}
}
