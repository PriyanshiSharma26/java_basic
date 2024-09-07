package exception;
import java.util.Scanner;
class NegativeRadius extends RuntimeException
{
    NegativeRadius(String msg)
    {
        super(msg);
    }
}
abstract class shape{
    abstract void area(int radius);
}
class circle extends shape
{
   void area(int radius)
   {
    if(radius<0)
    {
        throw new NegativeRadius("nagative value of radius");
    }
    final double pi=3.14;
    double area=pi*radius*radius;
    System.out.println(area);
   }

}
class rectangle extends shape{

void area(int radius) throws NegativeRadius
{
    if(radius<0)
    {
        throw new NegativeRadius("negative value for radius");
    }
        final double pi=3.14;
    double area=2*pi*radius;
    System.out.println(area);
    }
}

class shapemain
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius");
        int radius=sc.nextInt();
        rectangle r=new rectangle();
        r.area(radius);
        circle c=new circle();
        c.area(radius);
    }
}