package Polymorphism.com;

public class DemoClass {
	
	void mul(float a, float b)
	{
		float mul=a*b;
		System.out.println(mul);
	}
	void mul(float a, float b,float c)
	{
		float mul=a*b*c;
		System.out.println(mul);
	}
	void mul(float a, float b,int c, int d)
	{
		float mul=a*b*c*d;
		System.out.println(mul);
	}



	public static void main(String[] args) {
		DemoClass object=new DemoClass();
		object.mul(2.0f,2.0f);
		object.mul(2.0f,2.0f,1.0f);
		object.mul(2.0f,2.0f,1,3);
	}

}
