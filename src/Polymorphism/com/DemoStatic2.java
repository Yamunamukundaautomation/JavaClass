package Polymorphism.com;

public class DemoStatic2 {
	static int count=0;
	void show1()
	{
		System.out.println("normal method");
	}
	static void show2(int a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		System.out.println(count);
		show2(10);
		DemoStatic2 object=new DemoStatic2();
		object.show1();
		

	}

}
