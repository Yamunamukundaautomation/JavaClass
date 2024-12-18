package JavaFs.com;

public class Revforloop {

	public static void main(String[] args) {
		System.out.println("*****Do Whilelopp*******");
		String s="Mukunda";
		String rev="";
		int leng=s.length();
		System.out.println(leng);
		int i=leng-1;
		do
		
		{
			rev=rev+s.charAt(i);
			i--;
			
		}
		while(i>=0);
		System.out.println(rev);
		
	}

	}


