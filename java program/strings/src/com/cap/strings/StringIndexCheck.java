package com.cap.strings;

public class StringIndexCheck {

	public static void main(String[] args) {
		
		String s="welcome to my new company";
		
		System.out.println(s.indexOf('m'));
		System.out.println(s.lastIndexOf('m'));
		System.out.println(s.indexOf('m',7));
		System.out.println(s.contains("p"));
		System.out.println(s.contains("z"));
		System.out.println(s.isEmpty());
		String s1=" ";
		System.out.println(s1.isEmpty());
		String s2=" ";
		System.out.println(s2.isEmpty());
	}

}
