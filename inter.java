


interface Printable {
	public void m1();
	public void m2();
}
abstract class Service implements Printable
{
	public void m1()
	{
		System.out.println("hi");
	}

class SubService extends Service
	{
		public void m2()
		{
			System.out.println("hello");
			
		 }
		
		}

		public static void main(String[] args)
		{

		}
		
	}
