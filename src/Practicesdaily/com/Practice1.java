package Practicesdaily.com;

import InheritanceDemo.com.DemoOverriding.Mobile;
import InheritanceDemo.com.DemoOverriding.Telephone;
import InheritanceDemo.com.DemoOverriding.WockyTocky;

public class Practice1 {
	class Telephone
	{
		Telephone()
		{
			System.out.println("Generation1");
		}
		void menu()
		{
			System.out.println("Parent");
			
		}
	}
	class Mobile extends Telephone
	{
		Mobile()
		{
			System.out.println("Generation2");
		}
		void menu()
		{
			System.out.println("Child");
			
		}
	}
	class WockyTocky extends Mobile
	{
		WockyTocky()
		{
			System.out.println("Generation3");
		}
		{
			System.out.println("Generation2");
		}
		void menu()
		{
			System.out.println("Child2");
			
		}
	}

	public static void main(String[] args) {
		Mobile obj=new WockyTocky();
		obj.menu();

	}

}
