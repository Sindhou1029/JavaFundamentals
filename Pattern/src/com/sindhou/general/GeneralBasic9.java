package com.sindhou.general;
//customer BankAccount

class BankAccount
{
	private int accNo;
	private String name;
	private double balance;
	
	private static String bankName;  //stored once, shared by all objects
	
	
	static
	{
		bankName="Sindhou Bank";
		System.out.println("The bank Name is  " + bankName);
	}
	
	BankAccount( int accNo, String name, double balance)
	{
		this.accNo =accNo;
		this.name =name;
		this.balance=balance;
	}
	
	void deposit (double amount)
	{
		balance = (balance + amount);
		System.out.println(name+ " current balance is " + balance);
	}
	
	void deposit(double amount , String mode)
	{
		balance =(balance + amount);
		System.out.println(name+ " current balance is " + balance  + " deposited via " + mode);
	}
	
	
	}


public class GeneralBasic9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount ba =new BankAccount(45678,"Murali",50000);
		BankAccount ba1 =new BankAccount(45678,"shanthi",60000);
		BankAccount ba2 =new BankAccount(45678,"Muthu",70000);
		
		
		ba.deposit(40000);
		ba1.deposit(40000,"cheque");
		ba2.deposit(30000);
		
	}
	

}

