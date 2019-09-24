package interfc;
abstract interface demo
{
	 abstract void disp();
	 abstract void test();
}
class sample implements demo
{
	public void disp()
	{
		System.out.println("hlo");
	}
	public void test()
	{
		System.out.println("hlooooo");
	}
	
}

 class mainclass3 {
	public static void main(String [] args)
	{
		sample s1=new sample();
		s1.disp();
		s1.test();
	}

}
