
package interfc;
interface audi1
{
	void wheels();
	void engine();
}
class audicar implements audi1
{
	public void wheels()
	{
		System.out.println("wheels");
	}
	public void engine()
	{
		System.out.println("600cc engine");
		}
	public static void main(String [] args)
	{
		audicar a1=new audicar();
		a1.engine();
		a1.wheels();
	}
}
