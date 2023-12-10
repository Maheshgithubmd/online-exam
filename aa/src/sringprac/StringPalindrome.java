package sringprac;

public class StringPalindrome {
	public static void main(String[] args) {
		String string = "madam";
		String rev = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			rev = rev + string.charAt(i);

		}
		if (string.equals(rev)) {
			System.out.println("String  is palindrome");
		} else {
			System.out.println("string is not paindrome");
		}
	}
}
