package jingchen;

public class MaximalRectangle {
	 public int maximalRectangle(char[][] matrix) {
	        if(matrix.length == 0)
	            return 0;
	        int[] height = new int[matrix[0].length];
	        int maxArea = 0;
	        for(int i = 0;i < matrix.length;i++){
	            int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
	            for(int j = 0;j < matrix[0].length;j++){
	                height[j] = matrix[i][j] == '1' ? height[j] + 1 : 0;
	                max = height[j] > max ? height[j] : max;
	                min = height[j] < min ? height[j] : min;
	            }        
	            for(int j = min; j <= max;j++){
	                int sum = 0;
	                if(j == 0)
	                   continue;
	                for(int k = 0;k < matrix[0].length;k++){
	                    if(height[k] >= j)
	                        sum += j;
	                    else{
	                        maxArea = sum > maxArea ? sum : maxArea;
	                        sum = 0;
	                    }
	                    if(k == matrix[0].length-1)
	                        maxArea = sum > maxArea ? sum : maxArea;
	                }
	            }
	            
	        }
	        return maxArea;
	    }
}
