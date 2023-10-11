package org.sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestSample {

    public static void main(String[] args) {
	System.out.println("Hello World");
	// Writting Sample codes
		String str = "Java programm";
		String output = "";
		for (int i = str.length() - 1; i >= 0; i--) {
		    char c = str.charAt(i);
		    output = output + c;
		}
		System.out.println(output);

	// creating list adding String values
	List<String> li = new ArrayList<>();
	li.add("java");
	li.add("Selenium");
	li.add("Python");
	li.add("Api Testing");

	Iterator<String> iterator = li.iterator();
	while (iterator.hasNext()) {
	    String string = iterator.next();
	    System.out.println(string);
	}
	
	

    }

}
