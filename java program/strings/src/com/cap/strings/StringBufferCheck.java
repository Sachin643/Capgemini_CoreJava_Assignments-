package com.cap.strings;

public class StringBufferCheck {
public static void main(String[] args) {
	
	
	String s =new String("Naga");
	
	s=s.concat("venkata");
	
	StringBuffer sb1=new StringBuffer("Naga");
	sb1=sb1.append("venkata");
	StringBuilder sb2=new StringBuilder("Naga");
	sb2=sb2.append("venkata");
}
}
