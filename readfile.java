package filehandling;   //read file
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
public class readfile {
    public static void main(String[] args) {
        try{
            File f=new File("file.txt");
            FileInputStream fin=new FileInputStream(f);
            String data=" ";
            while(true)
            {
                int x=fin.read();
                if(x==-1)
                break;
                data=data+(char)x;
            }
            System.out.println(data);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
