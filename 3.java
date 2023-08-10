class Discount
{
	public void Bill(int cost,int discount)
	{
     
     if(cost>=1000)
     {
     	int finalcost=cost-cost*(discount/100);
     }
     else
     {
     	int finalcost=cost;
     	System.out.println(finalcost);

     }
 }
      public static void main(String[] args) {
      	Discount d=new Discount();
      	d.Bill(1200,10);
     	
     }
     
	
}