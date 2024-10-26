package src.cote.DFS_BFS_basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem0708 {
	//BFS 를 통한 송아지 찾기
	// 최단 거리를 찾는 알고리즘
	// 한번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 갈 수 있다.
	// 최소의 회수로 송아지를 찾을 수 있는 횟수를 찾자
	// 사람의 위치 5, 송아지 위치 14
	// 움직일 수 있는 가짓수 1, -1, 5
	// 레벨 = 점프의 횟수
	// 상태 트리

	int answer = 0;
	int[] dis = {1, -1, 5};
	int[] check;
	Queue<Integer> q = new LinkedList<>();

	private int BFS(int s, int e) {
		check = new int[10001];
		check[s] = 1;
		q.offer(s);
		int L = 0;
		while (!q.isEmpty()) {
			int len = q.size();
			for (int i = 0; i < len; i++) {
				int x = q.poll();
				for (int j = 0; j < 3; j++) {
					int nx = x + dis[j];

					if (nx == e) {
						return L+1;
					}

					if (nx >= 1 && nx < 10000 && check[nx] == 0) {
						check[nx] = 1;
						q.offer(nx);
					}
				}
			}
			L++;
		}
		return 0;
	}

	public void solution() {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(BFS(s, e));
	}
}
