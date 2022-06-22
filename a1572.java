package test;

public class a1572 {
	/*
	 * 给你一个正方形矩阵 mat，请你返回矩阵对角线元素的和。

请你返回在矩阵主对角线上的元素和副对角线上且不在主对角线上元素的和。

	 */
	public int diagonalSum(int[][] mat) {
		int sum=0;
		int len=mat.length;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (i==j||i+j==len-1) {
					sum+=mat[i][j];
				}
			}
		}
		return sum;
		
	}

}
