package abstrct;
abstract class demo3
{

abstract  void add();
abstract void sub();
}
abstract class sample3 extends demo3
{
	void add()
	{
		System.out.println("hai");
	}
abstract void sub();
}


	class cool2 extends sample3
	{
		void sub()
		{
			System.out.println("hlllo");
		}
	
	public static void main(String [] args)
	{
		cool2 c2=new cool2();
		c2.add();
		c2.sub();
		}
}



