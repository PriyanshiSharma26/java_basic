package exception;
import java.util.Scanner;
class OddException extends RuntimeException
{
    public OddException(String msg)
    {
        super(msg);
    }
}
class Oddno{
public static void oddcheck(int input) throws OddException {
    if(input%2!=0)
    {
        throw new OddException("the no is odd");
    }
    else{
        System.out.println("the no is even");
    }
    
}
public static void main(String[] args) 
{
  Scanner sc=new Scanner(System.in) ;
  System.out.println("enter no");
  int num=sc.nextInt();
  try{
    oddcheck(num);
  }
  catch(OddException e)
  {
e.printStackTrace();
  }
}
}
