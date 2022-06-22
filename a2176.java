package test;

import java.util.Iterator;

public class a2176 {
	/*
	 * 给你一个下标从 0 开始长度为 n 的整数数组 nums 和一个整数 k ，请你返回满足 0 <= i < j < n ，nums[i] == nums[j] 
	 * 且 (i * j) 能被 k 整除的数对 (i, j) 的 数目 。
	 */
	public int countPairs(int[] nums, int k) {
		int res=0;
		
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i+1; j<nums.length; j++) {
				if (nums[i] == nums[j] && (i*j)%k==0) 
					res++;
				
			}
		}
			
		
		return res;

    }

} 


