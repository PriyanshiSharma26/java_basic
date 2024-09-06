package exception;

import java.util.Scanner;

class SpeedException extends RuntimeException  {
    String msg;
    SpeedException(String msg)
    {
        super(msg);
    }
    
}
class Vehicle
{
    int speed;
    void set_speed()
    {
        System.out.println("vehicle speed is"+speed);
    }
}
class Truck extends Vehicle{
    int speed;
    Truck(int speed)
    {
        this.speed=speed;
    }
    void set_speed()
    {
        System.out.println("speed is"+speed);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the speed of truck");
        int speed=sc.nextInt();
        if(speed>150)
        {
            throw new SpeedException("very high speed slow down");
        }
        Truck ob=new Truck(speed);
        ob.set_speed();

    }
}
