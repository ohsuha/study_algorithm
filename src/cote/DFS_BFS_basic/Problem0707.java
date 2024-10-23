package src.cote.DFS_BFS_basic;

import java.util.LinkedList;
import java.util.Queue;

public class Problem0707 {
	// 이진트리 순회 (넓이 우선 탐색 : 레벨 탐색) BFS
	// 0 레벨 다 탐색하고, 1레벨 다 탐색하고, 2레벨 다 탐색하는 방식을 BFS 라고 한다.
	private Node root;

	public class Node {
		int data;
		Node lt, rt;

		public Node(int data) {
			this.data = data;
			lt = rt = null;
		}
	}

	public void solution() {
		Problem0707 tree = new Problem0707();

		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.BFS(tree.root);
	}

	public void BFS(Node node) {
		Queue<Node> queue = new LinkedList<>();
		queue.offer(node);
		int L = 0;
		while (!queue.isEmpty()) {
			int len = queue.size();
			System.out.println(L + " : ");
			for (int i = 0; i < len; i++) {
				Node cur = queue.poll();
				System.out.println(cur.data + " ");
				if (cur.lt != null) {
					queue.offer(cur.lt);
				}
				if (cur.rt != null) {
					queue.offer(cur.rt);
				}
			}
			L++;
			System.out.println();
		}
	}
}