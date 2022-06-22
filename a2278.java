package test;

public class a2278 {
	/*
	 * 给你一个字符串 s 和一个字符 letter ，返回在 s 中等于 letter 字符所占的 百分比 ，向下取整到最接近的百分比。
	 */
	public int percentageLetter(String s, char letter) {
		int n = s.length();
        int cnt = 0;
        for (int i = 0; i < s.length(); i ++)
        {
            if (s.charAt(i) == letter)
            {
                cnt ++;
            }
        }
        int res = (int)((double)cnt / n * 100);
        return res;
    }

}
