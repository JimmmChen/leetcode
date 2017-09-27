package test;

import jingchen.MoveZeros;

import org.junit.Test;

public class testMoveZeros {
	@Test
	public void test01(){
		int[] nums = {0,1,0,3,12};
		MoveZeros mz = new MoveZeros();
		mz.moveZeroes(nums);
		for(int i:nums){
			System.out.print(i+",");
		}
	}
}
