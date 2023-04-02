package com.codoid;

public class ReverseAString {
	public static void main(String[] args) {
		String s = "karthik";
		String[] split = s.split("");
	    String	rev ="";
	    
	    for(int i =s.length()-1;i>=0;i--) {
	    	rev = rev+split[i];
	    }
	    System.out.println(rev);
	}

}
