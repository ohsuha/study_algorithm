package src.cote.hash;

import java.util.HashMap;
import java.util.Scanner;

public class Problem0404 {
	public void algorithm() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String ana = sc.nextLine();
		int anaLength = ana.length();

		Character[] characters = new Character[str.length()];
		for (int i = 0; i < str.length(); i++) {
			characters[i] = str.charAt(i);
		}

		int sum = 0;
		for (int i = 0; i < anaLength; i++) {
			sum += ana.charAt(i);
		}

		int answer = 0;
		int charSum = 0;
		for (int i = 0; i < anaLength; i++) {
			charSum += ana.charAt(i);
		}

		if (charSum == sum) {
			answer++;
		}

		int lt = 0;
		for (int i = ana.length(); i < characters.length; i++) {
			charSum += characters[i];
			charSum -= characters[lt];
			lt++;
			if (charSum == sum) {
				answer++;
			}
		}
		System.out.println(answer);

		//오답
	}

	public void solution() {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();

		HashMap<Character, Integer> am = new HashMap<>();
		HashMap<Character, Integer> bm = new HashMap<>();

		for (char c : b.toCharArray()) {
			bm.put(c, bm.getOrDefault(c, 0) + 1);
		}

		int L = b.length() - 1;
		for (int i = 0; i < L; i++) {
			am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);
		}

		int answer = 0;
		int lt = 0;
		for (int rt = L; rt < a.length(); rt++) {
			am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1);
			if (bm.equals(am))
				answer++;

			am.put(a.charAt(lt), am.get(a.charAt(lt)) - 1);
			if (am.get(a.charAt(lt)) == 0) am.remove(a.charAt(lt));
			lt++;
		}

		System.out.println(answer);
	}
}
