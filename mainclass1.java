package upcost;
class sample
{
	void sub()
	{
		System.out.println("hlo");
	}
}
class cool extends sample
{
	void test()
	{
System.out.println("hi");
	}
}

 class mainclass1 {
	public static void main(String [] args)
	{
		sample s1=(sample)new cool();
		s1.sub();
		cool c1=(cool)s1;
		c1.sub();
		c1.test();
	}
 }

