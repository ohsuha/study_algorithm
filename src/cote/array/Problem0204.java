package src.cote.array;

import java.util.Scanner;

public class Problem0204 {
	public void algorithm() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] tmpArr = new int[n + 1];
		for (int i = 0; i < n + 1; i++) {
			if (i == 0) {
				tmpArr[i] = 0;
			} else if (i == 1) {
				tmpArr[i] = 1;
				System.out.print(tmpArr[i] + " ");
			} else {
				tmpArr[i] = tmpArr[i - 2] + tmpArr[i - 1];
				System.out.print(tmpArr[i] + " ");
			}
		}
	}
}
