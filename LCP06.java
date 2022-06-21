package test;

import java.util.Iterator;
import java.util.Scanner;

public class LCP06 {
/*
 * 桌上有 n 堆力扣币，每堆的数量保存在数组 coins 中。
 * 我们每次可以选择任意一堆，拿走其中的一枚或者两枚，求拿完所有力扣币的最少次数。
 */
	public static void main(String[] args) {
		
		int[] coins=new int[10];
		int ans=0;
		for (int i:coins) {
			ans+=(i+1)>>1;
		}
		System.out.println(ans);
		}
	}

