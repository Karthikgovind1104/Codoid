package com.codoid;
import java.util.*;
import java.util.Map.Entry;
public class lnkdHashMap {
	public static void main(String[] args) {
		Map<Integer, String> emp = new LinkedHashMap<>();
		emp.put(1, "car");
		emp.put(2, "bike");
		emp.put(4, "bike");
		emp.put(3, "train");
		emp.put(null, "zz");
		
		System.out.println(emp);
		Iterator<Entry<Integer, String>> i = emp.entrySet().iterator();
		while(i.hasNext()) {                                     
			System.out.println(i.next());                         
		}
		
	}

}
