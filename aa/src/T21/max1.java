package T21;

public class max1 {
	public static void main(String[] args) {
		int[] a = { 6, 1, 45, 34, 78 };
		int max = 0;
		for (int i = 0; i <= a.length-1; i++) {
			if (max < a[i]) {
				max = a[i];

			}
		}
		System.out.println("maximum " + max);

	}

}