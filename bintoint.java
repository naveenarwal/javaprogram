
import java.util.*;

class NumberConversion
{
	
public int pow(int n,int p)
	{
	int s=1,i;

     for(i=1;i<=p;i++)
     {
     	s=s*n;

     }
     return s;

	}	


public  int binToInt(String bin)
{
	int n=0,j=0;
	for(int i=bin.length()-1;i>=0;i--)
	{
		n=n+(bin.charAt(i)-48)*pow(2,j++);

	}
	System.out.println(n);
 }

class Convert
{
	public static void main(String[] args)
	{
		int n;

		NumberConversion nc=new NumberConversion();
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		nc.binToInt("1010");
	}
}

}