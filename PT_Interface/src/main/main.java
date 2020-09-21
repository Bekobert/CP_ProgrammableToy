package main;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import Background.*;



public class main {

	
	public static void main(String[] args) {
		
		ArrayList<Key> keyz = new ArrayList<Key>();
		
		String_reader str = new String_reader();
		
		seperator spr = new seperator();
		
		try{
		    FileInputStream fstream = new FileInputStream("tab.txt");
		    DataInputStream in = new DataInputStream(fstream);
		    BufferedReader br = new BufferedReader(new InputStreamReader(in));
		    String strLine;
		          
		   while ((strLine = br.readLine()) != null)   {
			   String[] tokens = strLine.split(" ");
			   keyz.add(new Key(tokens[0], Integer.parseInt(tokens[1]), tokens[2].charAt(0)));

		   }
		   
		   in.close();
		   }catch (Exception e){
		     System.err.println("Error: " + e.getMessage());
		   }
		
		for(Key k : keyz) {
			//System.out.println(k.key_id + " " + k.name + " " + k.parameter_no + " " + k.type);
		}
		
		
		/*String s = "decrease(1);\n e = 1;\n e++;\n print(e);";
		String s1 = "decrease(1);";
		
		String s2 = "abi";
		
		
		System.out.println(s);
		
		String[] a = s.split(" ");
		for(String t : a) {
			System.out.println(t);
		}
		System.out.println(s1+s2);*/
		
		String s3 = "a == b + c;"
				+ "if(a == b) {"
				+ "swap(3,2);"
				+ "decrease(3);"
				+ "}"
				+ "increase(4);";
		String s4 = "c = a + b;";
		
		String s5 = "decrease(5);"
				+ "increase(1);"
				+ "swap(3,2);";
		
		for(String s : spr.Corper(s5, keyz)) {
			System.out.println(s);
		}
		
		/*System.out.println(str.returner(s3, keyz).get(0));
		System.out.println(str.returner(s3, keyz).get(1));
		System.out.println(str.returner(s3, keyz).get(2));*/
		
		/*for(String s : spr.seperator(str.returner(s3, keyz).get(0), str.returner(s3, keyz).get(1).charAt(0), Integer.parseInt(str.returner(s3, keyz).get(2))))
		{
			System.out.println(s);
		}*/
		
		//System.out.println(spr.seperator(str.returner(s3, keyz).get(0), str.returner(s3, keyz).get(1).charAt(0), Integer.parseInt(str.returner(s3, keyz).get(2))).length);
		
		//System.out.println(str.returner(s4, keyz).get(0));
		
	}
	
	
}
