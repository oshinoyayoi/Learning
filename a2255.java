package test;

import java.util.Arrays;

public class a2255 {
	/*
	 * 给你一个字符串数组 words 和一个字符串 s ，其中 words[i] 和 s 只包含 小写英文字母 。
	 * 
	 * 请你返回 words 中是字符串 s 前缀 的 字符串数目 。
	 * 
	 * 一个字符串的 前缀 是出现在字符串开头的子字符串。子字符串 是一个字符串中的连续一段字符序列。
	 */
	public int countPrefixes(String[] words, String s) {
		int result = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > s.length()) 
				continue;
			
			if (s.substring(0, words[i].length()).equals(words[i])) {
				result++;
			}

		}
		return result;
		

	}
	public static void main(String[] args) {
		String[] words= {"a","b","c","ab","bc","abc"};
		String s="abc";
		int result = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > s.length()) 
				continue;
			
			if (s.substring(0, words[i].length()).equals(words[i])) {
				result++;
			}

		}
		System.out.println(result);
	}

}
