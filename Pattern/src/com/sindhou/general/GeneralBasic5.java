package com.sindhou.general;

import java.util.Scanner;

public class GeneralBasic5 {

	public static void main(String[] args) {
		// Fibonacci series
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number :" );
		
		int num = sc.nextInt();
		
		int a=0,  b=1; 
		System.out.print("Fibonaci series: " + a + " " +b + " ");
		
		for (int i=3; i<=num; i++)
			
		{
			
	int c= a+b;
	System.out.print( c + " ");
	a=b;
	b=c;
			}
		sc.close();
	}

}
