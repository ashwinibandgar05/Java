import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // 1. Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("ArrayList: " + fruits);

        // 2. Add element at a specific index
        fruits.add(1, "Grapes");

        System.out.println("After adding: " + fruits);

        // 3. Get element
        System.out.println("Element at index 2: " + fruits.get(2));

        // 4. Update element
        fruits.set(2, "Pineapple");

        System.out.println("After updating: " + fruits);

        // 5. Remove element by index
        fruits.remove(1);

        System.out.println("After removing by index: " + fruits);

        // 6. Remove element by value
        fruits.remove("Orange");

        System.out.println("After removing by value: " + fruits);

        // 7. Check if element exists
        System.out.println("Contains Mango: " + fruits.contains("Mango"));

        // 8. Get size
        System.out.println("Size: " + fruits.size());

        // 9. Access all elements using for loop
        System.out.println("Using for loop:");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // 10. Clear ArrayList
        fruits.clear();

        System.out.println("After clear: " + fruits);

        // 11. Check if empty
        System.out.println("Is empty: " + fruits.isEmpty());
    }
}