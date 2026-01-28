package com.sindhou.pattern;

public class PatternBasics9 {

	public static void main(String[] args) {
		
		int i,j;
		int n=5;
		for (j=0; j<n; j++)
		{
			
		// H
			for(i=0;i<n; i++)
			{
				if (i==0 || i==n-1 || j==(n-1)/2)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			} System.out.print("  ");
			
			//T 
			 for (i=0; i<n; i++)
			 {
				 if(j==0 || i==(n-1)/2)
				 {
					 System.out.print(" * ");
				 }
				 else
				 {
					 System.out.print("   ");
				 }
			 }System.out.print("  ");
				
				// I
			 for (i=0;i<n;i++)
				{
					if (j==0||j==n-1||i==(n-1)/2 )
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
