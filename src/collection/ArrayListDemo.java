package collection;

import java.util.ArrayList;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Banana"); // duplicate allowed

        System.out.println(list);

        System.out.println("-------------------------");

        // Accessing element
        System.out.println("Element at index 2: " + list.get(2));

        System.out.println("-------------------------");

        // Updating element
        list.set(1, "Orange");
        System.out.println(list);

        System.out.println("-------------------------");

        // Removing element
        list.remove("Apple");
        System.out.println(list);

        System.out.println("-------------------------");

        // Iterating ArrayList
        for(String fruit : list)
        {
            System.out.println(fruit);
        }
    }
}