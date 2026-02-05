package com.sindhou.general;

import java.util.Scanner;

public class GeneralBasic4 {

	public static void main(String[] args) {
		// palindrome
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number :" );
		
		int num = sc.nextInt();
		int originalnum =num;
		
		int reverse = 0;
		
		
		
		while(num !=0)
		{
			int digit = num%10;
			 reverse=reverse*10+digit;
		     num /=10;
			
			}
		sc.close();
	System.out.println(reverse);
		if (originalnum==reverse)
		{
			System.out.println("the given number is palindrome");
		}
		else
		{
			System.out.println("The given number is not a palindrome");
		}
	}

}
