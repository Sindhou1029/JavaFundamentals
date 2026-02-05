package com.sindhou.general;

import java.util.Scanner;

public class GeneralBasic3 {

	public static void main(String[] args) {
		// Reverse a given number
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please Enter a number :" );
				int num =sc.nextInt();	
				
				
	
				
				String reverse = "";

				while (num != 0) {
				    reverse += num % 10;
				    num /= 10;
				}

				System.out.println("Reverse = " + reverse);


             sc.close();
				        
				    }
	
}
				


	


