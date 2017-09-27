package jingchen;

public class MoveZeros {
	public void moveZeroes(int[] nums) {
		if(nums.length <= 1)
            return;
        int i = 0,count = 0;
        while(i != nums.length){      
                if(nums[i] == 0)
                    count++;
                else if(count != 0){
                    nums[i-count] = nums[i];
                    nums[i] = 0;
                }
                i++;
        }
    }
}
