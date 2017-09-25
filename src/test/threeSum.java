package test;

import java.util.ArrayList;
import java.util.List;

import jingchen.ThreeSum;

import org.junit.Test;

public class threeSum {
	@Test
	public void test01(){
		ThreeSum ts = new ThreeSum();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		int[] nums = {-1,0,1,2,-1,-4};
		result = ts.threeSum(nums);
		System.out.println(result);

	}
}
