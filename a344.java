package test;

public class a344 {
	public void reverseString(char[] s) {
		int first = 0;
		int last = s.length - 1;
		while (first < last) {
			char a = s[first];
			s[first++] = s[last];
			s[last--] = a;

		}
	}

	public static void main(String[] args) {
		char[] s = { 'h', 'e', 'l', 'l', 'o' };
		int first = 0;
		int last = s.length - 1;
		while (first < last) {
			char a = s[first];
			s[first++] = s[last];
			s[last--] = a;
		}
		System.out.println(s);
	}
}
