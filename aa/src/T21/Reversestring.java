package T21;

public class Reversestring {

	public static void main(String[] args) {
		String string = "The kiran acadamy";
		String[] a = string.split(" ");

		for (int i = a.length - 1; i >= 0; --i) {

			System.out.print(a[i] + " ");
		}

	}

}
