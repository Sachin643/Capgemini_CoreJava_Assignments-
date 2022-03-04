package stringsexample;

import java.util.Scanner;

public class StringsDemo {
	public static void main(String[] args) {
		
		
	Scanner sc=new Scanner(System.in);
	String str="My name is Sachin";
	String quote=new String("Strings in java");
	int count=1;
	
	//*to split the entered string
	String[]words=str.split("\\s");
	for(String w:words)
	{
	System.out.println(w);
	}
	
	//*count number of words
	for(int i=0;i<str.length()-1;i++)
	{
		if((str.charAt(i)==' ') && (str.charAt(i+1)!=' '))
		{
			count++;
		}
	}
	System.out.println("Numbers of words in a string :"+count);
	}
}
