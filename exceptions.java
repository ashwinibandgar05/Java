// import java.io.IOException;
import java.util.Scanner;


public class exceptions{
    public static void main(String[] args){
        int []arr=new int[3];
        arr[0]=56;
        arr[1]=32;
        arr[2]=12;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array index : ");
        int ind=sc.nextInt();

        System.out.print("\n Enter the number you  want to divide the value with:");
        int number =sc.nextInt();
        try{
            System.out.println("The value of array index entered is:"+arr[ind]);
            System.out.println("The value of array-value/number is:"+arr[ind]/number);
        }
        
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);


        }
        catch(ArithmeticException e){
            System.out.println("Exception is occured");
            System.out.println(e);

        }
        // catch(IOException e){
        //     System.out.println("Exception is occured");
        //     System.out.println(e);

        // }
        catch(Exception e){
            System.out.println("Exception is occured");
            System.out.println(e);

        }

    }



}
