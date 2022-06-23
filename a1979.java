package test;

import java.util.Arrays;

public class a1979 {
	 public int findGCD(int[] nums) {
	        Arrays.sort(nums);

	        int min = nums[0];
	        int max = nums[nums.length - 1];
	        int ans = 1;

	        // 使用min作为最大公约数，依次递减
	        for(int i = min; i >= 1; i--) {
	            if(min % i == 0 && max % i == 0) {
	                ans = i;
	                break;
	            }
	        }
	        return ans;
	    }

}
