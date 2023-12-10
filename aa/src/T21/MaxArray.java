package T21;

public class MaxArray {
	public static void main(String[] args) {
		int a[] = { 56, 56, 53, 2, 134, 56, 78, 90 };
		int max = a[0], smax = 0;
		for (int i = 1; i <a.length; i++) {
			if (max < a[i]) {
				max = smax;
				max = a[i];
			}
			if (smax < a[i] && max > a[i]) {
				smax = a[i];
			}

		}
		System.out.println(max+" "+smax);
	}
}
