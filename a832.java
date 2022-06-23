package test;

public class a832 {
	public int[][] flipAndInvertImage(int[][] image) {
		int n=image.length;
		for (int i = 0; i < n; i++) {
			int first=0;
			int last=n-1;
			while (first<last) {
				if (image[i][first]==image[i][last]) {
					image[i][first]^=1;
					image[i][last]^=1;
				}
				first++;
				last--;
			}
			if (first==last) {
				image[i][first]^=1;
			}
		}
		return image;
    }

}
