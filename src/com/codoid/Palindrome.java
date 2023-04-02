package com.codoid;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		System.out.println("enter the no.");
		int num = ref.nextInt();

		int temp = num;
		int rev = 0, b=0;
        
		
		while (num > 0) {
			 b = num % 10;
			                               
            rev = rev*10+b;
            
            num = num/10;
            
		}
		if(temp == rev){
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
