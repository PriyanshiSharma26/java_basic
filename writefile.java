package filehandling;    //write in file
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class writefile {
   public static void main(String[] args)
    {
    try{
        File f=new File("file.txt") ;
         
            FileOutputStream out = new FileOutputStream(f,true) ;
            String data="I am learning java";
            byte b[]=data.getBytes(); 
            out.write(b) ;
        System.out.println("writing is done..."); 
       }
       catch(IOException e)
       {
        System.out.println(e);
       }
       

       
       }
   }
    

