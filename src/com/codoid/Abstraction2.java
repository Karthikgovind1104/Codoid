package com.codoid;

public class Abstraction2 extends Abstraction1 {

	@Override
	public void password() {
		
		System.out.println("abc");
		
	}

	public static void main(String[] args) {
		Abstraction2 ab = new Abstraction2();
		ab.password();
		ab.usermailid();
		
	}
}
