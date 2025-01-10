import java.util.Scanner;



public class Discount
{
     public static void main(String []args)
      {
		  
		  int fee;
		  int discountPercent;
		  Scanner input=new Scanner(System.in);
		  
		System.out.print("fee: ");
        fee = input.nextInt();
        System.out.print("discountPercent: ");
        discountPercent = input.nextInt();
        
		 
		 int discount=fee*10/100;
		  
		  int discounteFee=fee-discount;
		  
		  System.out.println("The discount amount is INR "+ fee +" and final discounted fee is INR " + discounteFee);
		  
      }
}
