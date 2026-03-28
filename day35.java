// Save this file as day35.java

import java.util.*;

public class day35 {
    public static void main(String[] args) {

        System.out.println("Hello Bhumika! Welcome to Day 35 — Collections Framework (List Interface)");

        // 🔹 Using ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");
        arrayList.add("Java"); // duplicates allowed

        System.out.println("\nArrayList Elements: " + arrayList);
        arrayList.remove("C++");
        System.out.println("After removing C++: " + arrayList);
        System.out.println("Access element at index 1: " + arrayList.get(1));

        // Iterating using for-each
        System.out.println("\nIterating ArrayList:");
        for (String lang : arrayList) {
            System.out.println(" " + lang);
        }

        // Using LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.addFirst(5);
        linkedList.addLast(40);

        System.out.println("\nLinkedList Elements: " + linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("After removing first & last: " + linkedList);

        // Iterating using Iterator
        System.out.println("\nIterating LinkedList using Iterator:");
        Iterator<Integer> itr = linkedList.iterator();
        while (itr.hasNext()) {
            System.out.println("" + itr.next());
        }

        // 🔹 Combining both lists
        System.out.println("\nCombined Summary:");
        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("LinkedList size: " + linkedList.size());
        System.out.println("\nDay 35 executed successfully by Bhumika!");
    }
}
