package com.sindhou.general;

class Telusko
{
	void course()
	{
		System.out.println("visit telusko.com");
	}
}

class Alpha extends Telusko
{
	int age;
	private String name;
	
	
	void disp()
	{
		System.out.println("This is a live Java Sprin boot class");
	}
}

class Beta extends Alpha
{
	
	void show()
	{
		age=18;
		System.out.println(age);
	}
}
public class GeneralBasic11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alpha beta =new Beta();
		
		beta.course();
		beta.disp();
	}

}
