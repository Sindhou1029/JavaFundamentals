package com.sindhou.pattern;

public class PatternBasics12 {

	public static void main(String[] args) {
		int i,j;
		int n=11;
		
		for (j=0; j<n; j++)
		{
			
		for (i=0;i<n; i++)
		{
			if (i==j || (i+j == n-1))
			{
				System.out.print(" * ");
			}
			else
			{
				System.out.print("   ");
			}
		} System.out.print("   ");
		
		for (i=0;i<n; i++)
		{
			if (i==j || (i+j == n-1) || j==0 || j==n-1 || i==0 || i==n-1 )
			{
				System.out.print(" * ");
			}
			else
			{
				System.out.print("   ");
			}
		}System.out.print("   ");
		for (i=0;i<n; i++)
		{
			if ((i+j ==(n-1)/2) || (i-j==(n-1)/2) || (j-i == (n-1)/2) || (j+i == (n-1)+ (n-1)/2) )
				
				
			{
				System.out.print(" * ");
			}
			else
			{
				System.out.print("   ");
			}
		} System.out.print("   ");
		
		for (i=0;i<n; i++)
		{
			if ((i+j<=(n-1)/2) || (i-j>=(n-1)/2) || (j-i >= (n-1)/2) || (j+i >= (n-1)+ (n-1)/2) )
				
				
			{
				System.out.print(" * ");
			}
			else
			{
				System.out.print("   ");
			}
		}System.out.print("   ");
		for (i=0;i<n; i++)
		{
			if ((i+j>=(n-1)/2) && j<=(n-1)/2 && i<=(n-1)/2  || (i-j<=(n-1)/2) && i>=(n-1)/2  &&  j<=(n-1)/2)
				
				
			{
				System.out.print(" * ");
			}
			else
			{
				System.out.print("   ");
			}
		}
		
		System.out.println();

	}

}

}