package Abstract.com;
abstract class Techmentor
{
	void loginpage()
	{
		System.out.println("Login is Successful");
	}
	void homepage()
	{
		System.out.println("This is Homepage");
	}
	abstract void courses();
	abstract void certification();
	Techmentor()
	{
		System.out.println("This is Constructor");
	}
	static
	{
		System.out.println("This is a online Traing");
	}
}
 class HubApplications extends Techmentor
{
	void courses()
	{
		System.out.println("This are the Courses");
	}
	void certification()
	{
		System.out.println("This is the Certification");
	}
	
}

public class Demo1 {

	public static void main(String[] args) {
		HubApplications obj=new HubApplications();
		obj.loginpage();
		obj.homepage();
		obj.certification();
		obj.courses();
		
	}

}
