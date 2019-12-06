package com.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mypractice {
	public static void main(String[] args) {
	Pattern p=Pattern.compile(".s");
	Matcher m=p.matcher("as");
	System.out.println(m.matches());
	boolean b2=Pattern.compile(".s").matcher("as").matches();
	System.out.println(b2);
	boolean b3=Pattern.matches(".s","as");
	System.out.println(b3);
		
		/*
		 * boolean b3 = Pattern.matches(".s", "as"); System.out.println(b3);
		 */
		
	}

}
