package aa;

public class Armstrong {
	public static void main(String[] args) {
		int no = 153;
		int rem = 0;
		int sum = 0;
		int c = no;
		while (no > 0) {
			rem = no % 10;
			sum = sum + (rem * rem * rem);
			no = no / 10;

		}
		if (c==sum) {
			System.out.println("no is armstrong");
		} else {
			System.out.println("no is not armstrong");
	}
}
}