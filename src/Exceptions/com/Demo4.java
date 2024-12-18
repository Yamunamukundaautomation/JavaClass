package Exceptions.com;

public class Demo4 {

	public static void main(String[] args) {
		System.out.println("Hi");
		System.out.println("Good Morning");
		try
		{
			int a=20/0;
		}
		catch(Exception e)
		{
			//e.printStackTrace();
		}
		finally
		{
			System.out.println("Have a Nice Day");
		}
		System.out.println("Every One");

	}

}
