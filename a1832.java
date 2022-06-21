package test;

import java.util.Arrays;
import java.util.HashSet;

public class a1832 {
	/*
	 * 全字母句 指包含英语字母表中每个字母至少一次的句子。 给你一个仅由小写英文字母组成的字符串 sentence ，请你判断 sentence 是否为
	 * 全字母句 。 如果是，返回 true ；否则，返回 false 。
	 */
	public  boolean checkIfPangram(String sentence) {
		HashSet<Character> sentence1 = new HashSet<>();
		boolean result=false;
		for (int i = 0; i < sentence.length(); i++) {
			sentence1.add(sentence.charAt(i));
			if (sentence.length()==26) {
				return true;
			}
				
		    }
			return result;
			}

	public static void main(String[] args) {
		String sentence = "leetcode";
		HashSet<Character> sentence1 = new HashSet<>();
		for (int i = 0; i < sentence.length(); i++) {
			sentence1.add(sentence.charAt(i));
		}
		if (sentence.length() == 26) {
			System.out.println("true");
		}
		if (sentence.length() < 26) {
			System.out.println("false");
		}
	}
}
