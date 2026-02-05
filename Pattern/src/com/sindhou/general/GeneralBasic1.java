package com.sindhou.general;

import java.util.Scanner;

public class GeneralBasic1 {

	public static void main(String[] args) {
		// Even or Odd
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please Enter a number :" );
				int num =sc.nextInt();	
				
				
		if (num%2==0)
		{
			System.out.println(" Given number is a even number");
		}
		else 
		{
			System.out.println(" Given number is a odd number ");
		}
	     sc.close();
	}

}
