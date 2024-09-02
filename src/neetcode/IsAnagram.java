package src.neetcode;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		char[] sArr = s.toCharArray();
		char[] tArr = t.toCharArray();

		Map<Character, Integer> sMap = addMap(sArr);
		Map<Character, Integer> tMap = addMap(tArr);

		for (char sKey : sMap.keySet()) {
			Integer sValue = sMap.get(sKey);

			if (!tMap.containsKey(sKey)) {
				return false;
			}

			if (tMap.get(sKey) != sValue) {
				return false;
			}
		}
		return true;
	}

	private Map<Character, Integer> addMap(char[] charArr) {
		Map<Character, Integer> map = new HashMap<>();
		for (char c : charArr) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
		}
		return map;
	}


	public boolean isAnagramSolution(String s, String t) {
		if (s.length() != t.length()) return false;

		int[] store = new int[26];

		for (int i = 0; i < s.length(); i++) {
			store[s.charAt(i) - 'a']++;
			store[t.charAt(i) - 'a']--;
		}

		for (int n : store) if (n != 0) return false;

		return true;
	}
}
