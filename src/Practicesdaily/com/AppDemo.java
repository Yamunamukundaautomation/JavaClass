package Practicesdaily.com;

public class AppDemo {
	//declare global variable
	String app="Flipkart";
	
	
	
	//local variables
	void getname()
	{	
		String a="Mobiles";		
		String b="Laptops";		
		String c="Electronics";
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	}
	void values()
	{
		int a=50;
		int b=25;
		int sum=a+b;
		System.out.println(sum);
		}
	
	
	public static void main(String[] args) {
		AppDemo obj=new  AppDemo();
		System.out.println(obj.app);
		obj.getname();
		obj.values();

	}

}
