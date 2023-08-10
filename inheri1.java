class Parent
{
	int a=10;
	void display()
	{
	System.out.println("parent");

	}
}
class Child extends Parent
{
	int b=20;
	void show()
	{

    System.out.println("child");

	}
	public static void main(String[] args)
	{
	Child c=new Child();
	 System.out.println(c.b);
	c.show();
	 System.out.println(c.a);
	c.display();

	}
}