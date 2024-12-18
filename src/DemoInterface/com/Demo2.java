package DemoInterface.com;
interface Webdrive
{
	abstract void searching();
}

class Browser implements Webdrive
{
	public void searching()
	{
		System.out.println("Chrome Brwoser");
	}
}

public class Demo2 {

	public static void main(String[] args) {
		Browser obj=new Browser();
		obj.searching();

	}

}
