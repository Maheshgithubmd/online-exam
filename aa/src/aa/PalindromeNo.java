package aa;

public class PalindromeNo {
	public static void main(String[] args) {
		int no = 131;
		int rem = 0;
		int sum = 0;
		int c = no;
		while (no > 0) {
			rem = no % 10;
			sum = sum * 10 + rem;
			no = no / 10;

		}
		if (sum == c) {
			System.out.println("no is palindrome");
		} else {
			System.out.println("no is not palindrome");
		}
	}
}
