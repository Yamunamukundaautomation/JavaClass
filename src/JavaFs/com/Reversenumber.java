package JavaFs.com;

public class Reversenumber {

	public static void main(String[] args) {
		
System.out.println("*****While loop***********");
		
		/*input=1234
		Output=4321*/
		int num=1234;
		int rev=0;
		while(num!=0)
		{
			int rem=num%10;
			rev =rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);		
		System.out.println("*****DoWhile loop***********");
		int num1=4321;
		int rev1=0;
		do
		{
			int rem1=num1%10;
			rev1 =rev1*10+rem1;
			num1=num1/10;
		}
		while(num1!=0);
		System.out.println(rev1);
		
		System.out.println("****Forloop*****");
		int rev2=0;
		for(int num2=123;num2!=0;num2=num2%10)
		{
			int rem2=num2%10;
			rev2=rev2*10+rem2;
			num2=num2/10;
		}
		System.out.println(rev2);
	}

}
