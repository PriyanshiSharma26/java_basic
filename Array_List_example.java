import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Array_List_example {
    public static void main(String[] args) {
        
        ArrayList <String> a1=new ArrayList<>();
        a1.add("java");
        a1.add("python");
        a1.add("c");
        a1.add("c++");
        a1.add("c++");
        a1.add("c++");
        //System.out.println(a1.indexOf("c++"));

        // System.out.println(a1);
        // System.out.println(a1.get(3));  //to get specified variable
        // a1.set(3,"golang");   //to replace
        // System.out.println(a1);
        // a1.add(4,"ruby");
        // System.out.println(a1);     //to insert element
        // a1.remove(2);
        // System.out.println(a1);

        // System.out.println(a1.contains("c++"));
        //a1.clear();
        //System.out.println(a1);

       // System.out.println(a1.isEmpty());


       //traversing using for loop
       for(int i=0;i<a1.size();i++)
       {
        System.out.println(a1.get(i));
       }
        

       //traversing using for each loop

      /*  for(String i:a1)
       {
        System.out.println(i);
       }

       ArrayList<String>s2=new ArrayList<>();

       s2.addAll(a1);
       System.out.println(s2);*/


       //to add element without using add()

       ArrayList<Integer> a2=new ArrayList<>(Arrays.asList(8,5,9,4,5,8));
      // a2.addAll(Arrays.asList(1,2,3,4,5));
       System.out.println(a2);
       a2.sort(null);
       System.out.println(a2);
       
       


      /*  ArrayList<String> a3=new ArrayList<>();
       Collections.addAll(a3,"js","html","css");
       System.out.println(a3);


       ArrayList a4=(ArrayList)a3.clone();
    
      System.out.println( a4);*/

      System.out.println(a1.getClass());
      System.out.println(a1.getFirst());
      System.out.println(a1.removeFirst());
      System.out.println(a1);
      System.out.println(a1.removeLast());
      System.out.println(a1);
      System.out.println(a1.getLast());
      System.out.println(a1.equals(a2));
      System.out.println(a1.hashCode());
      System.out.println(a1.reversed());
      a1.set(0,"kotlin" );
      System.out.println(a1);
       



        

    }
}
