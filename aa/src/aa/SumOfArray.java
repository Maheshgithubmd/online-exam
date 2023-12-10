package aa;

public class SumOfArray {
	  public static void main(String[] args) {
	        int a[]={9,2,4,5,3,1},
	        sum=0;
	        for(int i=0;i<a.length;i++){
	            sum=sum+a[i];
	        }
	        System.out.println("approach one "+sum);
	        
	        int sums=0;
	        for(int e:a) {
	        	sums=sums+e;
	        }
	        System.out.println("approach Two "+sums);
	    }

}
