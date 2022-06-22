package test;

import java.util.Arrays;

public class a1409 {
	public int[] processQueries(int[] queries, int m) {
		int[] res=new int[queries.length];
		int[] p=new int[queries.length+m];
		for (int i = 0; i < m; i++) {
			p[queries.length+i]=i+1;
		}
		for (int i = 0; i < queries.length; i++) {
			int len=queries.length-i;
			while (p[len]!=queries.length-i) {
				if (p[len]>0 ) {
					res[i]++;
					len++;
			}
			
			}
			p[len]=0;
			len=queries.length-i-1;
			p[len]=queries[i];
		}
		
		return res;

    }
	public static void main(String[] args) {
		int[] queries= {3,1,2,1};
		int m=5;
		int[] res=new int[queries.length];
		int[] p=new int[queries.length+m];
		for (int i = 0; i < m; i++) {
			p[queries.length+i]=i+1;
		}
		for (int i = 0; i < queries.length; i++) {
			int len=queries.length-i;
			while (p[len]!=queries.length-i) {
				if (p[len]>0 ) {
					res[i]++;
					len++;
			}
			}
			p[len]=0;
			len=queries.length-i-1;
			p[len]=queries[i];
		}
		System.out.println(Arrays.toString(res));
	}

}
