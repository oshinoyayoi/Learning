package test;

public class a1342 {
	// 给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。
	//如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1 。
	public int numberOfSteps(int num) {
		int ans = 0;
		while (num != 0 && ++ans >= 0)
			num = num % 2 == 0 ? num / 2 : num - 1;
		return ans;
	}

}
