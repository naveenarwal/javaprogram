import java.util.*;

class Conversion
{
	public int decimalTooctal(int num){
	
		int r;
		String s="";
while(num!=0)
	{
	s=num%8;
	num=num/8;

	}
	                           
                            }

}

class Convert{

	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Conversion c=new Conversion();
		System.out.println(c.decimalTooctal(100));
	}
}
	
