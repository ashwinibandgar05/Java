package doc;

import java.io.File;
import java.io.IOException;

public class fileHandling {
    public static void main(String[] args){
        File myFile=new File("fileNew.txt");
        try{
            myFile.createNewFile();
        }
        catch(IOException e)
        {
            System.out.println("Unable to create a file !!");
            System.out.println(e);
        }
    }
}
