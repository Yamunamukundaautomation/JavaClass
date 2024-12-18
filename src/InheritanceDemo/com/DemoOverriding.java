package InheritanceDemo.com;


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
		void abc()
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
		void xyz()
		{
			System.out.println("P2");
			
		}
	}
	class WockyTocky extends Mobile
	{
		WockyTocky()
		{
			System.out.println("Generation3");
		}
		
		void menu()
		{
			System.out.println("Child2");
			
		}
		void ghy()
		{
			System.out.println("P3");
			
		}
	}

	
class DemoOverriding
{
	public static void main(String[] args) {
		Telephone obj=new Mobile();
		obj.menu();
		Telephone obj2=new Telephone();
		obj2.menu();
		obj2.abc();
		Mobile obj3=new Mobile();
		obj3.menu();
		obj3.xyz();
		obj3.abc();
		WockyTocky obj4=new WockyTocky();
		obj4.menu();
		obj4.ghy();
		obj4.abc();
		obj4.xyz();

	}	




}