package com.cap.pakA;

public class classB {
	
	private static classB classB;
	
	private classB() {
		
	}
public static classB getInstance() {
	if(classB==null)
	{
		classB=new classB();
	}
	return classB;
}

}
