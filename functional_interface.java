@FunctionalInterface
interface A{
    void show();
}
class a1 implements A
{
 
    public void show()
    {
     System.out.println("it is the method");   
    }
 }

 class main{
    public static void main(String[] args) {
        
        a1 a=new a1();
        a.show();
    }
 }



 //functional interface with lambda expression

@FunctionalInterface     //lambda function only works with functional_interface
 interface square
 {
    int calculate(int a);
 }

 class Ab 
 {
    public static void main(String[] args) {
        int x=10;
    square s1=(int a) -> a*a;
    System.out.println(s1.calculate(x));
    }
}

    

