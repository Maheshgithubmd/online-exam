package aa;

public class Panagram {

	public static void main(String[] args) {
		boolean isTrue = false;
		String str1 = "The quick brown fox jumped over the lazy dog";
		String str = str1.toUpperCase();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 || str.charAt(i) <= 90) {

				isTrue = true;

			} else {
				isTrue = false;
			}

		}
		if (isTrue) {
			System.out.println("String is true");
		} else {
			System.out.println("String is false");
		}

	}
}
