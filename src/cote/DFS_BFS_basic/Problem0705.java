package src.cote.DFS_BFS_basic;

public class Problem0705 {
	// 이진 트리 순회 (깊이 우선 탐색)
	// 전위 순회 출력 : 1 2 4 5 3 6 7 부모를 제일 먼저 방문 -> 왼쪽 -> 오른쪽
	// 중위 순회 : 4 2 5 1 6 3 7 가장 왼쪽 -> 부모 -> 오른쪽
	// 후위 순회 : 4 5 2 6 7 3 1  왼 -> 오른 -> 부모
	// 방문 = 출력
	// 깊이 우선 탐색은 계속 부모에서 타고 타고 내려감

	private Node root;

	public void DFS(Node root) {
		if (root == null) {
			return;
		} else {
			// System.out.println(root.data); // 여기서 출력을 찍으면 전위 순회
			DFS(root.lt);
			System.out.println(root.data); // 여기서 출력을 찍으면 중위 순회
			DFS(root.rt);
			// System.out.println(root.data); // 여기서 출력을 찍으면 후위 순회
		}
	}

	public void solution() {
		Problem0705 tree = new Problem0705();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.DFS(tree.root);
	}

	public class Node {
		int data;
		Node lt, rt;

		public Node(int data) {
			this.data = data;
			lt = rt = null;
		}
	}
}
