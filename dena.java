
class Account

{
	Private int accNo;
	Private String Name,Mobile;
	Account(String Name,String Mobile,int accNo)
	{
	  this.Name=Name;
	  this.Mobile=Mobile;
	  this.accNo=accNo;
	}
      
      public void Display()
      {
      System.out.println("Name:"+Name+",Mobile:"+Mobile+",accNo:"+accNo);  
      }
      }

class Sbi
{
	public static void main(String[] args)
	{
        


      Account a1=new Account("Naveen",9589867884,12345678996); 
     Account a2=new Account("mohan",8718987692,98765432113);

     System.out.println(a1.Name+".."+a1.Mobile""+a1.accNo);

     System.out.println(a2.Name+".."+a2.Mobile""+a2.accNo);
  
           

	} 
}




}