package test;


import java.util.function.BiConsumer;

public class d1913 {
	public static int maxProductDifference(int[] nums) {
		java.util.Arrays.sort(nums);
		int len = nums.length;
		int sum = nums[len - 1] * nums[len - 2] - nums[0] * nums[1];

		return sum;
	}

	public static void main(String[] args) {
		
		int[] nums= {4,2,5,9,7,4,8};
		System.out.println("The sum is:"+nums);

	}

}
