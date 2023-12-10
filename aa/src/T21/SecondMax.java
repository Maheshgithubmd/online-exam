package T21;

import javax.xml.transform.Templates;

public class SecondMax {

	public static void main(String[] args) {
		int []arr= {5,7,3,1,9,4,8,6};
		int n=arr.length;
		for(int i=0;i<=n;i++) {
			for(int j=i+1;j<=n-1;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("****************");
		System.out.println("second largest is "+(arr[arr.length-2]));
	}
}
