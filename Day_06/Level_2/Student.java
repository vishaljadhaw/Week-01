//class Definaton
class StudentDetails
{
	
	//field
     String name;
	 int rollnumber;
	 int marks;
	 
	 
	 //constructor
	 StudentDetails(String name, int rollnumber,int marks)
       {
          this.name=name;
          this.rollnumber=rollnumber;
          this.marks=marks;
       }
	   
	   //method to find grade
         public void findGrade()
            {
			if (marks >=80) {
                System.out.println("Grade A ");
            } else if (marks >= 70) {
                System.out.println("Grade B ");
            } else if (marks >= 60) {
               System.out.println("Grade C ");
            } else if (marks >= 50) {
               System.out.println("Grade D ");
            } else if (marks >= 40) {
               System.out.println("Grade E ");
            } else {
               System.out.println("Grade R ");
            }
			}
			
			//method to 
			 void displayDetails()
			{    
       			 System.out.println("Student's Details ");
			     System.out.println("name : "+name);
				 System.out.println("rollnumber : "+rollnumber);
				 System.out.println("marks : "+marks);
            }				 
    }
	public class Student
	{
	     public static void main(String [] args)
		 {
		     StudentDetails s=new StudentDetails("vishal",001,70);
			  s.displayDetails();
			 s.findGrade();
			
			 }
	}
          		