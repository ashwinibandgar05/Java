public class Trycatch{
    public static void main(String[] args){
        int a=1000;
        int b=0;
        // without try
        // int c=a/b;
        // System.out.println("The result is:"+c);
        

        // With Try
        try{
            int c=a/b;
            System.out.println("The result is:"+c);
        }
        catch(Exception e){
            System.out.println("We failedd to divide .Reason:");
            System.out.println(e);

        }
    }
}