package aa;

public class SquareInArray {
	public static void main(String[] args) {
		int arr[] = { 90, 4, 16, 64, 9, 5, 81, 25, 8 };
		System.out.println("number whose root is possible");
		for (int j = 0; j < arr.length; j++) {
			int a = arr[j];
			for (int i = 0; i < a; i++) {
				if (i * i == a) {
					for (int k = 0; k < arr.length; k++) {
						if (arr[k] == i) {
							System.out.println(" " + a);
						}

					}
				}

			}

		}
	}

}
