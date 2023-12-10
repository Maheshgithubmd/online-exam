package aa;

import java.lang.reflect.Array;

public class AA {

	public static void main(String[] args) {
		int a[] = { 24, 5, 6, 2 };
		int max = 0;
		for (int i = 0; i <= a.length - 1; i++) {

			if (a[i] > max)
				max = a[i];

		}
		System.out.println(" largest element of givaen array" + max);

	}

}
