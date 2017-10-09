package jingchen;

public class SortColors {
    public void sortColors(int[] nums) {
        int first1 = -1,first2 = -1;
        for(int i = 0;i < nums.length;i++){
            switch(nums[i]){
                case 0:
                    if(first2 >= 0){
                        swap(nums,i,first2);
                        if(first1 >= 0){
                            swap(nums,first2,first1);
                            first1 += 1;
                        }
                        first2 += 1;
                    } else if(first1 >= 0){
                        swap(nums,i,first1);
                        first1 += 1;
                    }
                    break;
                case 1:
                    if(first2 >= 0){
                        swap(nums,i,first2);
                        if(first1 < 0)
                            first1 = first2;
                        first2 += 1;
                    } else if(first1 < 0)
                        first1 = i;
                    break;
                case 2 :
                    if(first2 < 0)
                        first2 = i;
                    break;
            }
        }
    }
    
    private void swap(int[] nums,int x, int y){
    		if(y < 0 || y > nums.length)
    			return;
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
