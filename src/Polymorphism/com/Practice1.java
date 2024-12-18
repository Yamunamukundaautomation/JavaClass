package Polymorphism.com;

public class Practice1 {
	void click(String singleclick)
	{
	System.out.println("Techmentorhub");	
	}
	void click(String singleclick,int a)
	{
		System.out.println("method3");
	}
	void click(String singleclick, char c)
	{
		System.out.println("xyz");
	}
	void click(String singleclick,String inputValue)
	{
	 System.out.println("method1");	
	}
	
	

	public static void main(String[] args) {
		Practice1 obj=new Practice1();
		obj.click("abc");
		obj.click("abc",10);
		obj.click("abc",'c');
		obj.click("abc","10");

	}

}
