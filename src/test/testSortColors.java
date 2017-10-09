package test;

import jingchen.SortColors;

import org.junit.Test;

public class testSortColors {
	@Test
	public void test01(){
		SortColors sc = new SortColors();
		int[] nums = {2,0,0};
		sc.sortColors(nums);
	}
}
