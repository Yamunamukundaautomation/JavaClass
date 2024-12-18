package ConceptofArrays.com;

public class Demo3 {

	public static void main(String[] args) {
	double d[]= {1.5,2.2,3.3,4.4,5.5,6.1,7.7,8.8,9.9};
	double len=d.length;
	System.out.println("Length of Arrays" +len);
	System.out.println(d[5]);
	System.out.println(d[8]);
	
	System.out.println("Sum of Arrays");
	double sum=0.0;
	for(int i=0;i<d.length;i++)
	{
		sum=sum+d[i];
		
	}
	System.out.println(sum);
	
	double sum1=0.0;
	for(double i=0;i<d.length;i++)
	{
		sum1=d[1]+d[7];
		
	}
	System.out.println(sum1);
	
	}

}
