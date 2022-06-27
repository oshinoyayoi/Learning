package test;

import java.util.Iterator;

public class c1768 {
	 public String mergeAlternately(String word1, String word2) {
		 int len1=word1.length();
		 int len2=word2.length();
		 int x=0;
		 char[] ch=new char[len1+len2];
		 for (int i = 0; i < len1 || i<len2; i++) {
			if (i<len1) {
				ch[x++]=word1.charAt(i);
			}
			if (i<len2) {
				ch[x++]=word2.charAt(i);
			}
		}
		return new String(ch);
		}

	    }


