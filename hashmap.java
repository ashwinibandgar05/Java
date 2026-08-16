import java.util.HashMap;

public class hashmap{
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        // Add key-value pairs
        students.put(101, "Ashwini");
        students.put(102, "Rahul");
        students.put(103, "Sneha");

        System.out.println(students);

        // Get value using key
        System.out.println(students.get(101));

        // Check key
        System.out.println(students.containsKey(102));

        // Check value
        System.out.println(students.containsValue("Sneha"));

        // Remove
        students.remove(103);

        System.out.println(students);
    }
}