package test;

import java.util.Arrays;

public class d1221 {
//在一个 平衡字符串 中，'L' 和 'R' 字符的数量是相同的。

//给你一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。

//注意：分割得到的每个字符串都必须是平衡字符串，且分割得到的平衡字符串是原平衡字符串的连续子串。

//返回可以通过分割得到的平衡字符串的 最大数量 。

	public static int balancedStringSplit(String s) {
		int result = 0;
		int lcount = 0;
		int rcount = 0;
		int len = s.length();
		for (int i = 1; i < len; i++) {
			if (s.charAt(i) == 'L') {
				lcount++;
			}else {
				rcount++;}
			if (lcount == rcount) {
				result++;
				}
		}
		return result;
	}

	public static void main(String[] args) {
		String example = "RLLLRRRLR" ;
		System.out.println((balancedStringSplit(example)));
	}
}
