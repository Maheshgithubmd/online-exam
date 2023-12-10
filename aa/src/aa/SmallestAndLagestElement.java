package aa;

public class SmallestAndLagestElement {
	public static void main(String[] args) {
		int[] a = { 3, 2, 6, 1, 9, 4, 8, 5, 7 };
		int n = a.length - 1;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i <= n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("smallest number : " + a[0]);
		System.out.println("second smallest : " + a[1]);
		System.out.println("maximum : " + (a.length));
		System.out.println("second maximum : " + (a.length - 1));
	}

}
