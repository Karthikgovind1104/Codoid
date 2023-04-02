package com.codoid;
import java.util.*;
public class SwapTwoNos {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the no");
	int num1 = s.nextInt();
	int num2 = s.nextInt();
	

	num1 = num1*num2;                         // 30*20= 600
	num2 = num1/num2;                         // 600/20= 30
	num1 = num1/num2;                         // 600/30 = 20
	
	System.out.println(num1 + "  "+ num2);
	}
}

