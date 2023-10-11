package org.sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestSample {

    public static void main(String[] args) {
	System.out.println("Hello World");
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
