
class A

{
	
  public static void main(String[] args)
  {  
  	int i,j,n;
  	int count =0;
  	int a[][]={{1,2,3},{4,5,6},{7,8,9}};
  	int b[][]={{1,2,3},{4,5,6},{7,8,9}};
  	int c[][]=new int[3][3];

  	for(i=0;i<=2;i++)
  	{
  		for(j=0;j<=2;j++)
  		{
  			c[i][j]=a[i][j]+b[i][j];
  		}
  	}

    for(i=0;i<=2;i++)
  	   {
  		for(j=0;j<=2;j++)
  	     {
  	     	count++;
  	     	System.out.print(c[i][j]+" ");
  	     	if(count%3==0)
  	     	{
            	System.out.print("\n");
  	     	}

  	         }




        }
        



   }
}