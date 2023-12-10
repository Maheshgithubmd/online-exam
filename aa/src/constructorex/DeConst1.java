package constructorex;

public class DeConst1 {
	int id, marks;

	DeConst1(int id,int marks) {
		this.id=id;
		this.marks=marks;

	}

	Void dispaly() {
		System.out.println("id:" + id);
		System.out.println("marks:"+  marks);
		return null;

	}

	public static void main(String[] args) {
		DeConst1 obj = new DeConst1(101,90);
		obj.dispaly();

	}

}
