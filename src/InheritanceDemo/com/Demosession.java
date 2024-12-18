package InheritanceDemo.com;
class A
{
	int a=10;
	void show()
	{
		System.out.println(a);
	}
}
class B extends A
{
	int b=20;
	void display()
	{
		System.out.println(b);
	}
}
public class Demosession {

	public static void main(String[] args) {
		A obj1=new A();
		obj1.show();
		
		B obj2=new B();
		obj2.display();
		obj2.show();

	}

}
