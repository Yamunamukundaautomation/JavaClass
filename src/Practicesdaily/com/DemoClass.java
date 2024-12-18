package Practicesdaily.com;

public class DemoClass {
	//global data or class variable or instance variable
    int dd=10;
    
    
    
    
    //method does not return anything and doest not take any input
        void reverseValue33()
        {
            String s="abcdef";
            
            //here leng is local variables
            int leng=s.length();
            
            String rev="";
            for(int i=leng-1;i>=0;i--)
            {    
                rev=rev+s.charAt(i);
                
            }
            
            System.out.println(rev);
        
        }
    //method does not return anything but it will takes input
    void reverseValue(String s)
    {
        
        //here leng is local variables
        int leng=s.length();
        
        String rev="";
        for(int i=leng-1;i>=0;i--)
        {    
            rev=rev+s.charAt(i);
            
        }
        
        System.out.println(rev);
    
    }
    
    //method return some value  and also it will takes input
    
    String reverseValue1(String s)
    {
        int leng=s.length();
        
        String rev="";
        for(int i=leng-1;i>=0;i--)
        {    
            rev=rev+s.charAt(i);
            
        }
        
        return rev;
    
    }
    
    //method return some value  and also it will takes input
    
    int add(int a,int b)
    {
        //sum is local variable
        int sum=a+b;
        return sum;
        
    }
    
    
    //method return some value  and also it will takes input    
 float subration(int c,int d)
 {
     float sub=c-d;
     return sub;
 }
    
    
    
    public static void main(String[] args) {
        
        //creation of object
        DemoClass obj=new DemoClass();
        
        //executing the method
        obj.reverseValue("javasessionsclasses");
        obj.reverseValue("techmentorhub");
        obj.reverseValue("abc");
        
        System.out.println("***************************");
        
        
        String reversevalues=obj.reverseValue1("seleniumsessions");
        
        System.out.println(reversevalues);
        
        
        
        System.out.println("*****************");
        int result=obj.add(10, 5);
        System.out.println(result);
        
        System.out.println("*****************");
        
        float ff=obj.subration(20,10);
        System.out.println(ff);
        
        System.out.println("*****************");
        System.out.println(obj.dd);
        
        System.out.println("*********************");
        obj.reverseValue33();

	
	}

}
