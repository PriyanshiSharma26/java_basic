package exception;


 

  class Throwexception
  {
    void ThrowMethod() throws ArithmeticException
    {
      System.out.println(10/2);
      System.out.println(10/0);
    }
  }
  class Throwexception_1
  {
    public static void main(String[] args) {
      
      Throwexception t=new Throwexception();
      try{
        t.ThrowMethod();
      }
      catch(Exception e)
      {
        e.printStackTrace();
      }
    }
  }
  
