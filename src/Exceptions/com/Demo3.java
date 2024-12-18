package Exceptions.com;

public class Demo3 {
	int a=10;

	public static void main(String[] args) {
		try
		{
			int a=10/0;
		}
		catch(Exception e)
		{
			
		}
		try
		{
			Demo3 obj=new Demo3();
			obj=null;
			System.out.println(obj.a);
		}
        catch(Exception b)
		{
        	
		}
		finally
		{
			System.out.println("Great");
		}
	}

}
