package aa;

import java.util.ArrayList;
import java.util.ListIterator;

public class Az {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Akash");
		list.add("mahesh");
		list.add("vaibhav");
		list.add("prashant");
		ListIterator<String> itr = list.listIterator(list.size());

		while (itr.hasPrevious())
			System.out.println(itr.previous());
	}
}