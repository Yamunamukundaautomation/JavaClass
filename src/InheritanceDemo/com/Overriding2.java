package InheritanceDemo.com;
class AAAA
{
	 void abc()
	{
		System.out.println("Parent");
	}
	void xyz()
	{
		System.out.println("Own Method of Parent");
	}
	static void add(int a)
	{
		
	}
	static void add(int a, int b)
	{
		
	}
	static void add(int a, int b, int c)
	{
		
	}
}

class BBBB extends AAAA
{
	@Override
	static void name()
	{
		System.out.println("Child");
	}
	void ghy()
	{
		System.out.println("Own Method of Child");
	}
}







public class Overriding2 {

	public static void main(String[] args) {
	AAAA obj=new AAAA();
	obj.abc();
	
	}

}
