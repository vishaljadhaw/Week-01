class Atm1
{
     private String accountHolder;
	 private  int accountNumber;
	 private double balance;
	 
	 //constructor
	 Atm1(String accountHolder,int accountNumber,int balance)
	 {
           this.accountHolder=accountHolder;
	       this.accountNumber=accountNumber;
	       this.balance=balance;
	 }
	       
		   //method to deposit amount
	    void deposit(double amount)
		{
		if(amount>0)
		{
		balance=balance+amount;
		System.out.println("deposited : "+amount);
		}
		else
		{
		System.out.println("invalid deposit amount");
		}
		}
		
		//method to withdral amount
		void withdrawal(double amount)
		{
		if(balance>=amount && amount>0)
		{
		balance=balance-amount;
		System.out.println("withdrew amount : "+amount);
		}
		else if(amount>balance)
		{
		System.out.println("insufficient balanace");
		}
		else
		{
		System.out.println("invalid withdrew amount");
		}
		}
		
		//method to show current balance 
		void displayCurrentBalance()
		{
		  System.out.println("current balanace : "+balance);
		}
		}
		
		public class BankAccount
		{
		public static void main(String []args)
		{
		Atm1 input=new Atm1("Vishal",10029,1000);
		input.displayCurrentBalance();
		input.deposit(500);
		input.displayCurrentBalance();
		input.withdrawal(1000);
		input.displayCurrentBalance();
		input.withdrawal(1000);
		}
		}
		  
		
		
		
		
		
		