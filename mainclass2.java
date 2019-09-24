
package abstrct;
abstract class demo2
{
	abstract void test();
	abstract void disp();
}
class tester2 extends demo2
{
	void test()
	{
		System.out.println("hai");
	}
		void disp()
		{
			System.out.println("hmm");
	}
}

public class mainclass2 {
	public static void main(String [] args)
	{
		tester2 t2=new tester2();
		t2.test();
		t2.disp();
	}
}

