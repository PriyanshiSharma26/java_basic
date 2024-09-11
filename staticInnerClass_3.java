package InnerClass;
//static Inner class

 class staticInnerClass_3 {
    static int a=10;
    static int b=20;

    static  class staticchild
    {
        void display()
        {
            System.out.println(a);
            System.out.println(b);
        }
    }
    public static void main(String[] args) {
        new staticInnerClass_3.staticchild().display();
    }
    
}

class static_outer
{
    static class static_inner
    {
        public static void main(String[] args) {
            System.out.println("thid is the static nested class");
        }
    }
}