class P
{
	public void m1()
	{
	System.out.println("p m1()");
	}
	public void m2()
	{
		System.out.println("p m2()");
	}
}
class Test extends P
{   
  public void m3()
	{
	System.out.println("p m3()");
	}
	public void m4()
	{
		System.out.println("p m4()");
	}
public static void main(String[] args)
{
	Test t=new Test();
	t.m3();
	t.m4();
	t.m1();
	t.m2();


}

}