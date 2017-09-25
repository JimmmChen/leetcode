package jingchen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> existValue = new HashMap<Integer,Integer>();
        int[] result = new int[2];
        for(int i = 0;i < nums.length;i++){
            if(existValue.containsKey(target - nums[i])){
                result[0] = existValue.get(target - nums[i]).intValue();
                result[1] = i;
                break;
            } 
            else
                existValue.put(new Integer(nums[i]),new Integer(i));
        }
        return result;
    }
}
