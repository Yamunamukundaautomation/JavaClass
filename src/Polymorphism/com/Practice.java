package Polymorphism.com;

public class Practice {
	void Boy(String school,int usn)
	{
		System.out.println("Student");
	}
	void Boy(String store,float price)
	{
		System.out.println("Customer");
	}
	int Boy(String travel, String ticket)
	{
		int a=10;
		System.out.println("Passenger");
		return a;
	}

	public static void main(String[] args) {
		Practice obj=new Practice();
		obj.Boy("abc",123);
		obj.Boy("abc",25.40f);
		obj.Boy("abc","atob");

	}

}
