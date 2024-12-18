package JavaFs.com;

public class Prac {

	public static void main(String[] args) {
		
		String s = "javasessions";

        String rev = "";

        int leng = s.length(); 
        System.out.println(leng);

        int i = leng - 1; 
        do {
            rev = rev + s.charAt(i); 
            i--; 
        } while (i >= 0); 

        System.out.println(rev);
        
        
        
        
	}

}
