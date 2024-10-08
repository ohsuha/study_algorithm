package src.neetcode;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInteger {
	public boolean hasDuplicate(int[] nums) {
		Set set = new HashSet();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		if (set.size() == nums.length) {
			return false;
		} else {
			return true;
		}
	}

	public boolean hasDuplicateSolution(int[] nums) {
		Set<Integer> uniques = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (uniques.contains(nums[i])) {
				return true;
			}
			uniques.add(nums[i]);
		}
		return false;
	}
}
