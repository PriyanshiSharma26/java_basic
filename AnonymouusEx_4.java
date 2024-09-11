package InnerClass;
//example of anonymous class
interface anoninterface{
    void show();
}

public class AnonymouusEx_4 {
    public static void main(String[] args)
     {
        anoninterface a=new anoninterface() {
            public void show()
            {
               System.out.println("it is example of anonymous example");
            }
        };
        a.show();
    }

    
}
