package ConceptofArrays.com;

public class AddingofMatrix {
	
	static int[][] adding(int a[][],int b[][])
    {
        
        
               int rows= a.length;
               int col= a[0].length;
               int result[][] =new int [rows][col];
        
               for(int i=0;i<rows;i++)
                {
                    for(int j=0;j<col;j++)
                    {
                        result[i][j]=a[i][j]+b[i][j];
                    }
                    System.out.println();
                }        
          
        return result;
        
    }
    
	public static void main(String[] args) {
		 int a[][]= {  {8,6},
                       {4,2}
                     };        
      
         int b[][]= {  {4,2},
                       {6,5}
                 };    
   
   int result[][]=adding(a,b);
   System.out.println("This is result matrix");
   
   for(int []  sss:result)
   {
       for(int ssss:sss)
       {
           System.out.print(ssss+ " ");
       }
       System.out.println();
   }
   
   
   
   
   
   

	}

}
