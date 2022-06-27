package test;

import java.util.Arrays;

public class c908 {
	public int smallestRangeI(int[] nums, int k) {
		Arrays.sort(nums);
		if (nums[0]+k>=nums[nums.length-1]-k) {
			return 0;
		}
		if (k==0) {
			return nums[nums.length-1]-nums[0];
		}
		return (nums[nums.length-1]-k)-(nums[0]+k);

    }
	public static void main(String[] args) {
		int[] nums= {0,10};
		int k=2;
		Arrays.sort(nums);
		if (nums[0]+k>=nums[nums.length-1]-k) {
			System.out.println("0");
		}
		if (k==0) {
			System.out.println(nums[nums.length-1]-nums[0]);
		}
		System.out.println((nums[nums.length-1]-k)-(nums[0]+k));
	}

}
