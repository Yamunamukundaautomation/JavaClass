package Practicesdaily.com;

public class ClassDemo {
	
	//Data Methods
	//1. No return type,no input
	void add()
	{
		int a=1;
		int b=2;
		int sum=a+b;
		System.out.println(sum);
	}
	//2.some return type, no input
	int mul()
	{
		int c=5;
		int d=2;
		int e=c*d;
		return e;
	}
	//3.some return type, some input
	int sub(int s1,int s2)
	{
		int sub=s1-s2;
		return sub;
		
	}
	//4.No return type, some input
	void div(int d1,int d2)
	{
		int div=d1/d2;
		System.out.println(div);
	}

	public static void main(String[] args) {
		ClassDemo obj=new ClassDemo();
		obj.add();
		obj.mul();
		
		

	}

}
