package com.sindhou.pattern;

public class PatternBasics4 
{

	public static void main(String[] args) {
		
		
		int i;
		for (int j=0;j<5;j++)
		{
			for (i=0; i<5; i++)
			{
				if (i==0 || j==0 || i==4 || j==4)
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