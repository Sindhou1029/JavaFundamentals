package com.sindhou.pattern;

public class PatternBasics5 {

	public static void main(String[] args) {
		int i,j;
		int n=5;
		for (j=0; j<n; j++)
		{
			for (i=0; i<n; i++)
			{
				if (j==0 || i==0 || i==n-1|| j== (n-1)/2)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}System.out.println();
		}

	}

}
