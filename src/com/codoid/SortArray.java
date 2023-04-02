package com.codoid;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		 int []array = {12,22,88,45,1};
		 Arrays.sort(array);
		for(int i=0;i<array.length;i++) {
			 System.out.print(array[i]+" ");
		}
	}
}
