import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;
import java.util.*;

public class collectionEx {
    public static void main(String[] args) {

        Collection c=new ArrayList<>();
       c.add(1);
       c.add(2);
      System.out.println(c);

      ArrayList<String> a=new ArrayList<>();
      a.add("kashish");
      a.add("niki");
      System.out.println(a);

       List<Integer> l=new ArrayList<>();

       l.add(20);
       l.add(30);
       System.out.println(l);

       Set<String> s=new TreeSet<>();

       s.add("priya");
       s.add("priya");
       s.add("kashi");
       System.out.println(s);


        
    }
    
}




class container<T>
{
    T value;
    public void show()
    {
      System.out.println(value.getClass().getName());
    }
}

class containerMain
{
    public static void main(String[] args) {
        
        container<Integer> c=new container<>();
        c.value=10;
        c.show();
    }
}
