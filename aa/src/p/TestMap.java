package p;

import java.util.LinkedHashMap;

public class TestMap {
	public static void main(String x[]) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(1, "ABC");
		map.put(2, "PQR");
		map.put(3, "STV");
		String s = map.get(4);
		System.out.println(s);
	}
}
