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
			// System.out.println(n);
			DFS(n - 1); //이 순간 다시 DFS 를 호출하기 때문에 스택 위에 D(2)가 생성된다. 아래 코드는 아직 실행하지 않은게 됨
			System.out.println(n); //여기에 두면 12345 역순으로 출력된다. 스택의 가장 위에 쌓인 것부터 실행하기 때문에...
			//이렇게 되는 이유는 메서드는 스택 자료 구조를 가지고 있기 때문임
		}
	}
}
