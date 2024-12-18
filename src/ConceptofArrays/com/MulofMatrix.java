package ConceptofArrays.com;

public class MulofMatrix {
	static  int[][]mul(int a[][],int b[][])
	{
		int rows=a.length;
		int col=a[0].length;
		int result[][]=new int[rows][col];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				result[i][j]=a[i][j]*b[i][j];
			}
			System.out.println();
		}
		return result;
	}

	public static void main(String[] args) {
		int a[][]= {{4,2,6},
		        {1,2,3}};

		int b[][]= {{4,2,6},
                {1,2,3}};
		int result[][]=mul(a,b);

		for(int[] r:result)
		{
			for(int rr:r)
			{
				System.out.print(rr+" ");
			}
			System.out.println();
			}

	}

}
