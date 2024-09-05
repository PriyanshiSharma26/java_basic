package exception;

import java.util.Scanner;


 
class ExternalClassException extends Exception{
    public ExternalClassException(String msg)
    {
        super(msg);
    }
}
class InternalClassException extends Exception{ 
    public InternalClassException(String msg)
    {
        super(msg);
    } 
}
class internalmarks
{
    public static void internalexternal(int internalmarks,int externalmarks) throws InternalClassException,ExternalClassException
    {
       try{ if(internalmarks>40)
        {
            throw new InternalClassException("internal marks is greater than 40");
        }
    }
       catch(Exception e){
            e.printStackTrace();
       }
        
        try{
            if(externalmarks>60)
            {
               throw new ExternalClassException("extenal marks is grater than 60") ;
            }
        }
        catch(Exception e)
        {
           e.printStackTrace(); 
        }
    }
    public static void main(String[] args) {
        System.out.println("enter internal marks");
        Scanner sc=new Scanner(System.in);
        int internalmarks=sc.nextInt();
        System.out.println("enter external marks");
         int externalmarks=sc.nextInt();
         
           try{ internalexternal(internalmarks,externalmarks);
           }
           catch(Exception e)
           {
            System.out.println(e);
           }
        }
    }





