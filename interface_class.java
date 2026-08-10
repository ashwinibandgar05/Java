/**
 * Innerinterface_class
 */
interface Bicycle{
    int a=10;
    void applyBreak(int decrement);
    void speedUp(int increment);

}

interface Horn{
    void Hornk3g();
    void Hornmhn();
}
class AvonCycle implements Bicycle,Horn{
    public void applyBreak(int decrement){
        System.out.println("Applying Break");
    }

    public void speedUp(int decrement){
        System.out.println("Applying speed");

    }

    public void Hornk3g(){
        System.out.println("Kabhi khishi kabhi gum !!!");
    }
    public void Hornmhn(){
        System.out.println("Main hoon na....");
    }
}


public class interface_class {
    public static void main(String[] args){
        AvonCycle cycle=new AvonCycle();
        cycle.applyBreak(1);
        //You can create properties in Interfaces
        System.out.println(cycle.a);
        //You can not modify the properties in interfaces as they are final
        // cycle.a=100; ---error

        cycle.Hornk3g();
        cycle.Hornmhn();

    }
}