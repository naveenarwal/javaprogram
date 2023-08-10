class Discount
{
	public static void Bill(int cost,int discount)
	{
		
     if(cost>=1000)
     {
     	int a=cost-cost*(discount/100);
     
     }
     else
     {
     	
     	System.out.println(cost);

     }
 }
      public static void main(String[] args) {
      	Discount d=new Discount();
      	d.Bill(1200,10);
     	
     }
     
	
}