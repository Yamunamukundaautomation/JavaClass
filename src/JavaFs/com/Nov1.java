package JavaFs.com;

public class Nov1 {

	public static void main(String[] args) {
		
		double balance=10000.0;
		double withdrawalAmount=2000.0;
		if(withdrawalAmount<=balance)
		{
			System.out.println("your Transaction is Approved");//Answer
		}
		else
		{
		 System.out.println("you have insufficent balance");
			
		}
		 int a=10;
		 int b=11;
		 System.out.println("The value of a is +a");//the value of a is +a
		 System.out.println("The value of a is +b");//the value of a is +b
		// 
		 if(a==b)
		 {
			 System.out.println("The value of a and b are same");
		 }
		 else
		 {
			 System.out.println("The value of a and b are notsame");//Answer
		 }
		 //
		 
		 if(a!=b)
		 {
			 System.out.println("The value of a and b are not same");//Answer
		 }
		 else
		 {
			 System.out.println("The value of a and b are same");
		 }
		
		 String userName="admin";
		 String passWord="admin";
		 if(userName==passWord)
		 {
			 System.out.println("same");//Answer
		 }
		 else
		 {
			 System.out.println("not same");
		 }
		 
		 
		 System.out.println("**************When you compare the strings***********");
		 if(userName.equals("admin")&& passWord.equals("admin123"))
		 {
			 System.out.println("Login Successful");
		 }
		 else
		 {
			 System.out.println("invalid credentials");//Answer
		 }
		 String userName1="admin";
		 String passWord1="admin123";
		 
		 if(userName1.equals("admin")&& passWord1.equals("admin123"))
		 {
			 System.out.println("Login Successful");//Answer
		 }
		 else
		 {
			 System.out.println("invalid credentials");
		 }
		 
		 System.out.println("*****nested if-else*****");
		 
		 String browser="Opera";
		 if(browser.equals("Chrome"))
		 {
			 System.out.println("Opening chrome browser");
		 }
		 else if(browser.equals("firefox"))
		 {
		System.out.println("Opening firefox browser");	 
		 }
		 else if(browser.equals("safari"))
		 {
		System.out.println("Opening safari browser");	 
		 }
		 else if(browser.equals("ie"))
		 {
		System.out.println("Opening ie browser");	 
		 }
		 else if(browser.equals("Opera"))
		 {
		System.out.println("Opening opera browser");	//Answer 
		 }
		 else
		 {
			 System.out.println("Plz pass the correct browser name");
		 }
		 
		 //*****************************************************
		 int num=0;
		 if(num>0)
		 {
			 System.out.println("Positive num");
		 }
		 else if(num<0)
		     {
		    	 System.out.println("Negative num");
		     }
		 else
		 {
			 System.out.println("Thanks");//Thanks
		 }
		 
		 //*********
		  int num1=99;
		  if(num1>0)
		  {
			  System.out.println("Positive Num");
			   if(num1<100)
			   {
				   System.out.println("lessthan 100");
				   if(num1%2==0)
				   {
					   System.out.println("even number");
				   }
				   else
				   {
					   System.out.println("odd number");
				   }
			   }
			   else if(num1==100)
			   {
				   System.out.println("Same value");
			   }
		  }
		  else
		  {
			  System.out.println("Thanks");
		  }
		 
		 	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
