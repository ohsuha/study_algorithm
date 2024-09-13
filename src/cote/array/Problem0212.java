package src.cote.array;

import java.util.Scanner;

public class Problem0212 {
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //학생수
		int m = sc.nextInt(); //문제수
		int[][] arr = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int answer = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				//짝을 지을 수있는 총 경우의 수가 나온다.
				int cnt = 0; // i,j 짝궁이 멘토멘티가 될 수 있는지 카운트, 총 m의 수가 되어야 한다.
				for (int k = 0; k < m; k++) {
					// 테스트 갯수
					int pi = 0, pj = 0;
					for (int s = 0; s < n; s++) {
						// 짝꿍이 (i, j) 로 정해진것이 나온다. (3,1)
						// k 가 0 일떄 3번학생의 등수와 1번학생의 등수를 비교한다 arr[k][s] == i 일때 position i = s
						if (arr[k][s] == i) pi = s;
						if (arr[k][s] == j) pj = s;
					}
					if (pi < pj) cnt++;
				}
				if (cnt == m) answer++;
			}
		}
		System.out.println(answer);
	}
}
