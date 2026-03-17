package com.sindhou.general;

class Parent
{
	void Sleep()
	{
		System.out.println("Sleeps a lot");
	}
	
	void dressingstyle()
	{
		System.out.println("Dress like old time");
	}
}

class Child extends Parent
{
	void dressingstyle()
	{
		System.out.println("Dress like our  time");
	}
	
	void habbit()
	{
		System.out.println("Playing shuttle");
	}
}
public class GeneralBasic10 {

	public static void main(String[] args) {
		Parent p =new Child(); // Run time polymorphism
		p.dressingstyle();
		((Child) p).habbit();
	
		
	}

}
