import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);   //The second 10 is ignored because a HashSet does not allow duplicates.

        System.out.println(numbers);
    }
}