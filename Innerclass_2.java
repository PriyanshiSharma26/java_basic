package InnerClass;

 class Outer{
    void outermetho1()
    {
        class Inner1
        {
            void software()
            {
                System.out.println("software clas");
            }
        }
        class Inner2 extends Inner1{
            void programming()
            {
                System.out.println("java programming");
            }
        }
        Inner2 i=new Inner2();
        i.programming();
        i.software();
    }
    public static void main(String[] args) {
        Outer o=new Outer();
        o.outermetho1();
    }
    
}
