class A

{
	public static void m1()
	{
	System.out.println("parent class");
	}
}
class B extends A
{
	public static void m2()
	{
	System.out.println("child class");

	}
}
class Test{

public static void main(String[] args)
	{
	 
	   B b=new B();   
	   b.m1();       
	   b.m2();       


	}
}