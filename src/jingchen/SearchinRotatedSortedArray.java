package jingchen;

public class SearchinRotatedSortedArray {
	public int search(int[] nums, int target) {
        if(nums.length == 0)
            return -1;
        int min = findMin(nums,0,nums.length-1);
        return search(nums,0,min-1,target) + search(nums,min,nums.length-1,target) +1;
    }
    
    private int findMin(int[] nums,int lo, int hi){
        int mid = (lo + hi) / 2;
        if(mid == 0){
            if(lo == hi)
                return 0;
            else 
                return nums[0] < nums[1] ? 0 : 1;
        }
        if(nums[mid] < nums[mid-1])
            return mid;
        else
            return nums[mid] < nums[hi] ? findMin(nums,lo,mid-1) : findMin(nums,mid+1,hi);
    }
    
    private int search(int[] nums, int lo, int hi, int target){
        if(lo > hi)
            return -1;
        int mid = (lo + hi) / 2;
        if(nums[mid] == target)
            return mid;
        else
            return nums[mid] > target ? search(nums,lo,mid-1,target) : search(nums,mid+1,hi,target);
    }
}
