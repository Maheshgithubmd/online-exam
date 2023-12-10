package T21;

public class ArrayComman {
	public static void main(String[] args) {
		String[] array = { "java", "by", "kiran" };
		String[] arr2 = { "Java", "Experienced", "By" };
		for(int i=0;i<=array.length-1;i++) {
			for(int j=0;j<=arr2.length-1;j++) {
				if(array[i]==arr2[j]) {
					System.out.println(array[i]);
				}
			}
			
		}
	}
}
