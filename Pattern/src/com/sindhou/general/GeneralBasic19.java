package com.sindhou.general;
interface TELUSKO5
{
	default void course()
	
	{
		System.out.println("telusko Learning");
		ai();
		sd();
		
	}
	
	static void ai()
	{
		System.out.println("ai static method of interface");
	}
	
	
	private void sd()
	{
		System.out.println("System design course");
	}
}

class AI implements TELUSKO5
{
	
}
public class GeneralBasic19 {

	public static void main(String[] args) {
		
		
		TELUSKO5 T = new AI();
		T.course();
		
		
		
		TELUSKO5.ai();
		
		
	}

}
