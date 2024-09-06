package exception;

public class Exception_7_finally {
    public static void main(String[] args)
     {
        try{
            int a=10/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("finally block is always executed");
        }
        
    }
    
}
