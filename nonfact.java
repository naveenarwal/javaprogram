import java.util.*;
class Mat
{
	public int fact(int n)
	{
		int f=1,i;
		for(i=1;i<=n;i++)
		{
			f=f*i;

		}
		return f;
	}
	public static void main(String[] args)
	{
		int n;
		Mat m=new Mat();
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Factorial of "+n+" is "+m.fact(n)+" ");

	}
}
