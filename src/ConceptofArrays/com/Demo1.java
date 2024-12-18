package ConceptofArrays.com;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("Continious Numbers by int");
		int a[]= {1,2,4,5,7,1,8,9,6,7,8};
		int len=a.length;
		System.out.println(len);
		
		 for(int i=0;i<a.length;i++) 
	        {
			   
	            System.out.println(a[i]);
	        }
		 System.out.println("Continious Numbers by short");
		 
		 short s[]= {1,2,4,5,7,1,8,9,6,7,8};
		//Using for loop	
		 for(int i=0;i<s.length;i++) 
	        {
			   
	            System.out.println(s[i]);
	        }
		// Without using loop
		 System.out.println(Arrays.toString(s));

	}

}
