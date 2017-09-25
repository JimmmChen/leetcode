package jingchen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	  public List<List<Integer>> threeSum(int[] nums) {
	        List<List<Integer>> result = new ArrayList<List<Integer>>();
	        StringBuffer s = new StringBuffer();
	        if(nums.length<3)
	            return result;
	        Arrays.sort(nums);
	        for(int i = 0;i < nums.length-2;i++){
	            if(nums[i] > 0)
	                break;
	            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
	            int lo = i+1, hi = nums.length-1,sum = 0 - nums[i];
	            while(lo < hi){
	                if(nums[lo] + nums[hi] ==sum){
	                    result.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
	                    while(lo < nums.length-1 && nums[lo] == nums[++lo]) ;
	                    while(hi > i && nums[hi] == nums[--hi]) ;
	                }
	                else if(nums[lo] + nums[hi] < sum)
	                    lo++;
	                else hi--;
	            }
	            }
	        }
	        return result;
	    }
}
