class BookDetails
     {
	 String title;
	 String auther;
	 int price;
	 
	 //constructor
	 BookDetails(String title,String auther,int price)
	 {
	 this.title=title;
	 this.auther=auther;
	 this.price=price;
	 }
	 
	 //method to print book deatils
	  void detailsOfBook()
	  {
	      System.out.println("title : "+title);
	      System.out.println("auther : "+auther);
	      System.out.println("price : "+price);

      }
	  
	 }
	
	public class Book
	{
	public static void main(String []args)
	{
	 
	 BookDetails bookObj=new BookDetails("Atomic Habits","James Clear",500);
	 bookObj.detailsOfBook();
	 }
	 }
	