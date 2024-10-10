package src.cote.정렬;

import java.util.Scanner;

public class Problem0603 {
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		for (int i = 1; i < n; i++) {
			int tmp = arr[i];
			int j;
			for (j = i - 1; j >= 0; j--) {
				if (tmp < arr[j]) {
					arr[j + 1] = arr[j];
				} else {
					break;
				}
			}
			arr[j + 1] = tmp;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
