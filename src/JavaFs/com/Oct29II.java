package JavaFs.com;

public class Oct29II {

	public static void main(String[] args) {
	int a=10;
	int b=20;
	String s1="Welcome to Automation";
	String s2="Selenium";
	System.out.println(a+b);//30
	System.out.println(s1+a);//Welcome to Automation10
	System.out.println(s1+a+b);//Welcome to Automation1020
	System.out.println(a+b+s1);//30Welcome to Automation
	System.out.println(a+b+s1+s2);//30Welcome to AutomationSelenium
	System.out.println(a+b+s1+s2+a+b);//30Welcome to AutomationSelenium1020
	System.out.println(s1+s2+a+b);//Welcome to AutomationSelenium1020
	System.out.println(s1+s2+a+b+s1+s2);//Welcome to Automation Selenium1020Welcome to AutomationSelenium
	
	//Short
	short s=2;
	short ss=4;
			System.out.println(s+a);//12
			System.out.println(s1+s);//Welcome to Automation2
			System.out.println(s1+s+ss);//welcome to Automation24
			System.out.println(s+ss+s1);//6Welcome to Automation
			System.out.println(s+ss+a+s1);//16Welcome to Automation
			System.out.println(s+b+s1+s2+ss+a);//22Welcome to AutomationSelenium410
			System.out.println(s1+s2+s+ss+s1+s2);//Welcome to AutomationSelenium24Welcome to AutomationSelenium
	
	//Floating
			float f=1.0f;
			float ff=25.8f;
			System.out.println(f+a);//11
			System.out.println(s1+f);//Welcome to Automation1.0
			System.out.println(s1+f+ff);//welcome to Automation1.025.8
			System.out.println(f+ff+s1);//26.8Welcome to Automation
			System.out.println(f+ff+a+s1);//36.8Welcome to Automation
			System.out.println(f+b+s1+s2+ff+a);//21.0Welcome to AutomationSelenium25.810
			System.out.println(s1+s+a+ff);//welcome to Automation21025.8
			System.out.println(ss+a+ff+s2);//39.8Selenium
			System.out.println(ss+a+ff+s1+s2+s+b+f);//39.8Welcome to AutomationSelenium2201.0
			
			System.out.println(s1+s2+f+ff+s1+s2);//Welcome to AutomationSelenium1.025.8Welcome to AutomationSelenium
	//Long
			long l=15l;
			long ll=37l;
			System.out.println(l+a);//25
			System.out.println(s1+l);//Welcome to Automation15
			System.out.println(s1+l+ll);//welcome to Automation1537
			System.out.println(l+ll+s1);//52Welcome to Automation
			System.out.println(l+ll+a+s1);//62Welcome to Automation
			System.out.println(l+b+s1+s2+ll+a);//35Welcome to AutomationSelenium3710
			System.out.println(s1+s2+l+ll+s1+s2);//Welcome to AutomationSelenium1537Welcome to AutomationSelenium
	//Double
			double d=35.5;
			double dd=18.5;
			System.out.println(d+a);//45.5
			System.out.println(s1+d);//Welcome to Automation35.5
			System.out.println(s1+d+dd);//welcome to Automation35.518.5
			System.out.println(d+dd+s1);//54.0Welcome to Automation
			System.out.println(d+dd+a+s1);//64.0Welcome to Automation
			System.out.println(d+b+s1+s2+dd+a);//55.5Welcome to AutomationSelenium18.510
			System.out.println(s1+s2+d+dd+s1+s2);//Welcome to AutomationSelenium35.518.5Welcome to AutomationSelenium
			
	
	}

}
