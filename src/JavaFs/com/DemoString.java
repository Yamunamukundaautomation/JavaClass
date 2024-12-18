package JavaFs.com;

import java.util.Arrays;

public class DemoString {

	public static void main(String[] args) {
		//Concatenation
				String s1="Techmentorhub Software Training";
				String s2="Bangalore";
				String s3=s1+s2;
				System.out.println(s3);
				//Substring
				String s4=s1.substring(10,22);
				System.out.println(s4);
				String s5=s2.substring(3,9);
				System.out.println(s5);
				//Replace SubString
				String s6=s2.replace("Bangalore", "Mysore");
				System.out.println(s6);
				//substring place of index
				String ss="Welcome to Bangalore";
				int s7=ss.indexOf("B");
				System.out.println(s7);//11
				
				String sss="Welcome to bangalore";
				int s8=sss.indexOf("b");
				System.out.println(s8);//11
				String ssss="Mukunda";
				int s9=ssss.indexOf("u");
				System.out.println(s9);
				
				//Splitting
				String s10="Software Testing Training";
				String[]s11=s10.split(" ");
				System.out.println(Arrays.toString(s11));
			
				//Trimming with space
				String ss1=   "Welcom to Automation   ";
				String s12=ss1.trim();
				System.out.println(s12);
				
				//Start and End char Checking
				String ss2="Selenium Automation";
				System.out.println(ss2.startsWith("S"));
				System.out.println(ss2.endsWith("N"));
					//Formatting
						String ss3="modi";
						String s22=String.format("Welcome to india,%s",ss3);
						System.out.println(s22);

	}

}
