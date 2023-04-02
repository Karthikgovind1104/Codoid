package com.codoid;

public class Constructor1 {
	public Constructor1() { // Non Parameterized

		System.out.println("ok");

	}

	public Constructor1(int i) { // Parameterized
		
		this();
		System.out.println(i);

	}

	public Constructor1(String s, int a) {
		
		this(54);
		System.out.println(s + "  " + a);

	}

	
	public static void main(String[] args) {
		Constructor1 c = new Constructor1("xyz", 5454);

	}

}
