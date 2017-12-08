package test;

import jingchen.SortColors;

import org.junit.Test;

public class testSortColors {
	@Test
	public void test01(){
		SortColors sc = new SortColors();
		int[] nums = {1,1,2,0,2,0};
		sc.sortColors(nums);
		for(int i : nums)
			System.out.print(i);
	}
}
