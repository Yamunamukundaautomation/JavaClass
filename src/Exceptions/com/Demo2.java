package Exceptions.com;

public class Demo2 {
	int a=20;

	public static void main(String[] args) {
		try
		{
			Demo2 obj=new Demo2();
			obj=null;
			System.out.println(obj.a);
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		catch(NullPointerException ne)
		{
			//ne.printStackTrace();
		}
		catch(RuntimeException re)
		{
			re.printStackTrace();
		}
		catch(Exception b)
		{
			b.printStackTrace();
		}
		finally
		{
			System.out.println("Thanks");
		}
		

	}

}
