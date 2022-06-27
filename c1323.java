package test;

public class c1323 {
	public int maximum69Number(int num) {
		String nums = Integer.toString(num);
		char[] x = nums.toCharArray();
		for (int i = 0; i < x.length; i++) {
			if (x[i]=='6') {
				x[i]='9';
				break;
			}

		}
		return Integer.parseInt(new String(x));
	}
	public static void main(String[] args) {
		int num=9669;
		String nums = Integer.toString(num);
		char[] x = nums.toCharArray();
		for (int i = 0; i < x.length; i++) {
			if (x[i]=='6') {
				x[i]='9';
				break;
	}
}  
		System.out.println(Integer.parseInt(new String(x)));
	}
}
