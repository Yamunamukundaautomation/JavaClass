package Polymorphism.com;

public class DemoOnOverloading {
	void login()
	{
		System.out.println("Login Successfull");
		System.out.println("Without any creditials i can able to login");
	}
	void login(String uderName)
	{
		System.out.println("with userName creditials i can able to login");
	}
	void login(String userName,String Password)
	{
		System.out.println(userName+"---"+Password);
		System.out.println("with userName and passworscreditials i can able to login");
	}

	public static void main(String[] args) {
		DemoOnOverloading obj=new DemoOnOverloading();
		obj.login();
		obj.login("Mukunda");
		obj.login("Mukunda","Mukunda@123");

	}

}
