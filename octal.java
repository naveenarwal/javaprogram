class Conversion
{
	public String intToOctalString(int num)
	{
	String s="";
	while(num!=0)
	{
	s=(num%8)+s;
	num=num/8;

	}
	return s;
	}
}
class Oct{
	public static void main(String[] args)
	{
		Conversion c=new Conversion();
		System.out.println(c.intToOctalString(10));
	}
}