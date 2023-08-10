import java.util.*;

class NumberConversion
{

    public  int binToOctal(String bin)
    {
	int l=bin.length();
	String n="";
	for(int i=bin.length()/3;i>0;i--)
	{
		n=binToOctal(bin.substring(l-3,l))+n;
		l=l-3;
	 }

	if(l>0)
	{
        n=binToOctal(bin.substring(0,1))+n;
	}
	System.out.println(n);
	}
}

	class Convert{


	public static void main(String[] args)
	{
		int n;

		NumberConversion nc=new NumberConversion();
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		nc.binToOctal("1010");
	}
}
