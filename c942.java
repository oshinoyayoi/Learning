package test;

import java.util.Arrays;

public class c942 {
	public int[] diStringMatch(String s) {
		int n = s.length();
		int[] perm = new int[n + 1];
		int x = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'I') {
				perm[i] = x;
				x++;
			} else {
				perm[i] = n;
				n--;
			}
		}
		perm[s.length()]=x;
		return perm;
	}

	public static void main(String[] args) {
		String s = "IDID";
		int n = s.length();
		int[] perm = new int[n + 1];
		int x = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'I') {
				perm[i] = x;
				x++;
			} else {
				perm[i] = n;
				n--;
			}
		}
		perm[s.length()]=x;
		System.out.println(Arrays.toString(perm));
	}
}
