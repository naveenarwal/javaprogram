
class NumberConversion
{
	public String intToBinaryString(int num)
	{
	String s="";
	while(num!=0)
	{
	s=(num%2)+s;
	num=num/2;

	}
	return s;
	}
}
class Binary{
	public static void main(String[] args)
	{
		NumberConversion nc=new NumberConversion();
		System.out.println(nc.intToBinaryString(10));
	}
}