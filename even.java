import java.util.*;
class Team
{
	public static int Even(int n)
	{
	if(n%2==0)

	{
	System.out.println("number is even");

	}
	else
	{
		System.out.println("number is odd ");
	}
	}
public static void main(String[] args)
{
	int i,n;
	System.out.println("enter the number");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	i=Even();
	System.out.println(i);



}

}