package com.codoid;
import java.util.*;
import java.util.Map.Entry;

public class Hashmap {
	public static void main(String[] args) {
		HashMap<String, Integer> both = new HashMap<>();
		both.put("A", 10);             
		both.put("B", 20);              
		both.put("E", 10);            
		both.put("D", 40);
		both.put("C", 50);
	
		Iterator<Entry<String, Integer>> i = both.entrySet().iterator();
		while(i.hasNext()) {                                     
			System.out.println(i.next());                         
		}
		
	}

}
