package aa;

public class LagestNo {
	public static void main(String[] args) {
		int arr[] = { 3, 7, 40, 15, 25, 37, 89 };
		int max = 0;
		for (int i = 0; i <= arr.length-1; i++) {
			if (arr[i] > max)
				max = arr[i];

		}
		System.out.println("First largest no " +max);
		
	}
}
