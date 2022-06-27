package test;

public class c1827 {
	public int minOperations(int[] nums) {
		int times=0;
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i]>nums[i+1]-1) {
				times+=nums[i]+1-nums[i+1];
				nums[i+1]=nums[i]+1;
			}
		}
		return times;

    }

}
