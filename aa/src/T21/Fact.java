package T21;

public class Fact {
public static void main(String[] args) {
	
	int no=6;
	int fact=1;
	for(int i=no;i>=1;i--) {
		fact=fact*i;
		
	}
	System.out.println("factorial of "+  no + "is"+fact);
}
}
