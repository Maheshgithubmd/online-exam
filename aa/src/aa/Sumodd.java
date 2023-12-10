package aa;
//wap max using inhance for loop
public class Sumodd {
	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 6, 3, 9, 7 };
		// int n = a.length - 1;
		// int temp=0;
		
		int max = 0;
		for (int a1 : a) {
			//max = a[0];
			if (a1 > max) {
				max = a1;
			}
		}
		System.out.println(max);

	}
}
