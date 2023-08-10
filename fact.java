import java.util.*;
class Factorial
{
	public static int fact(int n)
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
		int n,j;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		j=fact(n);
		System.out.println(j);

	}
}
