package com.sindhou.general;

abstract class AeroPlane
{
	public abstract void takeoff();
	public abstract void fly();
	
	public void landing()
	{
		System.out.println("Aeroplane is landing");
	}
}

class CargoPlane extends AeroPlane
{
	public void takeoff()
	{
		System.out.println("Cargoplane takeoff");
	}
	
	public void fly()
	{
		System.out.println("cargoplane flying"); 
	}
}

class FighterPlane  extends AeroPlane
{
	public void takeoff()
	{
		System.out.println("FighterPlane takeoff");
	}
	
	public void fly()
	{
		System.out.println("FighterPlane flying"); 
	}
}

class CommercialPlane  extends AeroPlane
{
	public void takeoff()
	{
		System.out.println("CommercialPlane takeoff");
	}
	
	public void fly()
	{
		System.out.println("CommercialPlane flying"); 
	}
}

class Airport 
{
	public void permit(AeroPlane a)
	{
		a.takeoff();
		a.fly();
		a.landing();
	}
}
public class GeneralBasic17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CargoPlane cp = new CargoPlane();
		CommercialPlane c = new CommercialPlane();
		FighterPlane fp =new FighterPlane();
		
		Airport a = new Airport();
		
		a.permit(fp);
		System.out.println("______________________________");
		a.permit(cp);
		System.out.println("______________________________");
		a.permit(c);
	}

}
