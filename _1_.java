package assignment_questions;
import java.io.*;
//1
class _1_ {
    public static void main(String[] args) {
        if(args.length>0)
        {
            System.out.println(args.length);
        }
    }
    
}
//2
class ouuput
{
    public static void main(String[] args) {
        Integer i=new Integer(257);
        byte x=i.byteValue();
        System.out.println(x);
    }
}

//3

class array_output
{
    public static void main(String[] args) {
        int array_variable[]=new int[10];
        for(int i=0;i<10;++i)
        {
           array_variable[i]=i/2;
           array_variable[i]++;
           System.out.println(array_variable[i]+"");
           i++;
        }

    }
}

//8

class A{
    int i;
    int j;
    A()
    {
        i=1;
        j=2;

    }
}

 class  Out {
    public static void main(String[] args) {
        
        A obj1=new A();
        System.out.println(obj1.toString());
    }

    
}

//9


class ouuput1
{
    public static void main(String[] args) {
        byte a[]={65,66,67,68,69,70};
        byte b[]={71,72,73,74,75,76};
        System.arraycopy(a,1,b,3,0);
        System.out.println(new String(a)+" "+new String(b));
    }
}


class pattern
{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>i;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}



    

