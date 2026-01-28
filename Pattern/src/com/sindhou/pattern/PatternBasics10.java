package com.sindhou.pattern;

public class PatternBasics10 {

	public static void main(String[] args) {
		
		int i,j;
		int n=5;
		
		for(j=0; j<n; j++)
		{
			for (i=0; i<n; i++)
			{
				if(i==0 || (j==0 && i<n-1) ||(j==n-1 && i<n-1)|| (i==4 && j>0 && j<n-1) )
				//if (i==0 || j==0 && i==0 || j==0 && i==1 || j==0 && i==2 || j==0 && i==3 || j==4 && i==0 || j==4 && i==1 || j==4 && i==2 || j==4 && i==3 || j==1 && i==4 || j==2 && i==4 || j==3 && i==4 )
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			} System.out.println();
		}

	}

}
