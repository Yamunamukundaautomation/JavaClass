package ConceptofArrays.com;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {
		int a[]= {1,2,8,3,5,6,5,4,1,8,9,1,2};
		 int leng=a.length;
	        System.out.println("This is length of array"+leng);
	        
	        
	        for(int i=0;i<a.length;i++) 
	        {
	            System.out.println(a[i]);
	        }
	        
	        System.out.println(Arrays.toString(a));
	        
	        System.out.println("String Method in Arrays");
	        String s[]={"Tech","Mentor","Hub","in","Bangalore"};
	        System.out.println(Arrays.toString(s));
	        for(int i=0;i<s.length;i++)
	        {
	        	System.out.println(s[i]);
	        }
	        	
	        	System.out.println("char Method in Arrays");
	        	char c[]= {'a','e','i','o','u'};
	        	byte len=(byte) c.length;
	        	System.out.println(len);
	        	for(byte b=0;b<c.length;b++)
	        	{
	        		System.out.println(c[b]);
	        	}
	        }
	        

	}


