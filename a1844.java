package test;

public class a1844 {
	public String replaceDigits(String s) {
		char[] a = s.toCharArray();
		int b = s.length() / 2;
		for (int i = 0; i < b; i++)
			a[i * 2 + 1] = (char) (a[i * 2] + (a[i * 2 + 1] - '0'));// 减去0的ASII码来得到准确数值
		// 例如a[3]=2,那么需要让a[2]+2,但a[3]中的2是字符型，不可以直接被a[2]相加，相加相当于a[2]的ASII码+2的ASII码。
		// 所以需要用2的ASII码-0的ASII码 即a[3]-'0';
		return new String(a);

	}

}
