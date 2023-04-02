package com.codoid;

public class RemoveSplCharactersInString {
	public static void main(String[] args) {
		
		String spl ="!@#$%&*() 123456789abc";
		
		spl =spl.replaceAll("[^a-zA-Z0-9]","" );
		System.out.println(spl);
	}

}
