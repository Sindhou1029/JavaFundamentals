package com.sindhou.general;

import java.util.Scanner;

public class GeneralBasic7 {

	public static void main(String[] args) {
		// armstrong number
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number :" );
		
		int num = sc.nextInt();
		int originalnum =num;
		
	
		int sum =0;
		
	  while (num!=0)
		{
		 	
		 int digit = num% 10;
		 
		sum+= digit*digit*digit;
		num =num/10;
		
				}
		
		if (originalnum==sum)
		{
			System.out.println("The given number is a armstrong number");
		}
		else
		{
			System.out.println("The given number is not a armstrong number");
		}
		sc.close();
	}

}
