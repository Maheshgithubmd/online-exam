package sringprac;

public class StringPro {
	public static void main(String[] args) {
		 String s1=new String("MAHESH");
		  String s2="MAHESH";
		  
		  System.out.println(s1.equals(s2));
		  System.out.println(s2.charAt(1));
		  System.out.println(s2.length());
		  System.out.println(s2.isEmpty());
		  System.out.println(s2.concat("Java"));
		  System.out.println(s2.replace('A','d'));
		  System.out.println(s2.substring(3));
		  System.out.println(s2.indexOf('S'));
		  System.out.println(s2.equalsIgnoreCase("mahesh"));
		  System.out.println(s2.toLowerCase());
		  System.out.println(s2.compareTo(s1));
		  System.out.println(s2.endsWith("H"));
		  System.out.println(s2.getBytes());
		  System.out.println(s2.startsWith("A"));
		  

		 }
	}


