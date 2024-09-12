import java.util.StringTokenizer;

public class String_tokenizer {
    public static void main(String[] args) {
        String s1="hi, i, am, priyanshi";
        StringTokenizer s=new StringTokenizer(s1,", ");
        System.out.println("the tkoens are");

        while(s.hasMoreTokens())
        {
            String one=s.nextToken();
            System.out.println(one);
        }
    }
    
}
