package src.cote.array;

import java.util.Scanner;

public class Problem0208 {
	public void algorithm() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int[] result = new int[n];

		for (int i = 0; i < n; i++) {
			int rank = 1;
			for (int j = 0; j < n; j++) {
				if (arr[j] > arr[i]) {
					rank++;
				}
			}
			result[i] = rank;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
