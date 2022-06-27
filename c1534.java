package test;

public class c1534 {
	public int countGoodTriplets(int[] arr, int a, int b, int c) {
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			int num1 = arr[i];
			for (int j = i+1; j < arr.length; j++) {
				int num2 = arr[j];
				if (Math.abs(num1 - num2) <= a) {
					for (int k = j+1; k < arr.length; k++) {
						int num3 = arr[k];
						if (Math.abs(num2 - num3) <= b && Math.abs(num1 - num3) <= c) {
							res++;
						}
					}
				}
			}
		}
		return res;

	}

	public static void main(String[] args) {
		int a = 7;
		int b = 2;
		int c = 3;
		int res = 0;
		int[] arr = { 3, 0, 1, 1, 9, 7 };
		for (int i = 0; i < arr.length; i++) {
			int num1 = arr[i];
			for (int j = i+1; j < arr.length; j++) {
				int num2 = arr[j];
				if (Math.abs(num1 - num2) <= a) {
					for (int k = j+1; k < arr.length; k++) {
						int num3 = arr[k];
						if (Math.abs(num2 - num3) <= b && Math.abs(num1 - num3) <= c) {
							res++;
						}
					}
				}
			}

		}
		System.out.println(res);
	}
}
