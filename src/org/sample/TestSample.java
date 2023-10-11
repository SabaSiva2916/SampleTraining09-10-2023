package org.sample;

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
    }
}
