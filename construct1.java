
class Student
{
	
	String name;
	int rollno;


         Student(String name,int rollno)    // parametrized constructor 
         {

            this.name=name; 
            this.rollno=rollno;
        //constructor is responsible for initialization of object 
         }


	public static void main(String[] args)
	{
       
   

     Student s1=new Student("Naveen",121);   //new keyword  is responsible for object creation
     Student s2=new Student("mohan",123);

    

     System.out.println(s1.name+","+s1.rollno);

     System.out.println(s2.name+","+s2.rollno);


	}


	}
	
