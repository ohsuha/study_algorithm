package src.cote.DFS_BFS_basic;

public class Problem0709 {
	// DFS 를 통해 최소 경로를 구하기
	Node root;

	public void solution() {
		root = new Node(1);
		root.lt = new Node(2);
		root.rt = new Node(3);
		root.lt.lt = new Node(4);
		root.lt.rt = new Node(5);
		DFS(0, root);
	}

	private int DFS(int L, Node root) {
		if (root.lt == null && root.rt == null)
			return L;
		else
			return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
	}

	private class Node {
		int data;
		Node rt;
		Node lt;

		public Node(int data) {
			this.data = data;
			lt = rt = null;
		}
	}
}
