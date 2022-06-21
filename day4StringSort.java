package test;

import java.util.Arrays;
import java.util.Scanner;

public class day4StringSort {
// （对字符串的字符排序）使用以下方法头编写一个方法，返回一个排好序的字符串。
//public static String sort(String s)
//例如，sort（“acb”）返回abc编写一个测试程序，提示用户输入一个字符串，显示排好序的字符串。
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s = input.nextLine();

		char[] str = new char[s.length()];
		for (int i = 0; i < str.length; i++) {
			str[i] = s.charAt(i);
		}

		for (int i = 0; i < str.length; i++) {
			char min1 = str[i];
			int min2 = i;
		
		for (int j = i+1; j < str.length; j++) {
			 min1 = str[j];
			 min2 = j;}
		}
		 
		
	}
}