package com.sindhou.general;



public class GeneralBasic6 {

	public static void main(String[] args) {
		// prime number 
		
	
		
  for (int i=1; i<=100; i++)
  {
	  int count =0;
	 for (int j=1; j<=i; j++)
	 {
		 
		 if (i%j ==0)
		 {
			 count ++;
		 }
	 }
	 
	 if ((count ==2) || i==1 )
	 {
		 System.out.println(i + " is a prime number");
	 }
	 else
		 
	 {
		 System.out.println(i + "it is not a prime number");
	 }
  }
		
	}

}
