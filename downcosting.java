package upcosting;

public class downcosting {
 void sub()
 {
	 System.out.println("hi");
 }
 class cool extends downcosting
 {
	 void test()
	 {
		 System.out.println("hlo");
	 }
 }class mainclass
 {
	 public static void main(String [] args)
	 {
		 downcosting d1=(downcosting) new cool();
		 d1.sub();
		 cool c1=(cool)d1();
		 c1.sub();
		 c1.test();
		 
	 }
}
 {
	 
 }
}
