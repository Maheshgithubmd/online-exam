package T21;

public class AbcPatt {
	public static void main(String[] args) {
		int alphabet = 65;
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (alphabet + j) + " ");
			}
			System.out.println();
		}
	}

}



//	
//		for (char i = 'A'; i <= 'E'; i++) {
//			for (char j = 'A'; j<=i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}