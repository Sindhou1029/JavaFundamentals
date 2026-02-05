package com.sindhou.general;

import java.util.Scanner;

public class GeneralBasic2 {

	public static void main(String[] args) {
		// Find the sum of first n natural numbers

		Scanner sc = new Scanner(System.in);
		System.out.println(" Please Enter a number :" );
				int num =sc.nextInt();	
				int sum=0;
				for (int i=1; i<=num; i++)
				{
					
					sum +=i;
				}
				
				System.out.println("Sum of n natural numbers :" + sum);
			     sc.close();
	}

}
