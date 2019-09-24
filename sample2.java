package interfc;
abstract interface tester
{
 public  abstract void cool();
 public  abstract void disp();
}
abstract class demo1 implements tester
{
public void cool()
	{
	System.out.println("i am cool");
}
}
class sample2 extends demo1 
{
	public void disp()
	{
		System.out.println("hloooo");
	}
public static void main(String [] args)
{
	sample2 s2=new sample2();
	s2.disp();
	s2.cool();
}
}


