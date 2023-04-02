package com.codoid;

import java.util.Arrays;

public class ToFindTwoArraysSame {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int b[] = {1,2,3,4};
		
		boolean equals = Arrays.equals(a, b);
		if(equals == true) {
			System.out.println("arrays are equal");
		}
		else{
		System.out.println("arrays are NOT equal");
		}
	}

}
