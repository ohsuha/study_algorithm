package src.cote.twopointers;

import java.util.Scanner;

public class Problem0306 {
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}

		int answer = 0;
		int cnt = 0;
		int lt = 0;
		for (int rt = 0; rt < n; rt++) {
			if (a[rt] == 0) {
				cnt++;
			}
			while (cnt > k) {
				if(a[lt]==0) {
					cnt--;
				}
				lt++;
			}
			answer = Math.max(answer, rt - lt +1);
		}
		System.out.println(answer);
	}
}
