package p;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Rajashri");
		hm.put(2, "shital");
		hm.put(3, "Shravani");
		hm.put(4, "Rupesh");
		hm.put(5, "Akash");
		hm.put(6, "Vaibhav");
		hm.put(7, "Mahesh");

		System.out.println(hm);
		hm.forEach((k, v) -> System.out.println(k + "    " + v));
		;

	}
}
