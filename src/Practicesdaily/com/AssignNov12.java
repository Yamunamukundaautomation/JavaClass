package Practicesdaily.com;

public class AssignNov12 {
	int a=15;
		
	 void even()
     {         
        int num=5;         
         if(num%2==0)
         
         {    
             System.out.println("This is even number");             
         }
         else
         {
        	 System.out.println("This is odd number"); 
         }         
     
     }
	 
	 int even2(int num)
	 {
		 if(num%2==0)
		 {
			 System.out.println("This is even number");
			 }
		 else
		 {
			 System.out.println("This is odd number");
		 }
		 return num;
	 }
		
	public static void main(String[] args) {
		AssignNov12 obj=new AssignNov12();
		obj.even();
		int result=obj.even2(8);
		System.out.println(result);
		obj.even2(result+1);
		
		
		

	}

}
