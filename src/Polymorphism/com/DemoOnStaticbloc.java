package Polymorphism.com;

public class DemoOnStaticbloc {
	int a=25;
	static int b=10;
	
	void display1()
	{
		int e=20;
		System.out.println("Normal Method");
		
	}
	static void display2()
	{
		System.out.println("Static Method");
	}
	static
	{
		System.out.println("Welcome to Techmentorhub");
		System.out.println("All the Best");
	}
	

	public static void main(String[] args) {
		DemoOnStaticbloc obj=new DemoOnStaticbloc();
		System.out.println(obj.b);
		obj.display1();
		display2();
		

	}

}
