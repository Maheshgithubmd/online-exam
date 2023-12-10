package constructorex;

public class ParaConst1 {
	int a,b;
	ParaConst1(int a,int b){
		
	}
	 void dispaly() {
		 System.out.println("sum:"+a+b);
		
	}
	 public static void main(String[] args) {
		ParaConst1  const1=new ParaConst1(100,200);
		const1.dispaly();
	}

}

