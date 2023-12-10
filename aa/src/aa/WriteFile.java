package aa;

import java.io.FileWriter;

public class WriteFile {
	public static void main(String[] args) {
		try{    
	           FileWriter fw=new FileWriter("E:\\mahesh.txt");    
	           fw.write("Welcome to this file.");    
	           fw.close();    
	          }catch(Exception e){System.out.println(e);}    
	          System.out.println("Success...");    
	}

}
