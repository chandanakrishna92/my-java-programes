package interfc;
interface nike
{
	public abstract void shoes();
}
		interface puma extends nike
		{
			public abstract void bags();
			public abstract void shoes();
		}
		class rajoutlet implements puma
		{
			public void bags()
			{
				System.out.println("bags");
			}
			public void shoes()
			{
			System.out.println("shoes");
			}
			public static void main(String[] args)
			{
				rajoutlet r1=new rajoutlet();
				r1.shoes();
				r1.bags();
			}
		}
		
