package com.sindhou.general;
class Telusko1
{
	int age=10;
	
	void disp()
	
	{
		age=4;
		System.out.println(age);
		System.out.println("Disp of parent");
	}
}

class Alien extends Telusko1
{
	int age=11;
	void disp()
	{
		age=6;
		System.out.println(age);
		System.out.println("Disp of child overridden");
	}
	
	void show()
	
	{
		System.out.println(age);
		
        System.out.println(super.age);
	}
}


public class GeneralBasic12 {
	
	public static void main(String[] args) {
		Telusko1 a = new Alien();
	//Alien a=new Alien();
	//a.show();
	a.disp();
	((Alien) a). show();
}
}