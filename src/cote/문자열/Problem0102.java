package src.cote.문자열;

import java.util.Scanner;

public class Problem0102 {
	public void algorithm() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		char[] chars = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isUpperCase(c)){
				chars[i] = Character.toLowerCase(c);
			}else if (Character.isLowerCase(c)){
				chars[i] = Character.toUpperCase(c);
			};
		}

		String s = String.valueOf(chars);
		System.out.println(s);
	}

	public void solution() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String answer = "";
		for (char c : str.toCharArray()) {
			if(Character.isUpperCase(c)){
				answer += Character.toLowerCase(c);
			} else {
				answer += Character.toUpperCase(c);
			}
		}
	}
}
