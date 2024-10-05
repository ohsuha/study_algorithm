package src.cote.stack_queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem0506 {
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i < N + 1; i++) {
			list.add(i);
		}

		while (list.size() != 1) {
			for (int i = 0; i < K; i++) {
				if (i != K - 1) {
					list.add(list.get(0));
					list.remove(0);
				} else {
					list.remove(0);
				}
			}
		}

		System.out.println(list.get(0));
	}

	public void solution() {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();

		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i < N + 1; i++) {
			queue.offer(i);
		}

		while (!queue.isEmpty()) {
			for (int i = 0; i < K; i++) {
				queue.offer(queue.poll());
			}
			queue.poll();

			if (queue.size() == 1) {
				System.out.println(queue.poll());
			}
		}
	}
}
