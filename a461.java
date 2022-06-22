package test;

public class a461 {
	/*两个整数之间的 汉明距离 指的是这两个数字对应二进制位不同的位置的数目。
      给你两个整数 x 和 y，计算并返回它们之间的汉明距离。
	*/
	public int hammingDistance(int x, int y) {
		//bitCount实现的功能是计算一个（byte,short,char,int统一按照int方法计算）int,long类型的数值在二进制下“1”的数量。
        return Integer.bitCount(x^y);
    }

}
