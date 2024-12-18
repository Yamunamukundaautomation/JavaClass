package Polymorphism.com;

public class DemoOnStaticvariables {
	int b=5;
	static int a=10;
	void show1()
	{
		System.out.println("Normal Method");
	}
	static void show2()
	{
		System.out.println("This is Static show Method");
	}
	

	public static void main(String[] args) {
		DemoOnStaticvariables obj=new DemoOnStaticvariables();
		System.out.println(obj.b);//Direct access--variable name
		System.out.println(a);//class_name.variablename
		System.out.println(DemoOnStaticvariables.a);
		obj.show1();
		show2();

	}

}
