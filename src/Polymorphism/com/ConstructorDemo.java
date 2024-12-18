package Polymorphism.com;

public class ConstructorDemo {
	String name;
	int age;
	ConstructorDemo()
	{
		System.out.println("This is a  default constructor");
		}
	ConstructorDemo(String name, int age)
	{
		this.name=name;
		this.age=age;
		
		System.out.println("This is adefault constructor");
		System.out.println("The value of name is"+"---"+"The value of age is"+age);
	}
	ConstructorDemo(String a1)
	{
		name=a1;
		System.out.println("This is the default Constructor");
		System.out.println("The value of name is"+name);
	}

	public static void main(String[] args) {
		ConstructorDemo objname=new ConstructorDemo();
		objname.name="abc";
		objname.age=10;
		System.out.println(objname.name+":"+objname.age);
		ConstructorDemo objname1=new ConstructorDemo("xyz",10);
		
		ConstructorDemo objname2= new ConstructorDemo("xyz");

	}

}
