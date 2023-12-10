package aa;

public class A {
	public static void main(String[] args) {
		String[] str = { "java", "by", "kiran" };
		String[] str1 = { "java", "Experienced", "by" };
		for (int i = 0; i <= str.length - 1; i++) {
			for (int j = 0; j <= str1.length - 1; j++) {
				if (str[i] == str1[j]) {
					System.out.println(str[i]);
				}
			}

		}
	}

}
