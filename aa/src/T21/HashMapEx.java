package T21;

import java.util.HashMap;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap <Integer,String> hm=new HashMap <Integer,String>();
		hm.put(1,"mahesh");
		hm.put(2,"rupesh");
		hm.put(3,"vaibhav");
		hm.put(4,"akash");
		hm.put(5,"prashant");
		//System.out.print(hm);
		hm.forEach((k,v)->System.out.println(k+"   "+v));
	}
}
