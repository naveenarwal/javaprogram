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
      
      addAthead(data);

		
	}
	public Node createNode(Object data)
	{
		Node temp=new Node(data);  
		return temp;

	}
	 
	public void addAthead(Object data)
	{
	 	Node head=createNode(data);
	 	if(start==null)
	 	{
	 		start=current=head;

	 	}
	 	else
	 	{
	 		head.setNext(start);
	 		start=head;
	 	}
	 }

    
public String toString()
    {
     	Node head=start;
     	String s="";

        while(head!=null)
        {
        	s=s+", "+head.getData();
        	head=head.getNext();
    
        }
      return "["+s.substring(1)+"]";
     
    }
}

    class Test
    {
     	public static void main(String[] args)
     	{
     		Linklist l=new Linklist();
     		l.addAthead(383);
            l.addAthead(484);
            l.addAthead(392);
            l.addAthead(975);
            l.addAthead(321);
          
          System.out.println(l);      
         
        }
    }

























