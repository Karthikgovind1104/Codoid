package com.codoid;

public class BreakAndContinue {

	public static void break1() {
		for (int i=0; i<=5; i++) {
			if(i==3) {
				break;                                     
			}
			else {
				System.out.println(i);
			}
		}
	}
	public static void continue1() {
		for (int i=0; i<=5; i++) {
			if(i==3) {
				continue;                                     
			}
			else {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		break1();
		//continue1();
	}
	
}
