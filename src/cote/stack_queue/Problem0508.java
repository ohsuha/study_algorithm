package src.cote.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem0508 {
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		Queue<Person> personQueue = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			personQueue.offer(new Person(i, scanner.nextInt()));
		}

		int answer = 0;
		boolean flag = true;
		while (flag) {
			Person person = personQueue.poll();
			for (Person p : personQueue) {
				if (p.priority > person.priority) {
					personQueue.offer(person);
					person = null;
					break;
				}
			}

			if (person != null) {
				answer++;
				if (person.id == m) {
					flag = false;
				}
			}
		}

		System.out.println(answer);
	}

	static class Person {
		int id;
		int priority;

		public Person(int id, int priority) {
			this.id = id;
			this.priority = priority;
		}
	}
}
