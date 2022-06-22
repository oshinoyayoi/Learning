package test;

public class a1551 {
	/*
	 * 存在一个长度为 n 的数组 arr ，其中 arr[i] = (2 * i) + 1 （ 0 <= i < n ）。 一次操作中，你可以选出两个下标，记作
	 * x 和 y （ 0 <= x, y < n ）并使 arr[x] 减去 1 、arr[y] 加上 1 （即 arr[x] -=1 且 arr[y] +=
	 * 1 ）。 最终的目标是使数组中的所有元素都 相等 。题目测试用例将会 保证 ：在执行若干步操作后，数组中的所有元素最终可以全部相等。 给你一个整数
	 * n，即数组的长度。请你返回使数组 arr 中所有元素相等所需的 最小操作数 。
	 * 
	 * 对于每一个大于 n 的数，其与 n 的差值即为该元素需要进行的「减」操作的数量。 我们只要统计所有大于 n 的数与 n
	 * 的差值，就能计算出我们操作了多少次。
	 * 
	 */
	public int minOperations(int n) {
		int avg = n;
		int times = 0;
		for (int i = 0; i < n; i++) {
			int x = (2 * i) + 1;
			if (x > avg) {
				times += (2 * i) + 1 - n;
			}
		}
		return times;

	}

	public static void main(String[] args) {
		int n = 6;
		int avg = n;
		int times = 0;
		for (int i = 0; i < n; i++) {
			int x = (2 * i) + 1;
			if (x > avg) {
				times += (2 * i) + 1 - n;
			}
		}
		System.out.println(times);
	}
}
