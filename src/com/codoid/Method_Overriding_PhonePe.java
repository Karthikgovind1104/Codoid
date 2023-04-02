package com.codoid;

public class Method_Overriding_PhonePe extends Method_Overriding_Gpay {
	@Override
	public void payment() {
		
		System.out.println("9000");
		
	}

	public static void main(String[] args) {
		
		Method_Overriding_PhonePe m = new  Method_Overriding_PhonePe();
		 
		 m.payment();
		 m.payment1();
	}

}
