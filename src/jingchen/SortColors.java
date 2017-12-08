package jingchen;

public class SortColors {
    public void sortColors(int[] nums) {
        int first1 = 0,first2 = 0;
        for(int i = 0;i < nums.length;i++){
            switch(nums[i]){
                case 0:
                    nums[i] = 2;
                    nums[first2++] = 1;
                    nums[first1++] = 0;
                    break;
                case 1:
                    nums[i] = 2;
                    nums[first2++] = 1;
                    break;
                case 2 :
                		nums[i] = 2;
                    break;
            }
        }
    }
    public void sortColors0(int[] nums) {
        for(int i=0,j=0,k=0; k<nums.length; k++){
            int temp = nums[k];
            
            //assigning the current as max
            nums[k] = 2;
            
            // if original is less than 2 then it should be 1
            if(temp < 2){
                nums[j] = 1;
                j +=1;
            }
            
            // if original is less than 1 then it should be 0. The above if statement ensures that 1 - index 
            // will always be greater than 0 - index
            if(temp < 1){
                nums[i] = 0;
                i += 1;
            }
        }
    }
}
