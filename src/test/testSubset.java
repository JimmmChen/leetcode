package test;

import java.util.List;

import jingchen.Subsets;

import org.junit.Test;

public class testSubset {
	@Test
	public void test01(){
		  int[] nums = {1,2,2,2};
		  Subsets s = new Subsets();
		  List<List<Integer>> list = s.subsets(nums);
	}
}
