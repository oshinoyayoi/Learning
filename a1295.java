package test;

public class a1295 {
	/*
	 * 给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数。
	 */
	public int findNumbers(int[] nums) {
		int res=0;
		int x=0;
		for (int i = 0; i < nums.length; i++) {
			while (nums[i]>0) {
				nums[i]/=10;
				x++;
			}
			if (x%2==0) {
				res++;
			}
			x=0;
		}
		return res;
	}

}
