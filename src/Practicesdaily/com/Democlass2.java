package Practicesdaily.com;

public class Democlass2 {
	
	void add()
	{
		int a=22;
		int b=11;
		int add=a+b;
		System.out.println(add);
	}
	
	void mul()
	{
		long e=22L;
		long f=11L;
		long mul=e*f;
		System.out.println(mul);
	}
	
	void sub()
    {
       float a=10.0f;
        float b=5.0f;
        float sub=a-b;
        System.out.println(sub);
        
    }
	
	

	public static void main(String[] args) {
		Democlass2 object=new Democlass2();
		object.add();
		object.sub();
		object.mul();
		
		

	}

}
