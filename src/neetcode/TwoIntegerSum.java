package src.neetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoIntegerSum {
	public int[] twoSum(int[] nums, int target) {
		// [3,4,5,6] : 7
		// [-1, -2, -3, -4, -5] : -8
		Arrays.sort(nums);
		// 음수의 경우 오름차순으로 정렬이 안되어서? 아래 알고리즘을 사용할 수 없다.
		// 두 포인터 접근 방식이 제대로 작동하려면 배열이 오름차순으로 정렬되어 있어야 한다

		int i = 0;
		int j = nums.length - 1;

		while (i < j) {
			if (nums[i] + nums[j] == target) {
				return new int[] {i, j};
			} else if (nums[i] + nums[j] < target) {
				i++;
			} else if (nums[i] + nums[j] > target) {
				j--;
			}
		}
		return null;
	}

	public int[] twoSumSolution(int[] nums, int target) {
		HashMap<Integer, Integer> prevMap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			int diff = target - num;

			if (prevMap.containsKey(diff)) {
				return new int[] {prevMap.get(diff), i};
			}

			prevMap.put(num, i);
		}

		return new int[] {};
	}

}