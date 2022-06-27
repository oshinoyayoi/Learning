package test;

public class c1704 {
	public boolean halvesAreAlike(String s) {
		String exm = "aeiouAEIOU";
		int a1 = 0;
		int a2 = 0;
		for (int i = 0; i < s.length() / 2; i++) {
			if (exm.indexOf(s.charAt(i)) != -1)
				a1++;
			if (exm.indexOf(s.charAt(i + s.length() / 2)) != -1)
				a2++;

		}
		return a1 == a2;

	}

	public static void main(String[] args) {
		String s = "book";
		String exm = "aeiouAEIOU";
		int a1 = 0;
		int a2 = 0;
		for (int i = 0; i < s.length() / 2; i++) {
			if (exm.indexOf(s.charAt(i)) != -1)
				a1++;
			if (exm.indexOf(s.charAt(i + s.length() / 2)) != -1)
				a2++;

		}
		System.out.println(a1 == a2);

	}
}
