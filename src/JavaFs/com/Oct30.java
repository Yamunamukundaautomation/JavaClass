package JavaFs.com;

public class Oct30 {

	public static void main(String[] args) {
	//++ and--
	//++ Pre-increment or Post-increment
		//-- Pre-decrement or Post-decrement
		
		//Post-increment
		//Syntax:Variable_name+OPerator
		System.out.println("Postincrement");
		int i=2;
		int j=i++;
		System.out.println(i);//3
		System.out.println(j);//2
		int ii=5;
		int jj=ii++;
		System.out.println(ii);//6
		System.out.println(jj);//5
		int iii=9;
		int jjj=iii++;
		System.out.println(iii);//10
		System.out.println(jjj);//9
		//pre-increment
		//Syntax; Operator+Variable
		System.out.println("preincrement");
		int i1=11;
		int j1=++i1;
		System.out.println(i1);//12
		System.out.println(j1);//12
		int i2=-15;
		int j2=++i2;
		
		System.out.println(i2);//-14
		System.out.println(j2);//-14
		
		System.out.println("Postdecrement");
		
		
		int i3=7;
		int j3=i3--;
		System.out.println(i3);//6
		System.out.println(j3);//7
		
		int i4=12;
		int j4=i4--;
		System.out.println(i4);//11
		System.out.println(j4);//12
		//Pre-decrement
		System.out.println("Predecrement");
		int d=5;
		int e=--d;
		System.out.println(d);//4
		System.out.println(e);//4
		
		int dd=-78;
		int ee=--dd;
		System.out.println(dd);//-79
		System.out.println(ee);//-79
		
		System.out.println("float values for postincrement");
		float f=2.0f;
		float ff=f++;
		System.out.println(f);//3.0
		System.out.println(ff);//2.0
		float f1=1.0f;
		float f2=++f1;
		System.out.println(f1);//2.0
		System.out.println(f2);//2.0
		
		long ddd=45L;
		long dddd=ddd++;
		System.out.println(ddd);//46
		System.out.println(dddd);//45
		
		long l=45L;
        long ll=l++;
        System.out.println(l);//47
        System.out.println(ll);//45
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
