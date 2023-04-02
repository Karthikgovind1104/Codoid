package com.codoid;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateInArrayList {
	public static void main(String[] args) {

		ArrayList<Integer> in = new ArrayList<>();
		in.add(10);
		in.add(20);
		in.add(30);
		in.add(40);
		in.add(20);
	
		System.out.println("With Duplicates : "+in);
		
		Set<Integer> s = new LinkedHashSet<Integer>(in);
		in.clear();
		in.addAll(s);
		System.out.println("Without Duplicates : "+in);
	}

}
