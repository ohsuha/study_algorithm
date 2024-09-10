package src.cote.array;

import java.util.Scanner;

public class Problem0212 {
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //학생수
		int m = sc.nextInt(); //문제수
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				for (int k = 0; k < i; k++) {
					if (arr[i][k] > arr[i][j]) {

					}
				}
			}
		}
	}
}
