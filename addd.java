import java.util.*;
class Addition
{
	public static int sum(int a,int b)
	{
	  int sum;

	  sum=a+b;
	return sum;
	}

public static void main(String[] args)
{
	 int x,y,sum;
	
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    x=sc.nextInt();
    System.out.println("enter the second number");
    y=sc.nextInt();
   sum=sum(x,y);
   System.out.println("sum of two number is"+sum);
 

 }

}