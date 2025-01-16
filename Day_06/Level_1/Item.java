//class Definaton
class Item1
{
	//Fiels(Attributes)
     int itemCode;
	 String itemName;
	 int price;
	 int quantity=3;
	 
	 //constructor
	 Item1(int itemCode,String itemName,int price)
	 {
	 this.itemCode=itemCode;
	 this.itemName=itemName;
	 this.price=price;
	 }
	 
	 
	 //method to calculate the total cost
	 void calculateCost()
	 {
	    System.out.println("total cost "+price*quantity);
	 }
	 //method to display the details
	 void displayDetails()
	 {
	 System.out.println("itemCode " +itemCode);
	 System.out.println("itemName " +itemName);
	 System.out.println("price " +price);
	 }
	 
}

//Main class 
public class Item
{
      public static void main(String []args)
	  {
	  
	  
	  Item1 input=new Item1(101,"Zoho Inventory",500);
	  input.displayDetails();
	  input.calculateCost();
	  }
	  }