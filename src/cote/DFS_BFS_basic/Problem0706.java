package src.cote.DFS_BFS_basic;

public class Problem0706 {
	int n;
	int[] ch;

	public Problem0706(){
	}

	Problem0706(int n, int[] ch) {
		this.n = n;
		this.ch = ch;
	}

	public void DFS(int L) {
		if (L == n + 1) {
			// 노드의 끝
			String tmp = "";
			for (int i = 0; i <= n; i++) {
				if (ch[i] != 0) {
					tmp += i + " ";
				}
			}
			if (!tmp.isEmpty()) {
				System.out.println(tmp);
			}
		} else {
			ch[L] = 1; // [1][0][0]
			DFS(L + 1); //왼쪽으로 뻗는다
			ch[L] = 0; // [0][0][0] 사용하지 않는다의 루트이므로 0으로 변환해준다.
			DFS(L + 1); //오른쪽으로 뻗는다
		}
	}

	// 3이 들어오면 1,2,3, 12, 13, 23, 123 을 출력하는
	// 가능한 모든 부분집합을 출력하시오
	public void solution() {
		Problem0706 T = new Problem0706(3, new int[3+1]);
		T.DFS(1);
	}
}
