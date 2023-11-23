package scdlab5;
import java.util.*;

public class q5 {
    public static void main(String[] args) {
        Set<Object> customHashSet = new HashSet<>();
        customHashSet.add("Hello");
        customHashSet.add("World");
        customHashSet.add(42);
        customHashSet.add(10);
        customHashSet.add(25);
        Iterator<Object> hashSetIterator = customHashSet.iterator();
        System.out.println("Elements in the HashSet:");
        while (hashSetIterator.hasNext()) {
            System.out.println(hashSetIterator.next());
        }
        List<Object> customArrayList = new ArrayList<>();
        customArrayList.add("Apple");
        customArrayList.add("Banana");
        customArrayList.add(5);
        customArrayList.add(15);
        customArrayList.add(30);
        Iterator<Object> arrayListIterator = customArrayList.iterator();
        System.out.println("\nElements in the ArrayList:");
        while (arrayListIterator.hasNext()) {
            System.out.println(arrayListIterator.next());
        }
    }
}
