import java.util.*;
class Strong
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
		int n=145,r,sum=0,t=n;

		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n!=0)
		{
			r=n%10;
			sum=sum+fact(r);
			n=n/10;
		}

		if(t==sum)
		{
			
			System.out.println("number is strong number");

		}
		else
		{
			System.out.println("number is not strong number");
		}
	

	}
}
