package DemoInterface.com;
public interface Demo1 {
	abstract void sum();
	abstract void mul();

}
class Demo123 implements Demo1
{
	public void sum()
	{
		System.out.println("Sum");
	}
	public void mul()
	{
		System.out.println("Mul");
	}
}


