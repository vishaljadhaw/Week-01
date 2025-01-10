import java.util.Scanner;


     // Create FindQuotientAndReminder Class to compute the Quotient and Remainder
     public class FindQuotientAndReminder
      {
     public static void main(String []args)
     {
	 // Declare variables for the two numbers
	 int number1,number2;
	 
	  // Create a Scanner object to take user input
	 Scanner input=new Scanner(System.in);
	 
	 System.out.println("enter the number1 ");
	 number1=input.nextInt();
	 
	 System.out.println("enter the number2 ");
	 number2=input.nextInt();
	 
	 // Calculate the quotient by dividing number1 by number2
	 int Quotient=number1/number2;
	 
	 // Calculate the remainder using the modulus operator
	 int Remainder=number1%number2;
	 
	  // Print the calculated quotient and remainder 
	 System.out.println("The Quotient is " + Quotient +" and Reminder is " + Remainder +" of two number " + number1 +" and " +number2);
	 }
	 }