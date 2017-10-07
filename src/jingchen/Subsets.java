package jingchen;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Subsets {
	HashSet<List<Integer>> set;

	public List<List<Integer>> subsets(int[] nums) {
		Arrays.sort(nums);
		set = new HashSet<>();
		for (int i = 0; i <= nums.length; i++) {
			List<Integer> list = new ArrayList<>();
			helper(nums, 0, i, list);
		}
		List<List<Integer>> result = new ArrayList<>();
		Iterator<List<Integer>> iterator = set.iterator();
		while(iterator.hasNext())
			result.add(iterator.next());
		return result;
	}

	private void helper(int[] nums, int index, int n, List<Integer> list) {
		if (n > nums.length - index)
			return;
		else if (n == 0) {
			List<Integer> newlist = new ArrayList<>(list);
			set.add(newlist);
			return;
		}
		list.add(nums[index]);
		helper(nums, index + 1, n - 1, list);
		list.remove(Integer.valueOf(nums[index]));
		helper(nums, index + 1, n, list);
	}
}
