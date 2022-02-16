package day8;

 class X
 {
	 int x =5;
	 final void m1()
	 {
		 x =10;
		 System.out.println("the value of x is" +x);
	 }
	 void m2()
	 {
		 System.out.println("this is method no.2");
	 }
	 void m2(String s) {
 }

public class FinalDemo extends X{
void m2()
{
	System.out.println("this is method no.2 of final demo");
}
	public static void main(String[] args) {
		X x = new X();
		FinalDemo fd = new FinalDemo();
		x.m1();
		x.m2();
		fd.m2();
	}
}
	}
