package src.cote.stack_queue;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem0503 {
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] dollArr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				dollArr[i][j] = scanner.nextInt();
			}
		}

		int M = scanner.nextInt();
		int[] moveArr = new int[M];
		for (int i = 0; i < M; i++) {
			moveArr[i] = scanner.nextInt();
		}

		ArrayList<Integer> bucket = new ArrayList<>();
		int count = 0;
		for (int i = 0; i < M; i++) {
			int crain = moveArr[i] - 1;
			for (int j = 0; j < n; j++) {
				if (dollArr[j][crain] != 0) {
					bucket.add(dollArr[j][crain]);
					dollArr[j][crain] = 0;

					if (bucket.size() != 1) {
						if (bucket.get(bucket.size() - 1) == bucket.get(bucket.size() - 2)) {
							count++;
							bucket.remove(bucket.size() - 1);
							bucket.remove(bucket.size() - 1);
						}
					}

					break;
				}
			}
		}

		System.out.println(count * 2);
	}
}
