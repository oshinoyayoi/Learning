package test;

public class a2108 {
	/*
	 * 给你一个字符串数组 words ，找出并返回数组中的 第一个回文字符串 。如果不存在满足要求的字符串，返回一个 空字符串 "" 。

回文字符串 的定义为：如果一个字符串正着读和反着读一样，那么该字符串就是一个 回文字符串 。
	 */
	public String firstPalindrome(String[] words) {
		for (String word : words) {
	         boolean bingo = true;
	         // 首尾比较
	         for (int i = 0, j = word.length() - 1; i < j; i++, j--) {
	             if (word.charAt(i) != word.charAt(j)) {
	                 // 不符合条件
	                 bingo = false;
	                 break;
	             }
	         }
	         if (bingo) {
	             return word;
	         }
	     }
	     return "";
		}

    }


