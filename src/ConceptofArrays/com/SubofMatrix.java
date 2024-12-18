package ConceptofArrays.com;

public class SubofMatrix {
	static int[][]sub(int a[][],int b[][])
	{
		int rows=a.length;
		int col=a[0].length;
		int result[][]=new int[rows][col];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				result[i][j]=a[i][j]-b[i][j];
			}
			System.out.println();
		}
		return result;
	}

	public static void main(String[] args) {
		int a[][]= {{7,8,9},
				    {8,7,6},
				    {9,8,5}};
		int b[][]= {{5,4,3},
				    {3,4,6},
				    {8,8,1}};
		int result[][]=sub(a,b);
		for(int[] p:result)
		{
			for( int q:p)
			{
				System.out.print(q+" ");
			}
			System.out.println();
		}
		

	}

}
