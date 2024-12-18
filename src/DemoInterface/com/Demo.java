package DemoInterface.com;
interface AA
{
 abstract void menu();

}
interface BB
{
	abstract void show();
}
class CC implements AA,BB
{
	public void menu()
	{
		System.out.println("AA");
	}
	public void show()
	{
		System.out.println("BB");
	}
}



public class Demo {

	public static void main(String[] args) {
		CC obj =new CC();
		obj.menu();
		obj.show();
		

	}

}
