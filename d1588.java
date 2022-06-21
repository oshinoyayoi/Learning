package test;

public class d1588 {
	public int sumOddLengthSubarrays(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j += 2) {
				for (int n = i; n <= j; n++) {
					sum = sum + arr[n];
				}
			}

		}

		return sum;

	}

}
