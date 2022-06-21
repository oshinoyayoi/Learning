package test;

import java.util.HashSet;

public class a1684 {
	/*
	 * 给你一个由不同字符组成的字符串 allowed 和一个字符串数组 words 。 如果一个字符串的每一个字符都在 allowed 中，就称这个字符串是
	 * 一致字符串 。 请你返回 words 数组中 一致字符串 的数目。
	 */
	public int countConsistentStrings(String allowed, String[] words) {
		// 把字符串allowed拿来和words数组的每一项比对
		int result = words.length;
		HashSet<Character> allowedWords =new HashSet<>();
		
		for (int i = 0; i < words.length; i++) {	
			if (allowed.contains(words[i])) {
				result--;
			} else {
				continue;
			}
		}
		return result;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		String allowed = "abc";
		String[] words = { "a", "b", "c", "ab", "ac", "bc", "abc" };
		System.out.println();

	}

}
