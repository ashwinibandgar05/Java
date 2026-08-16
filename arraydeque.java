import java.util.ArrayDeque;

public class arraydeque {
    public static void main(String[] args) {

        // Create ArrayDeque
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // 1. Add elements at the end
        deque.add(10);
        deque.add(20);
        deque.add(30);

        System.out.println("ArrayDeque: " + deque);

        // 2. Add at beginning
        deque.addFirst(5);

        // 3. Add at end
        deque.addLast(40);

        System.out.println("After adding: " + deque);

        // 4. Get first element
        System.out.println("First element: " + deque.getFirst());

        // 5. Get last element
        System.out.println("Last element: " + deque.getLast());

        // 6. Remove first element
        deque.removeFirst();

        System.out.println("After removeFirst: " + deque);

        // 7. Remove last element
        deque.removeLast();

        System.out.println("After removeLast: " + deque);

        // 8. Check element
        System.out.println("Contains 20: " + deque.contains(20));

        // 9. Get size
        System.out.println("Size: " + deque.size());

        // 10. Clear
        deque.clear();

        System.out.println("After clear: " + deque);
    }
}