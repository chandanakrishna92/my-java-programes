package interfc;
abstract class audi
{
abstract void wheels();
abstract void engine();
void color()
{
	System.out.println("red color");
}

class audicar extends audi
{
	void wheels()
	{
		System.out.println("super wheels");
	}
void engine()
{
	System.out.println("500cc engine");
}
public static void main(String [] args)
{
	audicar a1=new audicar();
	a1.engine();
	a1.wheels();
	a1.color();
}
}
}



