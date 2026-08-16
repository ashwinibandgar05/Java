public class nested_try_catch {
    public static void main(String[] args){
        int []arr=new int[3];
        arr[0]=12;
        arr[2]=13;
        arr[1]=14;
        
        
        try{
            System.out.println("Welcome !!");
            try{
                System.out.println(arr[4]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.println("Exception in level 2"); 

            }

        }
        catch(Exception e){
           System.out.println("Exception in level 1"); 
        }
    }
}
