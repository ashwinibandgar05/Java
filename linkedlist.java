import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> fruits = new LinkedList<>();

        // 1. Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("LinkedList: " + fruits);

        // 2. Add element at a specific index
        fruits.add(1, "Grapes");

        System.out.println("After adding: " + fruits);

        // 3. Add at first
        fruits.addFirst("Pineapple");

        // 4. Add at last
        fruits.addLast("Watermelon");

        System.out.println("After addFirst and addLast: " + fruits);

        // 5. Get element
        System.out.println("Element at index 2: " + fruits.get(2));

        // 6. Get first element
        System.out.println("First element: " + fruits.getFirst());

        // 7. Get last element
        System.out.println("Last element: " + fruits.getLast());

        // 8. Update element
        fruits.set(2, "Kiwi");

        System.out.println("After updating: " + fruits);

        // 9. Remove by index
        fruits.remove(1);

        System.out.println("After removing by index: " + fruits);

        // 10. Remove by value
        fruits.remove("Orange");

        System.out.println("After removing by value: " + fruits);

        // 11. Remove first
        fruits.removeFirst();

        // 12. Remove last
        fruits.removeLast();

        System.out.println("After removing first and last: " + fruits);

        // 13. Check if element exists
        System.out.println("Contains Mango: " + fruits.contains("Mango"));

        // 14. Get size
        System.out.println("Size: " + fruits.size());

        // 15. Loop through LinkedList
        System.out.println("Elements:");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 16. Clear LinkedList
        fruits.clear();

        System.out.println("After clear: " + fruits);

        // 17. Check if empty
        System.out.println("Is empty: " + fruits.isEmpty());
    }
}