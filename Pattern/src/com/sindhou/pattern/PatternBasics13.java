package com.sindhou.pattern;

public class PatternBasics13 {

	public static void main(String[] args) {
		
		int i,j;
		int n=4;
		
		for (j=0; j<n; j++)
		{
			
		for (i=0;i<n;i++)
		{
			if (i==0 || (j>=1 && i==1) || (j>=2 && i==2) || j==3 )
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