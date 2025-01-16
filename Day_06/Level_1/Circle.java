import java.util.Scanner;

	class AreaOfCircle
{
    double pi;
    double r;

     //constructor
    AreaOfCircle(double pi,double r)
    {
        this.pi=pi;
        this.r=r;
    }

    //method to find Area of circle
    public void areaOfCircle()
    {
        System.out.println("the area of circle : "+pi*r*r);
        System.out.println("the  circumference of the circle : "+2*pi*r);
    }
}
public class Circle{
    public static void main(String []args)
    {
        Scanner input=new Scanner(System.in);
      //taking the input of pi 
        System.out.println("enter the value of pi");
        double pi=input.nextDouble();

        //taking the input of r
        System.out.println("enter the value of r");
        double r=input.nextDouble();

        AreaOfCircle areaofcircle=new AreaOfCircle(pi,r);
        areaofcircle.areaOfCircle();


    }
}