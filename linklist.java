class Node{
	private Object data;
	private Node next; 
	Node(Object data)
	    {
		this.data=data;
		this.next=null;
        }
        public void setData(Object data)
        {
        	this.data=data;
        }

        public void setNext(Node next)
        {
        	this.next=next;
        }
        public Object getData()
        {
        	return data;
        }
        public Node getNext()
        {
        	return next;
        }

}

class Linklist
{
	Node start,current;
	Linklist() {}
	Linklist(Linklist data)
	{
      
      addAtFirst(data);
      addAtLast(data);

		
	}
	public Node createNode(Object data)
	{
		Node temp=new Node(data);  
		return temp;

	}
	 
	public void addAtFirst(Object data)
	{
	 	Node temp=createNode(data);
	 	if(start==null)
	 	{
	 		start=current=temp;

	 	}
	 	else
	 	{
	 		temp.setNext(start);
	 		start=temp;
	 	}
	 }

    
    public void addAtLast(Object data)
	{
	 	Node temp=createNode(data);
	 
      if(start==null)
      {
        start=current=null;
      }
      else
      {
      	current.setNext(temp);
      	current=temp;
      }
    }

 public void deleteAtFirst(Object data)
	{
	 	Node temp=createNode(data);
	 	if(start==null)
	 	{
	 		start=current=temp;

	 	}
	 	else
	 	{
	 		temp.setNext(start);
	 		start=temp=null;
	 	}
	 }


    public String toString()
    {
     	Node temp=start;
     	String s="";
 
        while(temp!=null)
        {
        	s=s+", "+temp.getData();
        	temp=temp.getNext();
    
        }
      return "["+s.substring(1)+"]";
    
    }
}

    class Test
    {
     	public static void main(String[] args)
     	{
     		Linklist l=new Linklist();
     		l.addAtFirst(100);
            l.addAtFirst(200);
            l.addAtFirst(300);
            l.addAtFirst(400);
           
            l.addAtLast(20);
            l.addAtLast(30);
         
          System.out.println(l);      
         
        }
    }


