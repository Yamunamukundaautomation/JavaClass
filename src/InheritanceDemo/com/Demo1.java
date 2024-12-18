package InheritanceDemo.com;
//parent class
class Xp
{
  
  Xp()
  {
      System.out.println("constructor in parent class");
  }
  
  
  void menu()
  {
      System.out.println("Parent");
  }
  
  
}
//child class
class Xp2 extends Xp
{
  
  
  Xp2()
  {
      System.out.println("constructor in child class");
  }
  
  
  void menu()
  {
      System.out.println("Xp2");
  }
  
  
  
}
class Vista extends Xp2
{
  
  
  Vista()
  {
      System.out.println("constructor in vista class");
  }
  
  
  void menu()
  {
      System.out.println("Vista");
  }
  
  
  
}
public class Demo1 {

	public static void main(String[] args) {
		Xp obj=new Xp2();
	    
	    obj.menu();
	        
	    
	    
	    Xp2 obj2=new Vista();
	    
	    obj2.menu();

	}

}
