package com.sindhou.general;
class Demo1
{
	int a,b;
	
	Demo1()
	{
		this(4,4);
		System.out.println("Demo zero param constructor");
			}
	
	Demo1(int a , int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Demo1 param constructor");
	}
}
class Demo2 extends Demo1
{
	int x, y;
	
	Demo2()
	{
		System.out.println("Demo2 zero param constructor");
		
	}
	
	Demo2(int x, int y)
	{
		this();
		this.x=x;
		this.y=y;
		System.out.println("Demo2 param constructor");
	}
	
	void disp()
	{
		System.out.println("X  "+ x  + " Y " + y);
		System.out.println("a  "+ a  + " b " + b);
	}
}
public class GeneralBasic13 {

	public static void main(String[] args) {
		Demo2 d2 =new Demo2(4,5);
		d2.disp();

	}

}
