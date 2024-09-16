package src.cote.twopointers;

import java.util.Scanner;

public class Problem0305 {
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = n/2+1;
		int[] array = new int[m];
		for (int i = 0; i < m; i++) {
			array[i] = i+1;
		}

		int sum = 0;
		int lt = 0;
		int count = 0;
		for (int i = 0; i < m; i++) {
			sum += array[i];
			if (sum == n) {
				count++;
			}
			while (sum >= n) {
				sum -= array[lt];
				lt++;
				if (sum == n) {
					count++;
				}
			}
		}

		System.out.println(count);
	}

}
