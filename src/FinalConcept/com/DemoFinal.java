package FinalConcept.com;
class AAA
{
	int c=10;
		final int a=20;
	void show()
	{
	System.out.println("Normal Method");
	}
	final void menu()
	{
		System.out.println("Final Method We can't Re-write");
	}
	
}
class BBB extends AAA
{
	@Override
	void show()
	{
		System.out.println("Normal Method");	
	}
}

public class DemoFinal {

	public static void main(String[] args) {
		BBB obj=new BBB();
		System.out.println(obj.c);
		System.out.println(obj.c=15);
		System.out.println(obj.a);
		obj.show();

	}

}
