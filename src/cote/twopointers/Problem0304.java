package src.cote.twopointers;

import java.util.Scanner;

public class Problem0304 {
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}

		int sum = 0;
		int lt = 0;
		int count = 0;
		for (int rt = 0; rt < n; rt++) {
			sum += a[rt];
			if (sum == m) {
				count++;
			}
			while (sum >= m) {
				sum -= a[lt];
				lt++;
				if (sum == m) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
