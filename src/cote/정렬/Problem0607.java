package src.cote.정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//좌표정렬을 위한 기술
public class Problem0607 {
	public void algorithm() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Point> points = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			points.add(new Point(scanner.nextInt(), scanner.nextInt()));
		}

		Collections.sort(points);

		for (Point point : points) {
			System.out.println(point.toString());
		}

	}

	static class Point implements Comparable<Point> {
		int x;
		int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Point o) {
			if (this.x == o.x) {
				return (this.y - o.y);
				// 오름차순으로 하려면 this.10 , o.20 순서대로 있다면 음수가 리턴 되어야함
				// this가 크고
			} else {
				return this.x - o.x;
			}
		}

		public String toString() {
			return x + " " + y;
		}
	}
}
