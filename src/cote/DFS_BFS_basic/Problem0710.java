package src.cote.DFS_BFS_basic;

import java.util.LinkedList;
import java.util.Queue;

public class Problem0710 {
	//말단 노드 까지의 가장 짧은 경로 구하기
	//BFS 자식 노드가 하나가 있어도 말단 노드를 구할 수 있다.
	Node root;

	public void solution() {
		root = new Problem0709.Node(1);
		root.lt = new Problem0709.Node(2);
		root.rt = new Problem0709.Node(3);
		root.lt.lt = new Problem0709.Node(4);
		root.lt.rt = new Problem0709.Node(5);
		BFS(root);
	}

	private int BFS(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		int level = 0;

		while(!q.isEmpty()) {
			//레벨의 길이를 구하기
			int len = q.size();
			//레벨에 있는 노드를 모두 빼내기
			for (int i = 0; i < len; i++) {
				Node cur = q.poll();
				if (cur.lt==null && cur.rt==null) return level;
				if (cur.lt!=null) q.offer(cur.lt);
				if (cur.rt!=null) q.offer(cur.rt);
			}
			level++;
		}
		return 0;
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
