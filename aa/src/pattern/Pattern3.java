package pattern;

public class Pattern3 {
	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				if (j > 1 || j<2 && i<1 || i>2) {

					System.out.print(" # ");
				} else {
					System.out.print(" * ");
				}
			}

			System.out.println(" ");

		}
	}
}
