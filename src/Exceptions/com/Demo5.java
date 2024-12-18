package Exceptions.com;

public class Demo5 {
	int d=20;
	public static void main(String[] args) {
		try
		{
			int a=10/0;
			/*Demo5 obj=new Demo5();
			obj=null;
			System.out.println(obj.a);*/
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			System.out.println("Good");
		}

	}

}
