package test;

public class c55 {
	public int getMinimumTime(int[] time, int[][] fruits, int limit) {
		int total = 0;
		for (int i = 0; i < fruits.length; i++) {
			total+=((fruits[i][1]+limit-1)/limit)*time[fruits[i][0]];
			}
		return total;
		}
		
	

	public static void main(String[] args) {
		int total = 0;
		int[] time = { 1 };
		int[][] fruits = { { 0, 3 }, { 2, 5 } };
		int limit = 2;
		for (int i = 0; i < fruits.length; i++) {
			total+=((fruits[i][1]+limit-1)/limit)*time[fruits[i][0]];
			}
		
		

		System.out.println(total);
	}
}


