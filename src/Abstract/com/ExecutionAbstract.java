package Abstract.com;
abstract class ABC
{
	void login()
	{
		System.out.println("Login is Successful");
	}
	void menu()
	{
		System.out.println("Menu Options");
	}
	abstract void items();
	abstract void buy();
}
 class XYZ extends ABC
{
	void items()
	{
		System.out.println("Items List");
	}
	void buy()
	{
		System.out.println("Buy");
	}
	
	
}

public class ExecutionAbstract {

	public static void main(String[] args) {
		XYZ obj=new XYZ();
		obj.login();
		obj.menu();
		obj.items();
		obj.buy();
		
		

	}

}
