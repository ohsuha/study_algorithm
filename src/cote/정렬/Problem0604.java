package src.cote.정렬;

import java.util.Scanner;

public class Problem0604 {
	public void solution() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] arr = new int[m];
		for (int i = 0; i < m; i++) {
			arr[i] = scanner.nextInt();
		}

		int[] cache = new int[n];

		for (int x : arr) {
			int pos = -1; // hit 값을 찾기 위한 인덱스
			for (int i = 0; i < n; i++) {
				if (x == cache[i]) {
					pos = i;
				}
			}
			if (pos == -1) {
				for (int i = n - 1; i >= 1; i--) {
					cache[i] = cache[i - 1];
				}
				cache[0] = x;
			} else {
				for (int i = pos; i >= 1; i--) {
					cache[i] = cache[i - 1];
				}
				cache[0] = x;
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(cache[i] + " ");
		}
	}
}
