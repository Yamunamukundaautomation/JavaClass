package Exceptions.com;

public class DemoNullPointer {
	int a=45;

	public static void main(String[] args) {
		System.out.println("Null Pointer Exception");
		 DemoNullPointer obj=new  DemoNullPointer();
		 obj=null;
		 try
		 {
		 System.out.println(obj.a);
		 }
		 catch(RuntimeException e)
		 {
			  
		 }
		 System.out.println("Thanks");
		 

	}

}
