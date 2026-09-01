/*HashMap — Quick Notes
Definition
HashMap stores data in key-value pairs.
Each key must be unique.
Values can be duplicated.
Provides fast insertion, searching, updating and deletion.
Does not guarantee order of elements.

Import
import java.util.HashMap;

Creation
HashMap<String, Integer> map = new HashMap<>();
Example:
HashMap<String, Integer> marks = new HashMap<>();

marks.put("Siri", 95);
marks.put("Ravi", 88);
marks.put("Anu", 92);

Result:

Siri → 95
Ravi → 88
Anu  → 92
=================================================================
Important Methods
Method	                   Purpose	                    Example
put()	                Add/update key-value	    map.put("A", 10);
get()	                Get value using key	        map.get("A");
remove()	            Remove key-value	        map.remove("A");
containsKey()	        Check key	                map.containsKey("A");
containsValue()	        Check value	                map.containsValue(10);
getOrDefault()	        Get value or default	    map.getOrDefault("A", 0);
size()	                Number of entries	        map.size();
isEmpty()	            Check empty	                map.isEmpty();
clear()	                Remove all	                map.clear();
entrySet()	            Get key-value pairs	        map.entrySet(); */
import java.util.HashMap;
import java.util.Map;

public class Hashmaps {

    public static void main(String[] args) {

        // 1. Create HashMap
        HashMap<String, Integer> marks = new HashMap<>();

        // 2. Store student names and marks
        marks.put("Siri", 95);
        marks.put("Ravi", 88);
        marks.put("Anu", 92);
        marks.put("Raj", 85);
        marks.put("Priya", 90);

        System.out.println("Student Marks: " + marks);

        // 3. Retrieve a value using a key
        System.out.println("Siri's marks: " + marks.get("Siri"));

        // 4. Update a value
        marks.put("Siri", 98);
        System.out.println("After updating Siri: " + marks);

        // 5. Remove a key
        marks.remove("Raj");
        System.out.println("After removing Raj: " + marks);

        // 6. Check whether a key exists
        System.out.println("Does Anu exist? "
                           + marks.containsKey("Anu"));

        // 7. Check whether a value exists
        System.out.println("Does 90 exist? "
                           + marks.containsValue(90));

        // 8. getOrDefault()
        System.out.println("Marks of Rahul: "
                           + marks.getOrDefault("Rahul", 0));

        // 9. Size
        System.out.println("Size: " + marks.size());

        // 10. Check if empty
        System.out.println("Is map empty? " + marks.isEmpty());

        // 11. Traverse using entrySet()
        System.out.println("\nStudent Details:");

        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(
                entry.getKey() + " : " + entry.getValue()
            );
        }

        // 12. Frequency of numbers
        int[] arr = {1, 2, 1, 3, 2, 1, 4, 3, 2};

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        // Print frequency
        System.out.println("\nFrequency of numbers:");

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            System.out.println(
                entry.getKey() + " : " + entry.getValue()
            );
        }

        // 13. Clear the map
        marks.clear();

        // 14. Check isEmpty()
        System.out.println("\nAfter clear: " + marks);
        System.out.println("Is map empty? " + marks.isEmpty());
    }
}