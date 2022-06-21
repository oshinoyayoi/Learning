package test;

public class d1313 {
	/*
	 * 给你一个以行程长度编码压缩的整数列表 nums 。

考虑每对相邻的两个元素 [freq, val] = [nums[2*i], nums[2*i+1]] （其中 i >= 0 ），每一对都表示解压后子列表中有 freq 个值为 val 的元素，你需要从左到右连接所有子列表以生成解压后的列表。

请你返回解压后的列表。
	 */
	public int[] decompressRLElist(int[] nums) {
		//解压后列表的长度。奇数位数字为后面对应的偶数位数字的个数
		int newNumsLength=0;
		for (int i = 0; i < nums.length; i+=2) {
			newNumsLength=nums[i];
		}
		//解压后列表为nuwNums
		int newNums[]=new int[newNumsLength];
		int k =0;
		for (int i = 0; i < newNums.length; i+=2) {
			for (int j = 0; j < nums[i]; j++) {
				newNums[k]=nums[i+1];
				k++;
			}
		}
		return newNums;
	}

}
