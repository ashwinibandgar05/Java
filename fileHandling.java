

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling {
    public static void main(String[] args){

        //Create a new file
        /*
        File myFile=new File("fileNew.txt");
        try{
            myFile.createNewFile();
        }
        catch(IOException e)
        {
            System.out.println("Unable to create a file !!");
            System.out.println(e);
        }*/


        //Code to write to afile 
        /*
        try{
            FileWriter filewritter = new FileWriter("fileNew.txt");
            filewritter.write("This is our first file from this course");
            filewritter.close();
        }
        catch(IOException e){
            e.printStackTrace();
            System.out.println(e);
        }
        */


        //Reading a file
        /*
        File myFile=new File("fileNew.txt");
        try{
            Scanner sc=new Scanner(myFile);
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }   

        catch(IOException e){
            System.out.println(e);
        }
            */

        //Deleting the file
        File myFile=new File("fileNew.txt");
        if(myFile.delete()){
            System.out.println("I have successfully deleted the file"+myFile.getName());

        }
        else{
            System.out.println("Some error occured while dleting the file");
        }
    }
}

