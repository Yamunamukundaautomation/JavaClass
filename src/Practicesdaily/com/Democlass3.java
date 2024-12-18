package Practicesdaily.com;

public class Democlass3 {
	
	void number()
    {         
       int i=1;         
        while(i<=10)
        
        {    
            System.out.println(i);  
            i++;
        }
    }
	void even()
	{
		int e=2;
		while(e<=50)
		{
			System.out.println(e);
			e=e+2;
			}        
        }
	
	
	public static void main(String[] args) {
		Democlass3 objec=new Democlass3();
		objec.number();
		objec.even();
		
		

	}

}
