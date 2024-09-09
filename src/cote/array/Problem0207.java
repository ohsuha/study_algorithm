package src.cote.array;

import java.util.Scanner;

public class Problem0207 {
	public void algorithm() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int[] count = new int[n];
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				count[i] = arr[i];
				continue;
			}

			if (arr[i - 1] != 0 && arr[i] != 0) {
				count[i] = ((count[i - 1]) + 1);
			} else if (arr[i] == 1) {
				count[i] = 1;
			}
		}

		int result = 0;
		for (int a : count) {
			result += a;
		}

		System.out.println(result);
	}
}
