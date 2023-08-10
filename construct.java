
class Constructor {

	 Constructor()
	 {
	 	System.out.println("pconstructor");

	 }
}
class Test extends Constructor
{
	Test()
	{

	this(10);
	System.out.println("test Constructor");
	System.out.println("hi");
}
     Test(int a)
 {
 	System.out.println("test const:"+a);
 }
     Test (String s,int a)
 {
 	System.out.println(s);
    System.out.println(a);

 }
	public static void main(String[] args) {


	Test t=new Test(10);
	Test t1=new Test("Naveen",10);
	Test t2=new Test();

	}
}