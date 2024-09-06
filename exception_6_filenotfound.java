package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class ReadFile {


    void read() throws FileNotFoundException
    {
        FileInputStream fis=new FileInputStream("d:/abc.txt");

    }
    
}
class ReadFileMain
{
    public static void main(String[] args) {
        ReadFile s=new ReadFile();
        try{
            s.read();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
    }
}
