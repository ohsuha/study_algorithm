package src.cote.array;

import java.util.Scanner;

public class Problem0210 {
	int[] dx = {-1, 0, 1, 0};
	int[] dy = {0, 1, 0, -1};

	public void solution() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n + 1][n + 1];
		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < n + 1; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int answer = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				boolean flag = true;
				for (int k = 0; k < 4; k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];
					if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] > arr[i][j]) {
						flag = false;
						break;
					}
				}
				if (flag) {
					answer++;
				}
			}
		}

		System.out.println(answer);
	}
}
