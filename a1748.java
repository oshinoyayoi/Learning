package test;

public class a1748 {
	/*
	 * 给你一个整数数组 nums 。数组中唯一元素是那些只出现 恰好一次 的元素。

请你返回 nums 中唯一元素的 和 。
	 */
	public int sumOfUnique(int[] nums) {
		int arr[]=new int[101];
		int sum=0;
		for (int num : nums) {
			arr[num]++;
		}
		for (int i = 0; i < nums.length; i++) {
			if (arr[nums[i]]==1) {
				sum+=nums[i];
			}
		}
		return sum;

    }

}
