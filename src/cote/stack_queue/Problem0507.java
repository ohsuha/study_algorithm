package src.cote.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem0507 {
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		String A = scanner.nextLine();
		String B = scanner.nextLine();
		char[] chars = B.toCharArray();
		Queue<Character> queue = new LinkedList<>();
		for (int i = 0; i < A.length(); i++) {
			queue.offer(A.charAt(i));
		}

		String answer = "NO";
		for (int i = 0; i < B.length(); i++) {
			char queueChar = queue.peek();
			if (chars[i] == queueChar) {
				queue.poll();
			}
			if (queue.isEmpty()){
				answer = "YES";
				break;
			}
		}
		System.out.println(answer);
	}
}
