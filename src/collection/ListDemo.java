package collection;
import java.util.ArrayList;
import java.util.List;

public class ListDemo
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();

        // Adding elements
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Java"); // duplicate allowed

        // Accessing elements
        System.out.println("Element at index 1: " + list.get(1));

        System.out.println("-------------------------");

        // Updating element
        list.set(2, "C#");
        System.out.println(list);

        System.out.println("-------------------------");

        // Removing element
        list.remove(0);
        System.out.println(list);

        System.out.println("-------------------------");

        // Iterating list
        for(String lang : list)
        {
            System.out.println(lang);
        }
    }
}
