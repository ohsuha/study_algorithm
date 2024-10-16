package src.cote.DFS_BFS_basic;

import java.util.Scanner;

public class Problem0701 {
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		DFS(n);
	}

	public void DFS(int n) {
		if (n == 0) {
			return; // void 에서는 호출된 함수 바로 종료
		} else {
			System.out.println(n);
			DFS(n - 1);
		}
	}
}
