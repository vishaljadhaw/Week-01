import java.util.Scanner;

class EmployeeDetails
{
      String name;
	  int id;
	  int salary;
	 
	//constructor 
	EmployeeDetails(String name,int id,int salary)
	{
	     this.name=name;
	     this.id=id;
	     this.salary=salary;
	}
	//method to display details
	void displayDetails()
	{
		System.out.println("Details of the Employee");
		
	     System.out.println("name : "+name);
		  System.out.println("id : "+id);
		 System.out.println("salary : "+salary);

	}
}
public class Employee
{
	public static void main(String []args)
	{
		
		Scanner input=new Scanner(System.in);
		
		
		
		System.out.println("enter the name ");
		String name=input.nextLine();
		
		System.out.println("enter the id ");
		int id=input.nextInt();
		
		System.out.println("enter the salary ");
		int salary=input.nextInt();
		
		
		EmployeeDetails employeeDetails=new EmployeeDetails(name,id,salary);
		employeeDetails.displayDetails();
		
	}
	}
	
	