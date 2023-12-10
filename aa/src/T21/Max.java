package T21;

public class Max {
	public static void main(String[] args) {

		int[] arr = { 5, 7, 3, 1, 9, 4, 8, 6 };
		int max = 0;
		for (int a : arr) {
			if (max < a) {
				max = a;
			}

		}
		System.out.println(max);
	}
}
