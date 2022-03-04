package loopsandarrays;

import java.io.*;

public class SplitingMiddleTerm {
	private static final String sc = null;

	public static void main(String[] args) {
		BufferedReader in=(new BufferedReader(System.in));
		int m[]=new int[10];
		int i;
		System.out.println("Enter 10 numbers in the array");
		for (i=0;i<10;i++)
		{
			m[i]=sc.next();
		}
		for (i=0;i<5;i++) {
			int[] n;
			n[i]=m[i];
		}
		for(i=10;i>5;i--)
		{
			int[] k;
			k[i]=m[i];
		}
	}

}
