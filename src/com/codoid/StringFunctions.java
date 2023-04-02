package com.codoid;

public class StringFunctions {
	public static void main(String[] args) {
		String one = "abc xyz";
		
		int length = one.length();
		System.out.println(length);
		
		String replace = one.replace("xyz", "abc");
		System.out.println(replace);
	}

}
