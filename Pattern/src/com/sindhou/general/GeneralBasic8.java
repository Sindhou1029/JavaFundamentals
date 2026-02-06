package com.sindhou.general;

import java.util.Scanner;

// Basic Loan application

class Farmer
{
	private float amount;
	private float si;
	private float tenure;
	private static float roi;


static 
{
	roi =4.5f;
}

void input(Scanner ac)
{
	//Scanner sc = new Scanner(System.in);
	System.out.println("Kindly enter the required loan amount");
	amount=ac.nextFloat();
	
	System.out.println("Kindly enter the time needed");
	tenure=ac.nextFloat();
	//sc.close();
}
void compute()
{
	si=(amount*tenure*roi)/100.0f;
}

void display()
{
	System.out.println("SI is " + si);
}
static void  show()
{
	System.out.println("loan app logged of ");
}

}

public class GeneralBasic8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Farmer f1 =new Farmer();
		Farmer f2 =new Farmer();
		Farmer f3 =new Farmer();
	System.out.println("Farmer 1 kindly enter the details");	
		f1.input(sc);
		f1.compute();
		f1.display();
		
		System.out.println("Farmer 2 kindly enter the details");	
		f2.input(sc);
		f2.compute();
		f2.display();
		
		System.out.println("Farmer 3 kindly enter the details");	
		f3.input(sc);
		f3.compute();
		f3.display();
		
		Farmer.show();
		sc.close();
	}

}
