package JavaFs.com;

public class Reversestring {

	public static void main(String[] args) {
		 String s="Javasessions";
		String rev="";
		int leng=s.length();
		System.out.println(leng);
		for(int i=leng-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		System.out.println("*****Do Whilelopp*******");
		String s1="Mukunda";
		String rev1="";
		int len=s1.length();
		System.out.println(len);
		int i1=len-1;
		do
		{
			
			rev1=rev1+s1.charAt(i1);
			i1--;			
		}
		while(i1>=0);
		System.out.println(rev1);
		

	}

}
