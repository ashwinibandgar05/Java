public class sumFirstNaturalNumbers {
    public static void main(String[] args){
        int x=9;
        System.out.println("Sum of first "+x+" natural numbers is :"+sumOfN(6));
 
    }
    static int sumOfN(int n){
        if(n==1){
            return 1;


        }
        else{
            return n+sumOfN(n-1);
        }
    }
}
