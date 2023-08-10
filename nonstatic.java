
class Sample
{
	public void math(int length,int breadth)

	{
		if(length==breadth)
			System.out.println("square");
		else
			System.out.println("rectangle");

	}

	public static void main(String[] args)
	{
	
		Sample s= new Sample();
		s.math(30,50);
	}

}

