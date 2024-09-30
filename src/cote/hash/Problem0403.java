package src.cote.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Problem0403 {
	public void algorithm() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		List<Integer> answer = new ArrayList<>();

		for (int i = 0; i < n - m + 1; i++) {
			HashSet<Integer> set = new HashSet<>();
			for (int j = i; j < i + m; j++) {
				set.add(arr[j]);
			}
			answer.add(set.size());
		}

		for (int i : answer) {
			System.out.print(i + " ");
		}
		// time limit
	}

	public void algorithm2() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		List<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < m; i++) {
			map.put(arr[i], 0);
		}
		answer.add(map.size());

		int pointer = m;
		while (pointer < n) {
			map.remove(arr[pointer - m]);
			map.put(arr[pointer], 0);
			pointer++;
			answer.add(map.size());
		}

		for (int i : answer) {
			System.out.print(i + " ");
		}
	}

	public void solution() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < k; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		answer.add(map.size());

		int lt = 0;
		for (int i = k; i < n; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

			if (map.get(arr[lt]) == 1) {
				map.remove(arr[lt]);
			} else if (map.get(arr[lt]) > 1) {
				map.put(arr[lt], map.get(arr[lt]) - 1);
			}
			lt++;
			answer.add(map.size());
		}

		for (int i : answer) {
			System.out.print(i + " ");
		}
	}
}
