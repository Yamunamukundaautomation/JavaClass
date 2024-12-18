package ConceptofArrays.com;

public class AddofMatrix {
	static int [][] add(int a[][],int b[][])
	{
		int rows =a.length;
		int coloum=a[0].length;
		int result[][]=new int[rows][coloum];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<coloum;j++)
			{
				result[i][j]=a[i][j]+b[i][j];
			}
			System.out.println();
		}
		 return result;
	}

	public static void main(String[] args) {
		 int a[][]= {  {8,3},
                       {4,6}
                    };        
   

   
   int b[][]= {  {8,2},
                 {7,5}
              };    
   
   int result[][]=add(a,b);
   System.out.println("This is result matrix");
   
   for(int []  rrr:result)
   {
       for(int rrrr:rrr)
       {
           System.out.print(rrrr+ " ");
       }
       System.out.println();
   }
  
   
}


	}


