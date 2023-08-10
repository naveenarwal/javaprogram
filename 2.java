

import java.util.*;
class Power
{
	public static int power(int n,int p)
	{
		int s=1,i;
		for(i=1;i<=p;i++)
		{
			s=s*n;
		}
		return s;
	}

	public static void main(String[] args)
	{
		int n,p,j;

		System.out.println("enter the number");
		System.out.println("enter the power");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		p=sc.nextInt();
		j=power(n,p);
		System.out.println(j);

	}

}